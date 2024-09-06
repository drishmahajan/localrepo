package RECURSSION;

public class integerarray {
    static int[] arrays(int arr[],int ind1,int ind2,int count){
        int[] counts=new int[2];
        if(count==arr.length){
            counts[0]=ind1;
            counts[1]=ind2;
            return counts;
        }
        if(arr[ind1]>0){
            ind1++;

        }
        else{
            ind2++;
        }
        return arrays( arr, ind1, ind2, count+1);
        
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,-1,-2,3,-3};
        int ar[]=arrays(arr,0,0,0);
        for (int index = 0; index < ar.length; index++) {
            System.out.println(ar[index]);
        }
    }
}
// 1234 3456