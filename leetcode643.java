class leetcode643 {

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // first window ka sum
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        // sliding window
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,-5};
        int k = 3;

        leetcode643 obj = new leetcode643();
        double result = obj.findMaxAverage(nums, k);

        System.out.println(result);
    }
}