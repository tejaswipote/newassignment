package com.example.mapping.service;

import com.example.mapping.model.Book;
import com.example.mapping.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public Book addBook(Book book) {
        book = bookRepository.save(book);
        return book;
    }


    public List<Book> displayBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }

}
