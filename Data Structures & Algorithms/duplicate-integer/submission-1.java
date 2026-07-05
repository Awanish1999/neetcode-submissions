class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashset= new HashSet<>(nums.length);

        for(int num:nums){
            if(!hashset.add(num)){
                return true;
            }
        }
        return false;
    }
}