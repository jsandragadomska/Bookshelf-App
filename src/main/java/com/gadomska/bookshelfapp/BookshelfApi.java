package com.gadomska.bookshelfapp;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookshelfApi {

    private List<Book> books;

    public BookshelfApi() {
        books = new ArrayList<>();
        books.add(new Book(1L,"Dirk Gently's Holistic Detective Agency", "Adams Douglas", LocalDate.of(2012,1,1)));
        books.add(new Book(2L,"The Hobbit", "John Ronald Reuel Tolkien", LocalDate.of(1937,9,21)));
    }

    @GetMapping("/all")
    public List<Book> getAll(){
        return books;
    }

    @GetMapping
    public Book getById(@RequestParam int index){
        Optional<Book> first = books.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addBook(@RequestBody Book book){
        return books.add(book);
    }

    @PutMapping
    public boolean updateBook(@RequestBody Book book){
        return books.add(book);
    }

    @DeleteMapping
    public boolean deleteBook(@RequestParam int index){
        return books.removeIf(element -> element.getId() == index);
    }
}
