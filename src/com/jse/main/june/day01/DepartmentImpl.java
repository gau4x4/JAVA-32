import java.util.*;
public class DepartmentImpl extends Department{
    private int size;
    DepartmentImpl(int size){
        this.size = size;
    }
    public int getDepartmentSize(){
        //System.out.println(super.getDepartmentSize());
        return this.size;
    }
    public static void main(String []args){
        Department di = new DepartmentImpl(100);

        System.out.println(di.getDepartmentSize());
       // System.out.println(args.length);

    }
}
