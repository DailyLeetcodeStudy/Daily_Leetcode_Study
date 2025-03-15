package ch;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int i =0; i<nums1.length; i++){
            setA.add(nums1[i]);
        }

        for(int i =0; i<nums2.length; i++){
            setB.add(nums2[i]);
        }

        List<Integer> boxA = new ArrayList<>();
        List<Integer> boxB = new ArrayList<>();

        for(int value: setA){
            if(!setB.contains(value)){
                boxA.add(value);
            }
        }

        for(int value: setB){
            if(!setA.contains(value)){
                boxB.add(value);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(boxA);
        result.add(boxB);
        return result;
    }
}

