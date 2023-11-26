import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task3 {

    public static int[] task3(int n) {
        int sum = 0;
        Random random = new Random();
        int[] result = new int[n];

        Set<Integer> valsSet = new HashSet<>();
        int bound = (n%2==0) ? n-1 : n-2;
        for (int i=0; i<bound; i+=2){
            int val = random.nextInt()%10;
            while (valsSet.contains(Math.abs(val)) || val == 0) {
                val = random.nextInt()%10;
            }
            valsSet.add(Math.abs(val));
            result[i] = val;
            result[i+1] = -val;
        }

        return result;
    }
}
