import java.util.Scanner;

public class Peterson {
    public static int factorial(int a){
        int factor=1;
        for(int i=1;i<=a;i++){
            factor*=i;
        }
        return factor;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number:");
        int num = scanner.nextInt();
        int original = num;
        int cube=0;
        while (num != 0) {
            int b = num % 10;
            int xy=factorial(b);
            cube += xy;
            num /= 10;
        }
        if (cube != original) {
            System.out.println("NOT AN PETERSON NO.");
        } else {
            System.out.println("PETERSON NO.");
        }
        scanner.close();
    }
}
