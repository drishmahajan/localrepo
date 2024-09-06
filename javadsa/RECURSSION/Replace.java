package RECURSSION;

public class Replace {
    static int[] replace(int arr[],int target,int index,int num){
        if(index==arr.length){
            return arr;
        }
        if(arr[index]==num){
            arr[index]=target;
            
        }
       return replace(arr, target, index+1, num);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,50,60,50};
        int res[]=replace( arr,55,0,50);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
