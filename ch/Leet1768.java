package ch;

public class Leet1768 {
    public String mergeAlternately(String word1, String word2) {

        String[] wordA = word1.split("");
        String[] wordB = word2.split("");

        int maxLength = Math.max(wordA.length, wordB.length);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            if(i<wordA.length){
                sb.append(wordA[i]);
            }

            if(i<wordB.length){
                sb.append(wordB[i]);
            }
        }


        return sb.toString();
    }
}
