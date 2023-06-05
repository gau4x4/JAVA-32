final class FinalClassTest{
    final  int some_Other_data = 8282;

    final void getData(){
        System.out.println("Test in Progress..."+this.some_Other_data);
    }
    public static void main(String []args){
        FinalClassTest fct = new FinalClassTest();
        fct.getData();
    }

}