class Solution {
    public String pushDominoes(String dominoes) {
        // Time complexity: O(N), where N is the length of the input string
        StringBuilder sb = new StringBuilder();
        int count = 0;     // Count of consecutive dots
        char last = 'L';   // Last non-dot character seen, initialized to 'L' for left border

        for (char d : dominoes.toCharArray()) {
            if (d == '.') {
                count += 1; // Count dots until we hit a new force (L or R)
            } else {
                if (d == last) {
                    // Same direction forces: all dots fall in same direction
                    append(count, last, sb);
                } else if (last == 'L' && d == 'R') {
                    // Forces moving away from each other: dots stay upright
                    append(count, '.', sb);
                } else {
                    // Opposing forces (R...L): fill half with 'R', optional middle dot, half with 'L'
                    append(count / 2, 'R', sb);
                    if (count % 2 != 0) append(1, '.', sb); // Middle one remains upright
                    append(count / 2, 'L', sb);
                }
                sb.append(d); // Append the current force
                last = d;     // Update last seen non-dot character
                count = 0;    // Reset dot counter
            }
        }

        // Handle any remaining dots at the end of the string
        append(count, last == 'R' ? 'R' : '.', sb);
        return sb.toString();
    }

    // Helper method to append 'count' characters of 'last' to the result
    private void append(int count, char last, StringBuilder sb) {
        for (int i = 0; i < count; i++) {
            sb.append(last);
        }
    }
}
