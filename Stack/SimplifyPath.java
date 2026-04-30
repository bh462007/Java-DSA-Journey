
import java.util.Stack;

class SimplifyPath{
    static String simplifyPath(String s){
        Stack<String> stack=new Stack<>();
        String[] parts=s.split("/");

        for(String part:parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(part);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(String dir:stack){
            sb.append("/").append(dir);
        }
        return sb.length()==0? "/":sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/")); // /c
        System.out.println(simplifyPath("/home//foo/"));     // /home/foo
        System.out.println(simplifyPath("/../"));            // /
    }
}