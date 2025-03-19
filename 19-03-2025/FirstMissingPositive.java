class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        int numToBeAt = 1;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] < 1){
                continue;
            }
            if(nums[i]==numToBeAt-1){
                continue;
            }
            if(nums[i]!=numToBeAt){
                return numToBeAt;
            }
            numToBeAt++;
        }
        return Math.max(nums[nums.length-1] + 1, 1);
    }
}
