package Mypackage;

public class Class12 {
//    public static void area(int r){   //void= non returning
//        double arg=3.14*r*r;
//        System.out.println(arg);
//    }
//    public static void perimeter(int r){ // we can use anything data type in that like string
//        double per=2*3.14*r;
//        System.out.println(per);
//    }
//    public static void main(String[] args) {
//        //take a radius circle and its area(pie*r^2) and parameters(2pie*r)
//    Class12 c12=new Class12();
//    c12.area(4);
//    c12.perimeter(5);
//    public static void name(String str){
//        System.out.println(str);
//    }
//    public static void age(int a){
//        System.out.println(a);
//    }
//    public static void main(String[] args){
//        Class12 sur=new Class12();
//        sur.name("Suresh");
//        sur.age(25);

//return type
//      public static double area(int r){
//          double arg=3.14*r*r;
//          return arg;
//    }
//    public static void main(String[] args){
//          Class12 sst=new Class12();
//          sst.area(656);

////for more values using array
//       public static int area(int r, int... arr) {  //...arr is method called varcahr (arr -we can namme anything ) //void= non returning // ex array{2 3 5 6 7 8} int r = {4 5 6 6 7}
//        double arg = 3.14 * r * r;
//        System.out.println(arg);
//        }return arg;
//        }
//public static void main(String[] args){
//        Class12 sst=new Class12();
//        // i want different radius values
//        sst.area(656,5,5,5,5,5,5,522,3,2,3,2,3,2,5,2,5,25,1);
//        }

        public static int prod(int... numbers) {    // varchar   int[] numbers={2,4,5,4,5}

                int product = 1;
                for (int j = 0; j < numbers.length; j++) {   // o,1,2,3,4
                        product = product * numbers[j];
                }
                return product;
        }
        public static int sum(int...num){
                int sum = 1;
                for (int j = 0; j < num.length; j++) {
                        sum = sum + num[j];
                }
                return sum;
        }
        public static int sub(int...subs) {
                int sub = 1;
                for (int j = 0; j < subs.length; j++) {
                        sub = sub - subs[j];
                }
                return sub;
        }

        public static void main(String[] args) {

                Class12 cw = new Class12();
                // i want product of any 3 three numbers. 23,34,45

                System.out.println(cw.prod(1, 2, 3, 4, 5, 6));
                System.out.println(cw.sum(3,3,2,5,5,5,6,8));
                System.out.println(cw.sub(99,9,98,5,5,6,7,-54,6));
        }
}