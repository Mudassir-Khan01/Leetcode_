import java.util.HashMap;
import java.util.Map;

public class _Kth_Distinct_String_in_an_Array {
    class Solution {
        public String kthDistinct(String[] arr, int k) {
            Map<String,Integer> map=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],0);
                }else{
                    map.put(arr[i],1);
                }
            }
            for(String s:arr){
                if(map.get(s)==1){
                    k--;
                }
                if(k==0)
                    return s;
            }
            return "";
        }
    }
}
