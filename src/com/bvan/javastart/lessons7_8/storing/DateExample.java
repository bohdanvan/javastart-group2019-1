package com.bvan.javastart.lessons7_8.storing;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class DateExample {

    public static void main(String[] args) {
        // Java 8 (2014)

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // -------

        LocalDate now = LocalDate.now();
        LocalDate nowYearAgo = now.minusYears(1);
        DayOfWeek dayOfWeek = nowYearAgo.getDayOfWeek();
        System.out.println(dayOfWeek.name());

        System.out.println(LocalDate.now()
                .minusYears(1)
                .getDayOfWeek()
                .name());
    }
}
