class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // Time complexity: O(N), where N is the number of dominoes

        // Arrays to count occurrences of numbers 1 through 6
        int[] countT = new int[7];   // Count in top row
        int[] countB = new int[7];   // Count in bottom row
        int[] countTB = new int[7];  // Total count across both rows (unique per domino)

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == bottoms[i]) {
                // Same number on both sides — only count once
                countTB[tops[i]] += 1;
            } else {
                // Count separately in top and bottom
                countT[tops[i]] += 1;
                countB[bottoms[i]] += 1;

                // Count both in total
                countTB[tops[i]] += 1;
                countTB[bottoms[i]] += 1;
            }
        }

        // Check for a number that occurs in every domino
        for (int i = 1; i <= 6; i++) {
            if (countTB[i] == tops.length) {
                // Return the minimum rotations needed to make all values equal to i
                return Math.min(countT[i], countB[i]);
            }
        }

        // No number can fill an entire row after rotations
        return -1;
    }
}
