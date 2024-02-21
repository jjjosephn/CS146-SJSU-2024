import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class hw6{
     public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outputList = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++){
            if (i == 0 || nums[i] != nums[i-1]){
                int j = i + 1; //left pointer
                int k = nums.length - 1; //right pointer 
                int sum = 0 - nums[i];

                while (j < k){
                    if (nums[j] + nums[k] == sum){
                        outputList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]){    //check if there's duplicates after
                            j++;
                        }
                        while (j < k && nums[k] == nums[k - 1]){    //check if there's duplicates before
                            k--;
                        }
                        j++;
                        k--;
                    }
                    else if (nums[j] + nums[k] > sum){
                        k--;
                    }
                    else{
                        j++;
                    }
                }
            }
        }
        return outputList;
    }
    public static void main(String[] args) {
        int[] nums = {-5, -5, 0, 5, -10, 0, 5};
        System.out.println(threeSum(nums));
    }
}
