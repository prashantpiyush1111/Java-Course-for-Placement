public class FirstLastPosition {
    public static  int[] Search(int  nums[],int target){
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[]{first,last};
    }
    public static int findFirst(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
           else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return ans;
    }



     public static int findLast(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
           else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={3,5,6,7,8,8,9};
        int target=8;
        int result[]= Search(nums,target);
        System.out.println(result[0]+" "+result[1]);

    }
    
}