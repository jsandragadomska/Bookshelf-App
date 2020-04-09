package com.gadomska.bookshelfapp.manager;

import com.gadomska.bookshelfapp.dao.BookRepo;
import com.gadomska.bookshelfapp.dao.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class BookManager {

    private BookRepo bookRepo;

    @Autowired
    public BookManager(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Optional<Book> findById(Long id){
        return bookRepo.findById(id);
    }

    public Iterable<Book> findAll(){
        return bookRepo.findAll();
    }

    public Book save(Book book){
        return bookRepo.save(book);
    }

    public void deleteById(Long id){
        bookRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Book(1L,"Dirk Gently's Holistic Detective Agency", "Adams Douglas", LocalDate.of(2012,1,1)));
        save(new Book(2L,"The Hobbit", "John Ronald Reuel Tolkien", LocalDate.of(1937,9,21)));
    }
}
