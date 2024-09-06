package RECURSSION;

public class arrayissorted {
    static boolean isorted(int arr[],int index){
        if(arr.length-1==index){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isorted(arr, index+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(isorted(arr,0));
        
    }
    
}
