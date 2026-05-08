
import java.util.HashMap;

class FirstNonRepeatingNo{
    public static void main(String[] args) {
        int[] arr={4, 5, 1, 2, 1, 2};
        HashMap<Integer, Integer> map=new HashMap<>();
        boolean flag=false;

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int first:arr){
            if(map.get(first)==1){
                flag=true;
                System.out.println("First non repeating value: "+first);
                break;
            }
        }

        if(!flag){
            System.out.println(-1);
        }
    }
}