class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> boolList = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max) {
                max = candies[i];
                continue;
            } 
        }

        int i =0;
        while(i<candies.length) {
            if(candies[i]+extraCandies>=max) {
                boolList.add(true);
            } else {
                boolList.add(false);
            }
            i++;
        }
        return boolList;
    }
}