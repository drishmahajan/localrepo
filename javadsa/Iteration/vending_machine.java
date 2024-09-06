// import java.util.Scanner;

public class vending_machine {
    static void function(int num,String nu,int n){
        System.out.print(nu+" :");

       
        System.out.print(n+"$");
        System.out.println();

        System.out.print(num+"X");

        
        System.out.print(nu+" :");

       
        System.out.print(n*num+"$");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("****************************WELCOME TO VENDING MACHINE*******************************");
        System.out.println("Things in Vending Machine:");
        function(1,"COKE",20);
        function(2,"LAYS",10);
        function(3,"PROTEIN BAR",7);
        function(4,"CANDY",5);
        function(5,"COOKIES",2);
        
        // if(num==1){
        //     System.out.println("coke selected..");
        // 
    }
}
