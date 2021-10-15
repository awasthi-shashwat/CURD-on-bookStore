package com.example.bookStore.Books.controller;


import com.example.bookStore.Books.entity.Book;
import com.example.bookStore.Books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        List<Book> AllBooks = bookService.getAllBooks();
        return AllBooks;
    }

    @GetMapping("/books/{id}")
    public Book getThatBook(@PathVariable("id") Long id){
        Book b0 = bookService.getThatBook(id);
        return b0;
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        Book b1 = bookService.addBook(book);
        return b1;
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book){
        Book b2 = bookService.updateBook(book);
        return b2;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        String msg = bookService.deleteBook(id);
        return msg;
    }
}
