package main.com.jse.lect05.practice;

public class Dog {
    int age;
    int legs;
    Dog(int age){
        super();
        this.age = age;
        this.legs = 4;
    }
    Dog(int age,int legs){
        super();
        this.age=age;
        this.legs=legs;
//        (1,new ArrayList<Integer>())
    }
    public static void main(String []args){
        Dog animal = new Dog(10);
        System.out.println("Gaurav");
    }
}