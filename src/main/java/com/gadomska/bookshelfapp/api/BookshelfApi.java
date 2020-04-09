package com.gadomska.bookshelfapp.api;

import com.gadomska.bookshelfapp.dao.entity.Book;
import com.gadomska.bookshelfapp.manager.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookshelfApi {

    private BookManager bookManager;

    @Autowired
    public BookshelfApi(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @GetMapping("/all")
    public Iterable<Book> getAll(){
        return bookManager.findAll();
    }

    @GetMapping
    public Optional<Book> getById(@RequestParam Long index){
        return bookManager.findById(index);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookManager.save(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookManager.save(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestParam Long index){
        bookManager.deleteById(index);
    }
}
