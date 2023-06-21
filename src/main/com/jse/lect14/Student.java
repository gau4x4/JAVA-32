package main.com.jse.lect14;

public class Student {
  private String firstName;
  private String lastName;
  private double gpa;

  public Student(String firstName, String lastName, double gpa) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gpa = gpa;
  }

  public String getFirstName() {
    return firstName;
  }

  @Override
  public String toString() {
    return "Student{"
        + "firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", gpa="
        + gpa
        + '}';
  }
}
