package PATTERN;

public class plus {
    public static void main(String[] args) {
        int row=9;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==5||j==5){
                    System.out.print(" +");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
