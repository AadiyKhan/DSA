class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftTotal=0;
        for(int i=0;i<nums.length;i++){
            int rightTotal=sum-leftTotal-nums[i];
            if(rightTotal==leftTotal){
                return i;
            }
            leftTotal+=nums[i];
        }
        return -1;
    }
}