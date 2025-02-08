class Solution {
    // O(n)
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        String newStr = "";

        for(int i=0;i<word1Len;i++) {
            newStr = newStr + word1.charAt(i);
            // word1 순서 마지막이면 끝내기
            if(i == word1Len-1) {
                if(i<word2Len) {
                    newStr = newStr + word2.substring(i);
                    return newStr;
                }
                
            }
            if(i<word2Len) {
                newStr = newStr + word2.charAt(i);
            }
            
        }

        return newStr;
    }
}
