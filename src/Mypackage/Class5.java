package Mypackage;

public class Class5 {
    public static void main(String[] args) {
        String str="Thiruvananthapuram"; String str2="andrapradesh";
        System.out.println(str);
        System.out.println(str2);
        //lenth
        System.out.println(str.length());
        System.out.println(str2.length());
        //uppercase
        System.out.println(str.toUpperCase());
        System.out.println(str2.toUpperCase());
        //replace char
        System.out.println(str.replace('n','z'));
        System.out.println(str2.replace('n','z'));
        //cobmine
        System.out.println(str + ' ' + str2);
        System.out.println(str + str.toUpperCase());
        //removing char
        System.out.println(str.substring(4,5));
        System.out.println(str.substring(5,7));
        System.out.println(str.equals(str));
            }
}
