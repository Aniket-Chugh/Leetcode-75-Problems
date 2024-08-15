public class 06_Problem6 {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        String reversedString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i];
            if (i != 0) {
                reversedString += " ";
            }
        }


        return reversedString;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverseWords(str);
        System.out.println(result);
    }
}
