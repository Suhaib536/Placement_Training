public class TheNumCharRep {
    static String in = "t6hj7ui";
    public static void main(String[] args) {
        withFun();
    }
    static void withFun() {
        for(int i = 0; i<in.length(); i++) {
            if(Character.isLetter(in.charAt(i))) {
                System.out.print(in.charAt(i));
            }
            else if(Character.isDigit(in.charAt(i))) {
                int lim = in.charAt(i)-'0';
                for(int j = 0; j<lim-1; j++) {
                        if(i>1) {
                            System.out.print(in.charAt(i-2) +""+ in.charAt(i-1));
                        }
                        else
                            System.out.print(in.charAt(i-1));
                }
            }
        }
    }
}
