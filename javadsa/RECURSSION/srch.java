package RECURSSION;

public class srch {
    static boolean search(int[]arr,int num,int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==num){
            return true;
        }
       return search(arr, num, index+1);
    }
    public static void main(String[] args) {
        int[]arr={20,50,30,10};
        int num=10;
        System.out.println(search( arr,num,0));
    }
}
