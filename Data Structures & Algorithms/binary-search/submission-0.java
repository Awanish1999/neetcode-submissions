class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=(nums.length)-1;
        int res=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res=mid;
                break;
            }
            if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
}
