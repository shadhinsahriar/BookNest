package com.shadhin.booknest.controller;

import com.shadhin.booknest.dto.BookDTO;
import com.shadhin.booknest.entity.Book;
import com.shadhin.booknest.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookController {
    private final BookService booksService;

    public BookController(BookService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/book")
    public List<Book> getBook(){
        return booksService.getBook();
    }

    @GetMapping("/book/{id}")
    public BookDTO getBookById(@PathVariable int id){
        Book book = booksService.getById(id).orElseThrow();
        BookDTO dto = new BookDTO();

        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setPrice(book.getPrice());
        dto.setAvailable(book.getAvailable());
        dto.setPublished_date(book.getPublished_date());

        return dto;
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody BookDTO bookDTO) {

        Book book = new Book();

        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPrice(bookDTO.getPrice());
        book.setPublished_date(bookDTO.getPublished_date());
        book.setAvailable(bookDTO.getAvailable());

        booksService.createBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id) {
        booksService.deleteById(id);
    }

    @PutMapping("/books/{id}")
    public void updateBook(
            @PathVariable int id,
            @RequestBody BookDTO bookDTO) {

        Book book = new Book();

        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPrice(bookDTO.getPrice());
        book.setPublished_date(bookDTO.getPublished_date());
        book.setAvailable(bookDTO.getAvailable());

        booksService.updateBook(id, book);
    }
}
