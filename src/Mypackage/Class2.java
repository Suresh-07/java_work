package Mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class2 {
    public static void main(String[] args) throws IOException {
        int i; int j;
        System.out.println("Enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        i=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        j=Integer.parseInt(br.readLine());   // String.parseString()
        int rem=j%i;
        int sum=i+j;
        int mul=i*j;
        int sub=i-j;
        int div=i/j;
        System.out.println(sum);
        System.out.println(rem);
        System.out.println(mul);
        System.out.println(sub);
        System.out.println(div);


    }
}