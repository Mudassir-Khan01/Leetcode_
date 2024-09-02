public class _1894_Find_the_Student_that_Will_Replace_the_Chalk {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        int n = chalk.length;

        // Calculate the total sum of chalk required by all students
        for (int i = 0; i < n; i++) {
            sum += chalk[i];
        }

        // Modulo operation to remove full rounds of chalk usage
        k %= sum;

        // Find the student who will replace the chalk
        for (int i = 0; i < n; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }

        return -1; // This line is a fallback and shouldn't be reached in valid inputs
    }

    public static void main(String[] args) {
        _1894_Find_the_Student_that_Will_Replace_the_Chalk obj = new _1894_Find_the_Student_that_Will_Replace_the_Chalk();
        int[] chalk = {5, 1, 5};
        int k = 22;
        int result = obj.chalkReplacer(chalk, k);
        System.out.println("The student who will replace the chalk is: " + result);
    }
}
