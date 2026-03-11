class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            if(map.getOrDefault(nums[i],-1) != -1){
                return new int[] {i,map.get(nums[i])};
            }

            map.put(target - nums[i],i);
        }

        return new int[] {-1,-1};
    }
}