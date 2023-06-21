package main.com.jse.lect14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentIteration {
  public static void main(String[] args) {
    Student student1 = new Student("Joseph", "Ferguson", 3.2);
    Student student2 = new Student("Colin", "Burgess", 3.3);
    Student student3 = new Student("Rebecca", "McDonald", 3.6);
    Student student4 = new Student("Hannah", "McLean", 3.4);
    Student student5 = new Student("Brian", "Martin", 3.8);
    Student student6 = new Student("Amy", "Blake", 3.1);
    Student student7 = new Student("Karen", "Mills", 3.2);
    Student student8 = new Student("Steven", "May", 3.9);

    Student[] students = {
      student1, student2, student3, student4, student5, student6, student7, student8
    };
    Map<String, Student> studentMap = new HashMap<>();
    for (Student s : students) {
      studentMap.put(s.getFirstName(), s);
    }
    System.out.println("Printing using entrySet():");
    for (Map.Entry<String, Student> mp : studentMap.entrySet()) {
      System.out.println(mp.getKey() + ": " + mp.getValue().toString());
    }
    System.out.println("Printing using forEach:");
    studentMap.forEach((fn, s) -> System.out.println(fn + ": " + s.toString()));
    System.out.println("Printing using keySet & Iterator:");

    Iterator<String> iterator = studentMap.keySet().iterator();
    while (iterator.hasNext()) {
      String fname = iterator.next();
      System.out.println(fname + ": " + studentMap.get(fname).toString());
    }
  }
}
