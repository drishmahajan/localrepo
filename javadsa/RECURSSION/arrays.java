package RECURSSION;

public class arrays {
    static void arr(int[] ar1,int[] ar2,int[] arr,int i,int j,int k){
        if(k==arr.length){
            for(int x=0;x<arr.length;x++){
                System.out.print(arr[x]+" ");
            }
            return;
        }
        else if(i==ar1.length){
            arr[k]=ar2[j];
            j++;
            
        }
        else if(j==ar2.length){
            arr[k]=ar1[i];
            i++;
            
        }
        else if(ar1[i]<ar2[j]){
            arr[k]=ar1[i];
            i++;
           
        }
        else if(ar1[i]>ar2[j]){
            arr[k]=ar2[j];
            j++;
        }
        else{
            arr[k]=ar1[i];
            arr[k]=arr[j];
            i++;
            j++;
        }
        k++;
        arr(ar1,ar2,arr,i,j,k);
    

    }
    public static void main(String[] args) {
        int[]ar1={2,8,14,19};
        int[]ar2={3,9,15,20,30};
        int[]arr=new int[ar1.length+ar2.length];
        arr(ar1,ar2,arr,0,0,0);

    }
}
