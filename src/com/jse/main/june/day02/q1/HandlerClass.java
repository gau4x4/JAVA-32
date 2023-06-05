public class HandlerClass implements DemoInterface1,DemoInterface2{
    public void demoMethod1(){
        System.out.println("Overriding Method1");
    }
    public void demoMethod2(){
        System.out.println("Overriding Method2");

    }

    public static void main(String []args){
        HandlerClass hc = new HandlerClass();
        hc.demoMethod1();
        hc.demoMethod2();
    }
}