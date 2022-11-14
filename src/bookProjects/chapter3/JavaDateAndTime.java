package bookProjects.chapter3;

import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class JavaDateAndTime {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022, Month.NOVEMBER, 20);
        LocalDate date3 = LocalDate.of(2022, 11, 20);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        LocalDateTime dateTime1 = LocalDateTime.of(2022, Month.APRIL, 1, 11, 35, 54, 350);
        LocalDateTime dateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());

    }

}
