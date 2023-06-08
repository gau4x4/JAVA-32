package main.com.jse.lect05.q3;

public class StaticTest{
    static int some_data;

    public static int setData(){
        return 100;
    }
    static{
        some_data = setData();
    }
    public static void main(String []args){
        System.out.println(some_data);
//        FinalClassTest f = new FinalClassTest();
//        System.out.println(f.getData());

    }

}