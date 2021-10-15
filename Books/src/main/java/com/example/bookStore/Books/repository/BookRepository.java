package com.example.bookStore.Books.repository;

import com.example.bookStore.Books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<Book, Long> {
}
