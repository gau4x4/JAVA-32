package main.com.jse.lect13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StudentAverageHandler {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      Student student =
          new Student("Firstname" + i, "Lastname" + i, rand.nextDouble(4.0 - 3.0) + 3.0);
      students.add(student);
    }
    double avgGPA = students.stream().mapToDouble(Student::getGpa).average().orElse(0);

    final List<Student> list =
        students.stream().filter(student -> student.getGpa() >= avgGPA).toList();

    list.stream().forEach(System.out::println);
  }
}
