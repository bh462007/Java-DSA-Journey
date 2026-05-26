
import java.util.HashMap;

class SubarraySum{
    static int cntSubarrays(int[] arr, int k){
        HashMap<Integer, Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,1);

        int sum=0;
        int count=0;
        for(int num:arr){
            sum+=num;

            int need=sum-k;

            if(prefixSum.containsKey(need)){
                count+=prefixSum.get(need);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={9, 4, 20, 3, 10, 5};
        int k=33;
        System.out.println(cntSubarrays(arr, k));
    }
}
