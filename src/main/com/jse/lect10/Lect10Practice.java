package main.com.jse.lect10;

import java.io.FileInputStream;

public class Lect10Practice {
    public static void main(String[] args){
        try{

        }catch(Exception e){

        }finally{

        }
//        try with resources
        try(FileInputStream fs = new FileInputStream("students.csv")){
                System.out.println("Inside Try:"+fs);
        }catch(Exception e){
                System.out.println(e);

        }finally{

        }

    }
}
