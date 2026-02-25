import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println(result);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void solve(int[] arr, int target, int index,
                             List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Choose
        list.add(arr[index]);
        solve(arr, target - arr[index], index, list, ans);

        // Not Choose
        list.remove(list.size() - 1);
        solve(arr, target, index + 1, list, ans);
    }
}