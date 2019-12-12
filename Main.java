class Main {

  /*
   * Find LONGEST COMMON SUBSEQUENCE STRING using Dynamic Programming Formula:
   * 
   * f(i,0) = f(0,j) = ''
   * 
   * if A[i-1] == B[j-1]
   * f(i,j) = max(f(i-1,j), f(i,j-1))
   * 
   * if A[i-1] != B[j-1]
   * f(i,j) = f(i-1,j) + 1
   * 
   * because in Array of A and B, indexing starts from 0
   */
  private static int[][] generate_LCS_table(String a, String b) {
    int[][] dp = new int[101][101];

    for (int i = 0; i <= 100; i++) {
      dp[0][i] = 0;
      dp[i][0] = 0;
    }

    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {
        if (a.charAt(i - 1) != b.charAt(j - 1))
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        else
          dp[i][j] = dp[i - 1][j] + 1;
      }
    }
    return dp;
  }

  /*
   * Find LONGEST COMMON SUBSEQUENCE STRING using Dynamic Programming Formula:
   * 
   * f(i,0) = f(0,j) = ''
   * 
   * if A[i-1] == B[j-1]
   * f(i,j) = max(f(i-1,j), f(i,j-1))
   * 
   * if A[i-1] != B[j-1]
   * f(i,j) = f(i-1,j) + A[i-1]
   * 
   * because in Array of A and B, indexing starts from 0
   */
  private static String[][] generate_LCS_str_table(String a, String b) {
    String[][] dpString = new String[101][101];

    for (int i = 0; i <= 100; i++) {
      dpString[i][0] = dpString[0][i] = "";
    }

    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {
        if (a.charAt(i - 1) != b.charAt(j - 1)) {
          dpString[i][j] = max(dpString[i - 1][j], dpString[i][j - 1]);
        } else {
          dpString[i][j] = dpString[i - 1][j] + a.charAt(i - 1); // or b.charAt(j - 1)
        }
      }
    }
    return dpString;
  }

  private static String max(String a, String b) {
    if (a.length() > b.length()) {
      return a;
    }
    return b;
  }

  public static void main(String[] args) {

    String a = "abcdef";
    String b = "aguidkejf";
    int a_length = a.length();
    int b_length = b.length();
    // Longest common subsequence is 'adef', should return 4

    int[][] dp = generate_LCS_table(a, b);
    String[][] dpStr = generate_LCS_str_table(a, b);
    
    System.out.println(dp[a_length][b_length] + ": " + dpStr[a_length][b_length]);
  }
}