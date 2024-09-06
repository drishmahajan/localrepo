public class rotate {
    public static void main(String[] args) {
        int a=12345678;
        int rotate=2;
        int length = (int) (Math. log10(a) + 1);
        System.out.println("length is "+length);
        int diff=rotate%length;
        int dif=Math.abs(diff);
        System.out.println("Difference is "+dif);

            int c=(int)(a % Math.pow(10, dif));
            System.out.println("extracted part "+c);

            a=(int)(a / Math.pow(10, dif));
            System.out.println("Remaining part "+a);


            int z=(int)(c * Math.pow(10, length-dif));

            int hgya=z+a;
            System.out.println("Rotated no. "+hgya);
        }
    }
