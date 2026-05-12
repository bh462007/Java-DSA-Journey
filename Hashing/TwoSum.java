
import java.util.HashMap;

class TwoSum{
    static boolean twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int compliment=target-arr[i];

            if(map.containsKey(compliment)){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target=-2;

        if(twoSum(arr, target)){
            System.out.println("Pair exists");
        }
        else{
            System.out.println("Pair do not exists");
        }

    }
}