public class Problem2 {

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }
    public static void main(String[] args) {

       String t = "ABAB" ;
       String s = "ABABAB";


System.out.println(gcdOfStrings(s,t));

    }
}
