public class Task2 {
    public static void main(String[] args) {
        System.out.println(calcSumArray(new int[]{1,2,3,4,5}));
    }

    public static int calcSumArray(int[] arr) {
        int result = 0;
        // we should change starting index from 1 to 0
        for (int i=0; i<arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}
