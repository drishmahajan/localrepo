import java.util.ArrayList;
import java.util.List;

public class leet {
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> wow=new ArrayList<>();
         helper(nums,0,nums.length-1,wow);
         return wow;
    }
    static int[] swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
    static void helper(int[] nums,int i,int j,List<List<Integer>> wow){
        if(i==j){
            ArrayList<Integer>ne=new ArrayList<>();
            for (int num : nums) {
                ne.add(num);
            }
            wow.add(ne);
        }
        else{
            for(int z=i;z<=j;z++){
                nums=swap(nums,i,z);
                helper(nums,i+1,j,wow);
                nums=swap(nums,i,z);
            }
        }
    
}
        public static void main(String[] args) {
            int[]nums={1,2,3};
            List<List<Integer>>result=permute(nums);
            for(List<Integer>i:result){

                System.out.print(i);
            }

        }
    }

