package com.cursor.main.java.hw7.executor;

import com.cursor.main.java.hw7.task1.Library;
import com.cursor.main.java.hw7.task2.NewLibrary;

import java.time.LocalDate;

public class AppExecutor {

    public static void start(){

        Library library=new Library();
        library.putBooks();
        library.listBooks();
        library.checkForBooks(LocalDate.of(2019,10,15));
        library.DayITookTheBooks();


       NewLibrary newLibrary=new NewLibrary();
       newLibrary.returnBook(LocalDate.of(2019,10,1), LocalDate.of(2019,11,1));
    }
}