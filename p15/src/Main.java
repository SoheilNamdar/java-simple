public class Main {
    public static void main(String[] args) {
        String s = "ADcvADcvmlokjQSQDRF", result = "";
        String s1 = "";
        for (int i = 0; i < s.length() ; i++) {
            s1 +=s.charAt(i);
            for (int j = i; j < s.length() ; j++) {
                s1 +=s.charAt(j);
            }
            System.out.println("#" + i +  " :" + s);
            s1 = "";
        }

    }
}
