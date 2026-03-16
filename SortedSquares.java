import java.util.Arrays;

class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        int arr[] = new int[nums.length];

        // square store in new array
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }

        // insertion sort
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        return arr;
    }

    public static void main(String[] args) {

        int nums[] = {-4,-1,0,2,3};

        SortedSquares obj = new SortedSquares();

        int result[] = obj.sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}