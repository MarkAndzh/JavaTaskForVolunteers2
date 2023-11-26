public class Task1 {

    public static String task1(int n) {
        String result = "";
        for (int i=0; i<n; i++){
            if (i%2 == 0){
                result+="+";
            } else{
                result+="-";
            }
        }

        return result;
    }
}
