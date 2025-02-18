class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String newS = "";
        for(int i = words.length-1;i>=0;i--) {
            newS += words[i] + " ";
        }

        return newS.trim();
    }
}