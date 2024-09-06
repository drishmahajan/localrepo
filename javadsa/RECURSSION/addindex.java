package RECURSSION;

import java.util.Arrays;

public class addindex {
    static int sum(int num){
        if(num==0){
            return 0;
        }
       return num % 10+sum(num/10);
    }
    static int[] arrays(int arr[],int i){
        if(i==arr.length){
            return new int[arr.length];
        }
       int[] cout=arrays(arr,i+1);
       cout[i]=sum(arr[i]);
       return cout;
     }
    public static void main(String[] args) {
        int[]arr={1234,2410};
        System.out.println(Arrays.toString(arrays(arr, 0)));

    }
}
//panagram
//atoi
