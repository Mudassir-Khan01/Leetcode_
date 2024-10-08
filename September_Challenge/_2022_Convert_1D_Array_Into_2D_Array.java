public class _2022_Convert_1D_Array_Into_2D_Array {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n !=original.length)
            return new int[][]{};

        int [][] twoD=new int[m][n];
        for(int i=0;i<original.length;i++){
            twoD[i/n][i%n]=original[i]; //i/m could possibly lead to higher index thats y we will use i/n
        }
        return twoD;
    }
}
