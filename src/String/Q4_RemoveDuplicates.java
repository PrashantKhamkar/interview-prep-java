package String;

//4. Remove Duplicate Characters from a String
public class Q4_RemoveDuplicates {

    public static void main(String[] args) {

        String str = "prashant";
        str=str.toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if(result.indexOf(String.valueOf(ch))==-1){
                //if char not already in result
                result.append(ch);
            }
        }

        System.out.println("Intput: "+str);
        System.out.println("Output: "+result.toString());

    }
}
