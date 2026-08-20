
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns

        int startRow = 0;
        int endRow = n - 1;

        // Binary search to find the possible row
        while (startRow <= endRow) {

            int mid = startRow + (endRow - startRow) / 2;

            if (target >= matrix[mid][0] &&
                target <= matrix[mid][m - 1]) {

                // Binary search inside this row
                int st = 0;
                int end = m - 1;

                while (st <= end) {

                    int md = st + (end - st) / 2;

                    if (matrix[mid][md] == target) {
                        return true;
                    }
                    else if (matrix[mid][md] > target) {
                        end = md - 1;
                    }
                    else {
                        st = md + 1;
                    }
                }

                return false;
            }

            else if (target > matrix[mid][m - 1]) {
                startRow = mid + 1;
            }

            else {
                endRow = mid - 1;
            }
        }

        return false;
    }
}