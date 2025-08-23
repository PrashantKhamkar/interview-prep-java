package String;

import java.sql.SQLOutput;


//1.Reverse a String
public class Q1_ReverseString {

    public static String reverse(String str){
        char[] arr = str.toCharArray();
        int left=0,right=arr.length-1;

        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        //main is static, so it can directly call other static methods of the same class without creating an object.
        System.out.println(reverse("ABCD"));
        System.out.println(reverse("abcde"));
        System.out.println(reverse("prashant"));
    }
}
