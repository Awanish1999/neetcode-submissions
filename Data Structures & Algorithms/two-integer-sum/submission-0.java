class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res= new int[2];
        int left=0;
        int right=1;
        while (left<right){
            if((nums[left]+nums[right])==target){
                res[0]=left;
                res[1]=right;
                break;
            }
            if(right==nums.length-1){
                left++;
                right=left+1;
            }else
            right++;
           
        }
        return res;
    }
}
