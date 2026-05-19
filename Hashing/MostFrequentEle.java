
import java.util.HashMap;
import java.util.Map;

class MostFrequentEle{
    static int mostFrequent(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        int max=0;
        int ans=-1;

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3};
        System.out.println(mostFrequent(arr));
    }
}