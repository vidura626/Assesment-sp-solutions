import java.util.ArrayList;
import java.util.List;

public class Problem_05 {

    public void findCombinations(int[] nums, int target, int index,
                                 List<Integer> current, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            findCombinations(nums, target - nums[i], i, current, results); // allow reuse
            current.removeLast();
        }
    }
}
