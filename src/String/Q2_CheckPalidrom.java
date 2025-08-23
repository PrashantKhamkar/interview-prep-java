package String;

//2. Check Palindrome String
public class Q2_CheckPalidrom {

     String checkPalidromString(String str){
        char[] arr = str.toCharArray();
        int left=0, right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        if (str.equals(new String(arr))){
            return "Palindrome String";
        }else {
            return "Not Palindrome String";
        }
    }

    public static void main(String[] args) {
        Q2_CheckPalidrom obj = new Q2_CheckPalidrom();
        System.out.println(obj.checkPalidromString("madam"));
        System.out.println(obj.checkPalidromString("Prashant"));
    }
}
