package com.cursor.main.java.hw7.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewLibrary {
    private Map<LocalDate, ArrayList<String>> listOfBook = new HashMap<>();

    private void putBook(LocalDate date, String name) {
        if (listOfBook.get(date) == null) {
            listOfBook.put(date, new ArrayList<>() {{
                add(name);
            }});
        } else {
            listOfBook.get(date)
                    .add(name);
        }
    }

    public void returnBook(LocalDate firstDay, LocalDate lastDay) {
        putBook(LocalDate.of(2019, 10, 1), "Disappearing Earth");
        putBook(LocalDate.of(2019, 10, 1), "The Topeka School");
        putBook(LocalDate.of(2019, 10, 2), "Exhalation");
        putBook(LocalDate.of(2019, 10, 2), "Lost Children Archive");
        putBook(LocalDate.of(2019, 10, 9), "Night Boat to Tangier");
        putBook(LocalDate.of(2019, 10, 10), "Say Nothing");
        putBook(LocalDate.of(2019, 10, 14), "The Club");
        putBook(LocalDate.of(2019, 10, 20), "The Yellow House");
        putBook(LocalDate.of(2019, 10, 30), "No Visible Bruises");


        for (LocalDate date = firstDay; date.isBefore(lastDay); date = date.plusDays(1)) {
            System.out.println(date + " - " + listOfBook.getOrDefault(date, new ArrayList<>()).size());
        }
    }
}
