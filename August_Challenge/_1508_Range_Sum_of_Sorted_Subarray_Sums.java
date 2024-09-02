import java.util.Arrays;

public class _1508_Range_Sum_of_Sorted_Subarray_Sums {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int ans=0;
        int newNums[]=new int[n*(n+1)/2];
        int ind=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                newNums[ind]=sum;
                ind++;
            }
        }

        Arrays.sort(newNums);
        int mod=(int)1e9+7;
        for(int i=left-1;i<right;i++){
            ans=(ans+newNums[i])%mod;
        }
        return ans;
    }
}
