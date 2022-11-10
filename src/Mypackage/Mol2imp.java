
package Mypackage;

public class Mol2imp {
    public static void main(String[] args) {
        int[] i = {2,3,4,5,8}; //length of thr array=3 //i[0]-->2,i[1]-->3,i[2]-->4...
//        int sum = 89;
//        for (int j = 1; j<i.length; j++){ //j=0,1,2,3,4,5,6 etc its depend on the length of the array
//          }
//          sum = sum + i[j];
 //       System.out.println(sum);
        //multiplication
//        int mul = 100; /// we can use any operations in that
//        for (int j = 0; j<i.length; j++){ //j=0,1,2,3,4,5,6.......// its depend on the length of the array
//            mul = mul* i[j];

            int sub = 100; /// we can use any operations in that
            for (int j = 0; j<i.length; j++){ //j=0,1,2,3,4,5,6.......// its depend on the length of the array
                sub = sub- i[j];
        }
        System.out.println(sub);
    }
}
//mul=2 j=0 i*i[0]=4
//2*2=4
//4*3==12
//12*4==24