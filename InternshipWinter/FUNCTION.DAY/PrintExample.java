public class PrintExample {

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

    public static void print2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(cleanString(arr[i]));
        }
    }

    public static void main(String[] args) {
        String[] input = {"ben10", "2sad"};
        print2(input);
    }
}