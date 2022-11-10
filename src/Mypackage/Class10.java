package Mypackage;

public class Class10 {
    public static void cal(int x, int y) { //void means no returning type
        if (x > y) {
            System.out.println(x - y);
        }
        else {
            System.out.println(y - x);
        }
    }
    public static void main(String[] args) {
        cal(3, 8);
        cal(5, 8);
    }
}

