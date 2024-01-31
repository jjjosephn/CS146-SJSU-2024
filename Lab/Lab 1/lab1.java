import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lab1 {
    public static void main(String[] args) {
        int[] nums = {0,1,8,7,3,9};
        int target = 16;
        int[] solution = new int[2];

        Map <Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            int total = 0;

            total = target - nums[i];

            if (!numbers.containsKey(total)){
                numbers.put(nums[i], i);
            }
            else {
                solution[0] = numbers.get(total);
                solution[1] = i;
            }
        }
        System.out.println(Arrays.toString(solution) + "\nIndices: " + solution[0] + " and " + solution[1]);
    }
}
