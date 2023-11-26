import java.util.Arrays;
import java.util.Collections;

public class Task4 {

    public static int task4(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        Character[] characterArray = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            characterArray[i] = chars[i];
        }

        // This solution using sorting with have time complexity O(n*log(n))
        // because we just need to sort and reassemble number

//        Arrays.sort(characterArray, Collections.reverseOrder());
//        String result = "";
//        for (int i=0; i<characterArray.length; i++){
//            result += characterArray[i];
//        }

        // Because there is limited set of integers (0..9)
        // this problem could also be solved using Bucket sort
        // which would give us time complexity of O(n)
        int bucket[] = new int[10];
        for (Character ch: characterArray) {
            int numericCharValue = Character.getNumericValue(ch);
            bucket[numericCharValue]++;
        }

        // After that I can just go from right to left and put values to the resulting array
        // and we will get maximal number
        String result = "";
        for (int i=bucket.length-1; i>0; i--){
            while(bucket[i] != 0){
                result += i;
                bucket[i]--;
            }
        }

        return Integer.valueOf(result);
    }
}
