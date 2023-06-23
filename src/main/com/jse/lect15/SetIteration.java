package main.com.jse.lect15;

import main.com.jse.lect14.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Joseph");
    set.add("Colin");
    set.add("Burgess");
    set.add("Rebecca");
    set.add("McDonald");
    set.add("Hannah");
    set.add("Brian");
    set.add("Amy");
    set.add("Karen");
    set.add("Steven");
    System.out.println("Iteration via forEach:");
    set.forEach(s -> System.out.println(s));

    Iterator<String> itr = set.iterator();
    System.out.println("Iteration via Iterator:");

    while (itr.hasNext()) System.out.println(itr.next());
    System.out.println("Iteration via streams:");
    set.stream().forEach(s -> System.out.println(s));
  }
}
