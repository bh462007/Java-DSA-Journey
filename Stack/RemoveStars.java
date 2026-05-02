import java.util.Stack;

class RemoveStars{
    static String removeStars(String s){
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder result=new StringBuilder();
        for(char ch:stack){
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**code")); // lecode
        System.out.println(removeStars("erase*****"));  // ""
    }
}