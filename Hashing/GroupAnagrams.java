
import java.util.*;

class GroupAnagrams{
    static List<List<String>> isAnagrams(String[] s){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:s){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }            
            map.get(sorted).add(str);

        }
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {
        String[] s={"eat","tea","tan","ate","nat","bat"};
        System.out.println(isAnagrams(s));
    }
}