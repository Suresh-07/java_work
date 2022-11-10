package Mypackage;

import java.awt.*;
import java.util.ArrayList;

public class Class9str {
    public static void main(String[] args) {
//        //strin (i and j rember point) * int varible we can write in loop after main
//        //array we used to same type of values in arrays
////        int[] i=new int[15];
////        i[0]=11; i[1]=12; i[2]=13; i[3]=14; i[4]=15;i[5]=16; i[6]=17; i[7]=18; i[9]=19;
////        System.out.println(i.length);
////        for(int j=0;j<i.length-1;j++) {
////            System.out.println(i[j]);
//
////            String[]str= new String[6];
////            str[0]="suri";
////            System.out.println(str[5]);
////            System.out.println(str.length);
//
////        String[] str=new String[6]; //declearing an array and alloacting the space for it
//        String str[]={"suresh","Nivvi","ramesh","harsha","BG","hampa"}; // declaring and initilating in the same line
////create a string arrya and store 5 values in it and ittrate using for loop share limit should be set using
//
////        str[0]="Suresh";
////        str[1]="Nivvi";
////        str[2]="Harsha";
////        str[3]="Kavya";
////        str[4]="BG";
////        str[5]="Hampa";
//        System.out.println(str.length);
//        for(int j=0;j<=str.length-1;j++){ //j<=str length-1 //if j<str length
//            System.out.println(str[j]);

        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(20);    //it will store in 0 index
        i.add(23); //1 th
        i.add(28); // 2 nd
        i.add(30);
        i.add(4,121);   //  adding value and interchange the order( element is value index is order no )
    //    i.remove(2);
        System.out.println(i);
        System.out.println(i.isEmpty());   //its showing true or flase (checking value is there )
       }

        }

