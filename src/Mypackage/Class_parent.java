package Mypackage;
class suri {    // parent
    public int cal(int x, int y){
        int d=4;
        return x+y;
    }
}

class nii extends suri{      //child
    public int cal_adv(int x, int y){
        return x-y;
    }
}
class har extends nii{
    public int cal2(int x,int y){
        return x*y;
    }
}
class  bg extends har{
    public int cal3(int x, int y){
        return x%y;
    }
}
public class Class_parent {
    public static void main(String[] args) {
        nii a=new nii();   // object of child
        har h=new har();
        bg g=new bg();
        System.out.println(a.cal(2,5));
        System.out.println(h.cal2(5 ,6));
        System.out.println((g.cal3(10,25)));
    }
}

