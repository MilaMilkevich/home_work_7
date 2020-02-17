package com.cursor.main.java.hw7.task1;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<LocalDate, String> library = new HashMap<>();

    public void putBooks() {
        library.put(LocalDate.of(2019, 9, 15), "Disappearing Earth");
        library.put(LocalDate.of(2019, 9, 16), "The Topeka School");
        library.put(LocalDate.of(2019, 9, 20), "Exhalation");
        library.put(LocalDate.of(2019, 10, 2), "Lost Children Archive");
        library.put(LocalDate.of(2019, 10, 9), "Night Boat to Tangier");
        library.put(LocalDate.of(2019, 10, 14), "Say Nothing");
        library.put(LocalDate.of(2019, 10, 15), "The Club");
        library.put(LocalDate.of(2019, 10, 20), "The Yellow House");
        library.put(LocalDate.of(2019, 10, 28), "No Visible Bruises");
    }

    public void printBooks() {
        Collection<String> listBooks = library.values();
        System.out.println("List of books that I took in the library: " + listBooks);
    }

    public void checkForBooks(LocalDate date) {
        if (library.get(date) == null) {
            System.out.println("You have no books for: " + date);
        } else {
            System.out.println("You took the following books:" + library.get(date) + " on " + date);
        }
    }

    public void tookBook() {
        System.out.println("List of dates when books were taken: " + library.keySet());
    }
}
