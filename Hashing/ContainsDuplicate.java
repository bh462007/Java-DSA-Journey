
import java.util.HashSet;

class ContainsDuplicate{

    static boolean duplicate(int[] arr){
        HashSet<Integer> seen=new HashSet<>();
        for(int ele: arr){
            if(!seen.add(ele)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(duplicate(arr));

        
    }
}