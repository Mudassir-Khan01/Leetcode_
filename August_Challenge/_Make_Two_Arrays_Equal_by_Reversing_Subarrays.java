public class _Make_Two_Arrays_Equal_by_Reversing_Subarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
//         Arrays.sort(arr);
//         Arrays.sort(target);
//         if(target.length!=arr.length)
//         return false;
//         int count=0;
//         for(int i=0;i<target.length;i++){
//             if(target[i]!=arr[i])
//  return false;
//          }
//        return true;
        if(target.length!=arr.length)
            return false;

        int []count=new int[1001];
        for(int i:target){
            count[i]++;
        }
        for(int j:arr){
            count[j]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
