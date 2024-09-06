package RECURSSION;

public class subsetsum {
    static int subset(int arr[],int target,int i){
        // if(target==0) return 1;
        // if(i<=0) return 0;
        // int exclude=subset(arr, target, i-1);
        // int include=0;
        // if(arr[i-1]<=target){
        //     include=subset(arr, target-arr[i-1],i-1);
        // }
        // return include+exclude;
        if(i==arr.length){
            if(target==0){
                return 1;
            }
            return 0;
        }
        return subset(arr, target, i+1)+subset(arr, target-arr[i], i+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int target=4;
        System.out.println(subset(arr,target,0));
    }
}
