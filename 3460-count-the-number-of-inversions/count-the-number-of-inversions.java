class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfPermutations(int n, int[][] requirements) {

        int[] req = new int[n];
        Arrays.fill(req, -1);

        int maxInv = 0;

        for (int[] r : requirements) {
            req[r[0]] = r[1];
            maxInv = Math.max(maxInv, r[1]);
        }

        long[][] dp = new long[n + 1][maxInv + 1];
        dp[0][0] = 1;

        for (int len = 1; len <= n; len++) {

            long[] prefix = new long[maxInv + 2];

            for (int i = 0; i <= maxInv; i++) {
                prefix[i + 1] = (prefix[i] + dp[len - 1][i]) % MOD;
            }

            for (int inv = 0; inv <= maxInv; inv++) {

                int left = Math.max(0, inv - (len - 1));
                int right = inv;

                dp[len][inv] =
                        (prefix[right + 1] - prefix[left] + MOD) % MOD;
            }

            int need = req[len - 1];

            if (need != -1) {
                for (int inv = 0; inv <= maxInv; inv++) {
                    if (inv != need) {
                        dp[len][inv] = 0;
                    }
                }
            }
        }

        long ans = 0;

        for (int inv = 0; inv <= maxInv; inv++) {
            ans = (ans + dp[n][inv]) % MOD;
        }

        return (int) ans;
    }
}