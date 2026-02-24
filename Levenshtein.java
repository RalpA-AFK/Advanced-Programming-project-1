public class Levenshtein {
    public static int Levenshtein(String word1,String word2){
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i <= word1.length();i++){
            dp[i][0] = i; // cost of the letter deletion on word1
        }
        for(int j = 0; j <= word2.length(); j++){
            dp[0][j] = j; // cost of inserting letters to word1 to match word2
        }

    }
}
