package arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "restful";
        String str2 = "fluster";


        System.out.println(solve(str1, str2));

    }

    public static boolean solve(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        if (charArray1.length != charArray2.length) {
            return false;
        }

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }

        return true;
    }


}
