package PATTERN;

public class Hlw_Square {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                for(int k=1;k<6-j;k++){
                    System.out.print(row);
                }

                // if(i==9||i==1||j==1||j==9){
                //     System.out.print("5");
                // }
                // else if(i==8||i==2||j==2||j==8){
                //     System.out.print("4");
                // }
                // else if(i==7||i==3||j==3||j==7){
                //     System.out.print("3");
                // }
                // else if(i==6||i==4||j==4||j==6){
                //     System.out.print("2");
                // }
                // else if(i==5||i==5||j==5||j==5){
                //     System.out.print("1");
                // }
                
            }
            
            System.out.println();
}}}