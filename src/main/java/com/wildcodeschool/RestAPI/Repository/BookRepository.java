package com.wildcodeschool.RestAPI.Repository;

import com.wildcodeschool.RestAPI.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.title LIKE %:keyword% OR b.description LIKE %:keyword%")
    List<Book> searchByKeyword(@Param("keyword") String keyword);
}
