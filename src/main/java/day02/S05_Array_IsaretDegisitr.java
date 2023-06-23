package day02;

import java.util.Arrays;

public class S05_Array_IsaretDegisitr {
     /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */
     public static void main(String[] args) {
         int [] arr={1,2,-3,4,-5,-6 };
         for (int i=0; i< arr.length; i++){
             arr[i]*=-1;

         }
         System.out.println(Arrays.toString(arr));
     }
}
