package PATTERN;

public class X {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row*2-1;i++){
            for(int j=1;j<=row*2-1;j++){
                if(i==j || j==row*2-1-i+1){
                    System.out.print("");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
