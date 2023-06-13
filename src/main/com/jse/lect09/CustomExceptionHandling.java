package main.com.jse.lect09;
public class CustomExceptionHandling {
    public static int divide(int dividend, int divisor) throws CustomException{
        try{
            return dividend / divisor;
        }catch(Exception e){
            throw new CustomException("Division by zero");
        }
    }
    public static void main(String[] args) {
        try {
            int result = 0;
            result = divide(10, 0);
            System.out.println("Result: " + result);
            System.out.println(ExceptionAssignment.toNumerical("45.67"));
        } catch (ArithmeticException | CustomException | NumberFormatException e) {
                System.out.println(e.getMessage());
        }
    }

}
