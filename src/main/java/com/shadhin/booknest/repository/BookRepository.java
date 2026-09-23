package com.shadhin.booknest.repository;

import com.shadhin.booknest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
