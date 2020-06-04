public class Main {
    public static void main(String[] args) {
        String s = "ADcvADcvmlokjQSQDRF", result = "";
        int n1=4, n2=9;
        for (int i = n1; i < s.length() && i<n2; i++) {
            result += s.charAt(i);
        }
            System.out.println(result);
    }
}
