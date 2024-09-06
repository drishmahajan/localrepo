package RECURSSION;

public class reversse {
    static void reverse(int arr[],int start,int index){
        if(start>=index){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[index];
        arr[index]=temp;
        reverse(arr, start+1, index-1);
    }
    static void print(int arr[],int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        print(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,9};
        reverse(arr, 0, arr.length-1);
        print(arr, 0);
        

    }
}
