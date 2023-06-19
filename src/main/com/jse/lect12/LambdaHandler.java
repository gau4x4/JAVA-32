package main.com.jse.lect12;


import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaHandler{

    public static void main(String[] args){
        Person some_person = new Person("Gaurav", "Someone");

        FuncInterfacePerson anchor = (p) -> System.out.print(p.toString());

        anchor.print(some_person);

        Supplier<Person> randomSupp = () -> new Person("","");
        Function<Integer,String> randomFunc=(age) -> age.toString();
        Predicate<Integer> randomPredic=(age)-> age%2 == 0;

        Integer[] nums = new Integer[100];
//        Stream.of(nums);
//        Arrays.stream(nums);
        Stream<Integer> numberStream = Stream.of(nums);
        Stream<Integer> fillInt = numberStream.filter((num)-> num == 80);

//        Intermediate operation chaining of operation
//        filter, sort, map, limit
//        terminal operation wont return array but will give some value
//        min, max, avg, sum, findFirst, some, every, count, forEach,
//        collect->Converting the stream to original type

        fillInt.toArray();

//        Stream Lambdas functional interfaces
//        Instead of chaining we can do par
        Arrays.stream(nums).parallel().mapToInt((i) -> i).sum();


    }
}
