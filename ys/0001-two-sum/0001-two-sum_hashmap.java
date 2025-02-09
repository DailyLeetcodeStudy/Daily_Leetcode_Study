// Time: 4 ms (60.81%), Space: 45.1 MB (44.73%) - LeetHub
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int length = nums.length;

        for(int i=0;i<length;i++) {
            numMap.put(nums[i],i);
        }

        // 키값에 해당하는 반대값 찾기
        for(int i=0;i<length;i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement) != i){
                return new int[]{i,numMap.get(complement)};
            }
        }

        return new int[]{}; // no solution found
    }
}
