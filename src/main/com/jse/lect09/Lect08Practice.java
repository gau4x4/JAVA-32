package main.com.jse.lect09;

import java.io.FileInputStream;

public class Lect08Practice {
    public static void main(String[] args){
        try{

        }catch(Exception e){

        }finally{

        }
        try(FileInputStream fs = new FileInputStream("students.csv")){
                System.out.println("Inside Try:"+fs);
        }catch(Exception e){
                System.out.println(e);

        }finally{

        }

    }
}
