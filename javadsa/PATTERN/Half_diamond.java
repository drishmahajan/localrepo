package PATTERN;

public class Half_diamond {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print("");
            }
            System.out.println();
        }
        for(int i=1;i<=row-1;i++){
            for(int x=1;x<=row-i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
