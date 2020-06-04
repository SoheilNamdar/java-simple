public class Main {
    public static void main(String[] args) {
        String s = "ADcvADcv", result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( 65<c || c<90) {
                c += 32;
            } else if(c>97 || c<122) {
                c -=32;
            }
            result += c;
        }
            System.out.println(result);
    }
}
