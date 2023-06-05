public class Child extends Parent{
//    Private, setters & getters
    public void welcome(){
        super.welcome();
        System.out.println("Hello World from Child!");
    }

    public static void main(String []args){
        Parent parent = new Parent();
        parent.welcome();
        System.out.println("------------------");
        Child child1 = new Child();
        child1.welcome();
        System.out.println("------------------");
//        Upcasting
        Parent child = new Child();
        child.welcome();

    }
}