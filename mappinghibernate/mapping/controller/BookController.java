package com.example.mapping.controller;

import com.example.mapping.model.Book;
import com.example.mapping.service.BookService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/listBook")
    public ResponseEntity<?> displayBooks() {
        return ResponseEntity.ok(bookService.displayBooks());
    }


    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book updated = bookService.addBook(book);
        return new ResponseEntity(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public HttpStatus deleteBook(@PathVariable("bookId") Long bookId) {
        bookService.deleteBook(bookId);
        return HttpStatus.FORBIDDEN;
    }
}
