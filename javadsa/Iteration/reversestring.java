public class reversestring {
    public static void main(String[] args) {
        String s="namn";
        String d="";
        for(int i=s.length()-1;i>=0;i--){

             d +=s.charAt(i);

        }
        System.out.println(d);
        System.out.println(s);
        if(s.equals(d)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not pal");
        }
    }
}
