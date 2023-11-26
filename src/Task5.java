public class Task5 {

    public static void main(String[] args) {
        System.out.println(repFirstChar("test"));
        System.out.println(repFirstChar("Test"));
        System.out.println(repFirstChar("5est"));
        System.out.println(repFirstChar("%est"));
    }

    public static String repFirstChar(String s) {
        char c = s.charAt(0);
        if (c >= 65 && c<=90){
            return "upper";
        } else if (c >= 97 && c<=122){
            return "lower";
        } else if (c>=48 && c<=57){
            return "digit";
        } else {
            return "other";
        }
    }
}
