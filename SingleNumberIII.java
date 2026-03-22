public class SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        int xor = 0;

        // Step 1: XOR of all elements
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find rightmost set bit
        int diff = xor & (-xor);

        int a = 0, b = 0;

        // Step 3: Divide into 2 groups
        for (int num : nums) {
            if ((num & diff) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] result = singleNumber(nums);

        System.out.println(result[0] + " " + result[1]); // Output: 3 5
    }
}