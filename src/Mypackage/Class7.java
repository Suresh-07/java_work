package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7 {
    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your day");
        day=Integer.parseInt(br.readLine());
                switch (day) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THR");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("No weekday");

        }
    }

}
