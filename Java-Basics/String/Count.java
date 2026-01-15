
//Count how many times character 'a' appears in "banana".
class Count{
    public static void main(String[] args) {
        String s="banana";
        int count=0;
        char ch='a';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Count:"+count);
    }
}