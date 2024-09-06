package RECURSSION;

public class longsubarr {
    static void len(int arr[],int count,int max,int index){
        if(index==arr.length){
            System.out.println(max);
            return;
        }
        if(arr[index-1]==arr[index]){
            count++;
            if(max<=count){
                max=count;
            }
        }
        else{
            count=1;
        }
        len(arr, count, max, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,4,4,4,5};
        len(arr,1,0,1);
        
    }
}
