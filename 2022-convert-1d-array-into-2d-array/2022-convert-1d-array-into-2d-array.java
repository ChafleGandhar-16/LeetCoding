class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr2 = new int[m][n];

        if (original.length == m*n) {
            for (int i = 0; i<m; i++) {
                for (int j = 0; j<n; j++) {
                    arr2[i][j] = original[(i)*n + j];
                }
            }
            return arr2;
        } else {
            return new int[0][0];
        }
    }
}