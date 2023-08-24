package com.techreturners.exercise004;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.*;

public class Exercise004 {

    public Exercise004(LocalDate date) {
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }

    public Exercise004(LocalDateTime dateTime) {
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }
    static long            increment = 1000000000;
    public LocalDateTime getDateTime(LocalDateTime dateTime) {
         return dateTime.plusSeconds(increment);
    }
}
