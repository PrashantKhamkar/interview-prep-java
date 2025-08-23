package String;

import java.lang.reflect.Array;

//3. Count Vowels and Consonants
public class Q3_CountVowelsConsonants {
    public static void main(String[] args) {
        String str1 = "Prashant khamkar ii";
        str1=str1.toLowerCase();

        int vowels=0;
        int consonants=0;

        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);

            if (ch>='a' && ch<='z'){
                if (ch == 'a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

    }
}
