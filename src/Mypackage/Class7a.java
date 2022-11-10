package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7a {
    public static void main(String[] args) throws IOException {
        /*int colourname;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" colour name ");*/
        /*colourname = Integer.parseInt(br.readLine());*/
        /*switch (colourname) {*/
        /*    case 1:*/
        /*        System.out.println("colour name is red")*/
        ;
        /*        break;*/
        /*    case 2:*/
        /*        System.out.println("colour is black");*/
        /*        break;*/
        /*    case 3:*/
        /*        System.out.println("colour is pink");*/
        /*        break;*/
        /*    default:*/
        /*        System.out.println("no colour in list");*/

        int ch;
        System.out.println("enter a number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ch = Integer.parseInt(br.readLine());
        switch (ch %2) {
            case 0:
                System.out.println("even number");
                break;
            case 1:
                System.out.println("odd number");
                break;
            default:
                System.out.println("Wrong value");

        }
    }
}

