public class ReverseTheSen {
    public static void main(String[] args) {
        String str = "Hello            World    Java ";
        String result = "", word = "";
        boolean spaceFound = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;
                spaceFound = false;
            } else if (!spaceFound) {
                result += word + " ";
                word = "";
                spaceFound = true;
            }
        }
        result += word;
        System.out.print(result.trim());
    }
}
