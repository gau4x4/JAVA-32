package main.com.jse.lect12;

public class Person {
    private String name;
    private String who;

    public Person(String name, String who) {
        this.name = name;
        this.who = who;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", who='" + who + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
