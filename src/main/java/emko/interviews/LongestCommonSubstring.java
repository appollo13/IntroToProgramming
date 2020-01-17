package emko.interviews;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestCommonSubstring {

    private static final boolean DEBUG = false;

    public static void main(String[] args) {
        String X = "ABCBA";
        String Y = "BABA";
        System.out.print("The Longest common substrings are " + LCS(X, Y));
    }

    // Function to find Longest common substring of sequences X[0..m-1] and Y[0..n-1]
    public static Set<String> LCS(String X, String Y) {
        if (DEBUG) {
            System.out.println(X);
            System.out.println(Y);
        }

        int m = X.length();
        int n = Y.length();

        int maxLength = 0;
        Set<Integer> endingIndexes = new HashSet<>();

        // Lookup[i][j] stores the length of LCS of substring X[0..i-1], Y[0..j-1]
        int[][] lookup = new int[m + 1][n + 1];

        // filling the lookup table in bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (DEBUG) {
                    System.out.println("X[" + (i - 1) + "] vs. Y[" + (j - 1) + "] := " + X.charAt(i - 1) + " vs. " + Y.charAt(j - 1) + " " +
                            "=> " + (X.charAt(i - 1) == Y.charAt(j - 1) ? 1 : 0));
                }

                // if current character of X and Y matches
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1] + 1;

                    // update the maximum length and ending index
                    if (lookup[i][j] == maxLength) {
                        endingIndexes.add(i);
                    } else if (lookup[i][j] > maxLength) {
                        maxLength = lookup[i][j];
                        endingIndexes.clear();
                        endingIndexes.add(i);
                    }
                }
            }
        }

        if (DEBUG) {
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 && j != 0) {
                        System.out.print(Y.charAt(j - 1) + ", ");
                    } else if (i != 0 && j == 0) {
                        System.out.print(X.charAt(i - 1) + ", ");
                    } else {
                        System.out.print(lookup[i][j] + ", ");
                    }
                }
                System.out.println();
            }
        }

        // return Longest common substring having length maxLength
        int theMaxLength = maxLength;
        return endingIndexes.stream()
                .map(endingIndex -> X.substring(endingIndex - theMaxLength, endingIndex))
                .collect(Collectors.toSet());
    }
}
