package Mypackage;

public class Mol {
    public static void cal(){
        System.out.println("Suresh");
    }
//    public static void cal1(int z){
//        System.out.println("Suresh"+z);
      public static void cal(String str){
        System.out.println("Suresh  "+str);
    }
      public static void cal1(int z){
        System.out.println(z);
      }
        public static void main(String[] args) {
        Mol n=new Mol(); // instance cresting objects
        n.cal("love Nivvi"); //method over loading
        n.cal1(24);
        n.cal(); ///don't repeat you .don't repeat the logic again and again

    }
}
