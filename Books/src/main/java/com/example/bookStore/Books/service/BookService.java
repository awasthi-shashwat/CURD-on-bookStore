package com.example.bookStore.Books.service;

import com.example.bookStore.Books.entity.Book;
import com.example.bookStore.Books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        List<Book> AllBooks = bookRepository.findAll();
        return AllBooks;
    }

    public Book addBook(Book book) {
        Book b1 = bookRepository.save(book);
        return b1;
    }

    public Book updateBook(Book book) {
        Optional<Book> b2 = bookRepository.findById(book.getId());
        b2.get().setPrice(book.getPrice());
        bookRepository.save(b2.get());
        return b2.get();
    }

    public String deleteBook(Long id) {
        Book b3 = bookRepository.findById(id).get();
        try{
            bookRepository.delete(b3);
            return "Successfully deleted";
        }
        catch (Exception e){
            return "Can't find the book";
        }
    }

    public Book getThatBook(Long id) {
        Book b0 = bookRepository.findById(id).get();
        return b0;
    }
}
