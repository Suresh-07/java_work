package Mypackage;
class Suresh{    // acess modifier
    int id; String surname; int age; String friendname;
    public void met(){
        System.out.println(id);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(friendname);

    }
    public void  met1(){
        int x=id*2;
        System.out.println(x);
        System.out.println(surname.length());
    }
}
public class Class12a {

    public static void main(String[] args) {
        Suresh su=new Suresh();
        su.id=174;
        su.surname="Talakal";
        su.met();
        su.met1();
    }
}


