
import java.util.HashMap;

class Basics{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap();

        map.put(12, 4);
        map.put(4, 1);
        map.put(7, 3);
        map.put(9, 2);

        System.out.println(map.get(4));

        if(map.containsKey(3)){
            System.out.println("Exists");
        }
        else{
            System.out.println("Not");
        }
    }
}