package com.shadhin.booknest.service;

import com.shadhin.booknest.entity.Book;
import com.shadhin.booknest.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    public final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBook(){
        return bookRepository.findAll();
    }

    public Optional<Book> getById(int id){
        return bookRepository.findById(id);
    }

    public void deleteById(int id){
        bookRepository.deleteById(id);
    }

    public Book updateBook(int id, Book updatedBook){
        Book book = bookRepository.findById(id).orElseThrow();

        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setPrice(updatedBook.getPrice());
        book.setPublished_date(updatedBook.getPublished_date());
        book.setAvailable(updatedBook.getAvailable());

        return bookRepository.save(book);
    }
}
