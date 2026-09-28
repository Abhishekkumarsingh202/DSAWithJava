public class CleanStringExample {

    public static String cleanString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cleanString("2mad3")); // mad
    }
}
