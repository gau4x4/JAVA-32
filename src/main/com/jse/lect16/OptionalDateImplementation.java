package main.com.jse.lect16;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDateImplementation {
  //    Write a method that takes a string as input and returns the length of the string. However,
  // if the input string is null, the method should return an empty Optional.
  //    Create a method that takes an Optional as input and returns the string in uppercase. If the
  // Optional is empty, return an empty Optional.
  //    Write a program that calculates the age of a person given their birthdate using the Java 8
  // Date and Time API.
  //    Given a list of dates, find the earliest and latest dates using the Java 8 Date and Time
  // API.
  //    Given a specific date, calculate the number of working days (excluding weekends) until the
  // end of the month using the Java 8 Date and Time API.
  //  Calculating String length with the Optional
  public static Optional<Integer> getOptionalStrLength(String str) {
    if (str == null) return Optional.empty();
    return Optional.of(str.length());
  }
  // Converting a given string to uppercase with the help of Optional
  public static Optional<String> getOptionalStrToUpperCase(Optional<String> input) {
    if (input.isEmpty()) return Optional.empty();
    return input.map(String::toUpperCase);
  }
  //  Calculating Age
  public static int calculateAge(LocalDate birthdate, LocalDate currentDate) {
    return Period.between(birthdate, currentDate).getYears();
  }
  // Calculating Earliest Date out of a given List of Dates
  public static LocalDate getEarliestDate(List<LocalDate> dates) {
    return dates.stream().min(LocalDate::compareTo).orElse(null);
  }
  // Calculating Latest Date out of a given List of Dates

  public static LocalDate getLatestDate(List<LocalDate> dates) {
    return dates.stream().max(LocalDate::compareTo).orElse(null);
  }
  //  Calculating Total working day starting from a given date till the end of the month
  public static int getWorkingDays(LocalDate startDate) {
    LocalDate endOfMonth = startDate.withDayOfMonth(startDate.lengthOfMonth());
    System.out.println(DayOfWeek.SATURDAY);
    int workingDays = 0;
    while (!startDate.isAfter(endOfMonth)) {
      if (startDate.getDayOfWeek() != DayOfWeek.SATURDAY
          && startDate.getDayOfWeek() != DayOfWeek.SUNDAY) workingDays++;
      //       if (!startDate.getDayOfWeek().toString().equals("SATURDAY")
      //          && !startDate.getDayOfWeek().toString().equals("SUNDAY")) workingDays++;

      startDate = startDate.plusDays(1);
    }

    return workingDays;
  }

  public static void main(String[] args) {
    //    Question 1 Method Handling
    String str1 = "Hello, world!";
    String str2 = null;

    Optional<Integer> length1 = getOptionalStrLength(str1);
    Optional<Integer> length2 = getOptionalStrLength(str2);

    if (length1.isPresent()) {
      System.out.println("Length of String1: " + length1.get());
    } else {
      System.out.println("String1 is null.");
    }
    if (length2.isPresent()) {
      System.out.println("Length of String2: " + length2.get());

    } else {
      System.out.println("String2 is null.");
    }
    System.out.println("=============================================");
    //    Handling Conversion to Uppercase
    Optional<String> optionalString1 = Optional.of("Hello, world!");
    Optional<String> result1 = getOptionalStrToUpperCase(optionalString1);
    Optional<String> optionalString2 = Optional.empty();
    Optional<String> result2 = getOptionalStrToUpperCase(optionalString2);
    if (result1.isPresent()) {
      System.out.println("Length of String1: " + result1.get());
    } else {
      System.out.println("Optional string is empty.");
    }
    if (result2.isPresent()) {
      System.out.println("Length of String2: " + result2.get());
    } else {
      System.out.println("Optional string is empty.");
    }
    System.out.println("=============================================");

    //    Handling Calculation of Age
    LocalDate birthdate = LocalDate.of(1995, 4, 22);
    LocalDate currentDate = LocalDate.now();

    int age = calculateAge(birthdate, currentDate);
    System.out.println("You Age is: " + age);
    System.out.println("=============================================");

    //    Handling Calculation of Earliest & Latest
    List<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(2019, 4, 22));
    dates.add(LocalDate.of(2020, 4, 22));
    dates.add(LocalDate.of(2021, 4, 22));
    dates.add(LocalDate.of(2022, 4, 22));

    LocalDate earliestDate = getEarliestDate(dates);
    LocalDate latestDate = getLatestDate(dates);

    System.out.println("Earliest Date from the Given List: " + earliestDate);
    System.out.println("Latest Date from the Given List: " + latestDate);
    System.out.println("=============================================");

    // Handling Calculation of Working days
    LocalDate startDate = LocalDate.of(2023, 7, 10);

    int workingDays = getWorkingDays(startDate);

    System.out.println("Total working days from: " + startDate + " is " + workingDays);
  }
}
