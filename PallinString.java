class Method extends PallinString{
     void StringPal(){
        String r="";
        System.out.println("enter");
        String s= "aba";

        for(int i= s.length()-1; i>=0; i--){
            r=r+s.charAt(i);
                }
                if(r.equals(s)){
                    System.out.println(r+ " is a Pallindrome");
                }
                else{
                    System.out.println(r+ " is not a Pallindrom");
                }
    }

}    public class PallinString{
        public static void main(String[] args) {
            Method g= new Method();
            g.StringPal();
        }
    }
