
import java.util.HashMap;

class CountFrequency {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 9, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : arr){
        //     if(map.containsKey(num)){
        //         map.put(num, map.getOrDefault(num, 0)+1);
        //     }
        //     else{
        //         map.put(num, 1);
        //     }
        // }
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
