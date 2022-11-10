package Mypackage;

class nisu{
    private int id; private int salary;   // access modifier public, pivate, defalut, protected
    public void set(int i,int j){   //i=2345;
        id=i;                    //id=i=2345; id=2345;
        salary=j;
    }
    public int get(){
        return id;

    }
    public int getSalary(){
        return salary;
    }
}
public class New_class {
    public static void main(String[] args) {
        nisu c=new nisu();
        c.set(25487,44000);

        System.out.println(c.getSalary());
        System.out.println(c.get());

    }
}
