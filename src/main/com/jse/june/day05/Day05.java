import java.util.*;
public class Day05{
    public static String ageCalcHandler(int age){
        if(age < 13){
            return "kid";
        }
        else if(age >= 13 && age <20){
            return "teen";
        }
        else{
            return "adult";
        }
    }

    public static List<String> fizzBuzz(int num){
        List<String> result = new ArrayList<>();
        int i = 1;
        while(i <= num){
            if(i%3 == 0 && i%5 != 0){
                result.add("fizz");
            }else if(i%5 == 0 && i%3 != 0){
                result.add("buzz");
            }else if(i%5==0 && i %3==0){
                result.add("fizzbuzz");
            }
            else{
                result.add(i+"");
            }
            i++;
        }
        return result;

    }
    public static int reverse(int num){
        int reversedInt = 0;
        while(num != 0){
            int carry = num%10;
            reversedInt +=carry;
            reversedInt *= 10;
            num /= 10;
        }
        reversedInt /= 10;
//        if(num <0)
//            return (-1)*newNum;

        return reversedInt;
    }
    public static int fibnocci(int num){
        if(num == 0 || num == 1)
            return num;

         int f1 = fibnocci(num-2);
         int f2 = fibnocci(num-1);
        int result = f1+f2;

        return result;
    }
    public static void main(String []args){
        int num = 139883783;
//        Reverse Int
        System.out.println(reverse(12345));
        System.out.println(reverse(100));
        System.out.println(reverse(0));
        System.out.println(reverse(-1110));
//        FizzBuzz
        List<String> list = new ArrayList<>();
        list = fizzBuzz(100);
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i) + " ");

//        Fibnocci Series

       for(int i = 0;i<10;i++){
           System.out.print(fibnocci(i) +" ");
       }
       System.out.println(ageCalcHandler(100));
//        System.out.println(ret());

    }
}