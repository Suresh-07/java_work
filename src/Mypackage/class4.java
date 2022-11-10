package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class4{
    public static void main(String[] args) throws IOException {
        int i;
        int j;
//        System.out.println("enter any number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=Integer.parseInt(br.readLine());
        j=Integer.parseInt(br.readLine());
        System.out.println(i>j);
        System.out.println(i==j);
        System.out.println(j!=i);
        System.out.println(i<j);
    }
}
