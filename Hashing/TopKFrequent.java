
import java.util.HashMap;
import java.util.Map;

class TopKFrequent{
    static int[] freuqentElement(int[] arr, int k){
        HashMap<Integer, Integer> map=new HashMap<>();
        
        int[] result=new int[k];

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for (int i = 0; i < k; i++) {
            int max=0;
            int ans=-1;

            for(Map.Entry<Integer, Integer> entry:map.entrySet()){

                if(entry.getValue() > max){
                    max=entry.getValue();
                    ans=entry.getKey();
                }
            
            }

            result[i]=ans;

            map.remove(ans);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        int[] res=freuqentElement(arr,k);

        for(int ele:res){
            System.out.println(ele+" ");
        }
    }
}