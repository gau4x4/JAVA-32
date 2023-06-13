package main.com.jse.lect09;
public class ExceptionAssignment {
    public static int toNumerical(String str) throws NumberFormatException{
        try{
            return Integer.valueOf(str);
        }catch(NumberFormatException nfe){
            throw new NumberFormatException("Number format Exception");
        }
    }
    public static void main(String[] args){
        String s1= "23",s2= "45.67" ,s3= "test",s4= "123f";
        try{
            System.out.println(toNumerical(s1));
            System.out.println(toNumerical(s2));
            System.out.println(toNumerical(s3));
            System.out.println(toNumerical(s4));
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
