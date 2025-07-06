package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    //setter based injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(String title){
        System.out.println("Adding book: "+title);
        bookRepository.saveBook(title);
    }

    public void displayAll(){
        System.out.println("------------------------------------");
        bookRepository.getBooks().forEach(System.out::println);
    }
}
