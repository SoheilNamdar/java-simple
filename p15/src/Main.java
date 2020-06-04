public class Main {
    public static void main(String[] args) {
        String s = "ADcvADcvmlokjQSQDRF", result = "";
        String s1 = "";
        for (int i = 0; i < s.length() ; i++) {
          //  s1 +=s.charAt(i);
            for (int j = i; j < s.length() ; j++) {
               s1 =subString(s, i, j+1);
                //s1 =s.substring(i,j+1);
            }
            System.out.println("#" + i +  " :" + s1);
            s1 = "";
        }



    }
    public static String subString(String input, int index1, int index2){
        //String s = "ADcvADcvmlokjQSQDRF",
        String result = "";
        int n1=4, n2=9;
        for (int i = index1; i < input.length() && i<index2; i++) {
            result += input.charAt(i);
        }
        return result;
    }
}
