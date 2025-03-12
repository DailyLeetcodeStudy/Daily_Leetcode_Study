package ch;

import java.util.HashMap;

class Solution {
    public int pivotIndex(int[] nums) {
        int result = -1;
        int sum = 0;

        for(int i =0; i<nums.length ;i++){
            sum += nums[i];
        }

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        for (Object o : objectObjectHashMap.keySet()) {
            objectObjectHashMap.g
        }

        int leftSum = 0;
        for(int i =0; i<nums.length; i++){
            sum -= nums[i];

            if(sum -leftSum ==0){
                result = i;
                break;
            }
            leftSum +=nums[i];

        }

        return result;
    }
}