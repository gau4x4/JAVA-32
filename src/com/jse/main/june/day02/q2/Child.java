public class Child extends Parent{
    private int c_data;

    Child(int p_data,int c_data){
        super(p_data);
        this.c_data = c_data;
    }
    Child(int c_data){
        this.c_data = c_data;
    }

    public static void main(String []args){
        Parent child = new Child(10,10);
    }
}