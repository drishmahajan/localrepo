public class list {
    public static void main(String[] args) {
        int a=33344;
        int sumofodd=0;
        int sumofeven=0;
        while(a!=0){
             sumofodd+=a%10;
            a=a/10;
           sumofeven+=a%10;
           a=a/10;
            
        }
        System.out.println(sumofodd);
        System.out.println(sumofeven);

    }
}
