package com.gadomska.bookshelfapp.dao;

import com.gadomska.bookshelfapp.dao.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository <Book, Long> {

}
