import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number:");
        int num = scanner.nextInt();
        int original = num;
        int cube = 0;
        while (num != 0) {
            int digit = num % 10;
            int cob = digit * digit * digit;
            cube += cob;
            num /= 10;
        }
        if (cube != original) {
            System.out.println("NOT AN ARMSTRONG NO.");
        } else {
            System.out.println("ARMSTRONG NO.");
        }
        scanner.close();
    }
}
