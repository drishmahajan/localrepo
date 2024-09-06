package RECURSSION;

public class findall {
    static int[] help(int arr[],int index,int search,int i){
        if(index==arr.length){
            return new int[i]; 
            // for (int j = 0; j < i; j++) { 
            //     result[j] = count[j];
            // }
            //return count;
        }
        if(arr[index]==search){
            i++;
            //return help(arr, index+1, search, i+1);
           }
        int[] count = help(arr, index+1, search, i);
        if(arr[index]==search){
            count[i-1]=index;
        }
        return count;
    }
    static int[] find(int arr[],int index,int search){
        //int[] count=new int[arr.length];
        return help(arr, 0, search,0);
    }
    public static void main(String[] args) {
        int arr[]={10,200,30,50,90,10,10};
        int result[]=find(arr, 0, 10);
        for (int index : result) {
                System.out.print(index + " ");
            }
    }
}
