package main.com.jse.lect10;

public class TaskRunner {
    public void printSomeWork(String source, int start, int end){
        for (int i = start;i<=end;i++){
             System.out.println("Printing From: " +source+" "+i);
        }
    }
}
