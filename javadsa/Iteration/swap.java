public class swap {
    public static void main(String[] args) {
        int a = 123456;
        int count = (int) (Math.log10(a) + 1);
        int c=(int) (Math.pow(10, count - 1));
        int first = a % 10 * c;

        int last = a /c;

        int mid = a %c;

        mid = mid / 10;
        System.out.println(first + mid * 10 + last);

    }
}
