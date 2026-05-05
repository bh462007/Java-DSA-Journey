import java.util.Stack;

class BaseballGame{
    int calPoints(String[] s){
        Stack<Integer> stack=new Stack<>();

        for(String op:s){
            if(op.equals("+")){
                int a=stack.peek();
                int b=stack.get(stack.size()-2);
                
                int c=a+b;
                stack.push(c);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                int n=stack.peek();
                stack.push(2*n);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int n:stack){
            sum+=n;
        }
        return sum;

    }

    public static void main(String[] args) {
        BaseballGame obj=new BaseballGame();
        String[] s={"1","2","+","C","5","D"};
        System.out.println(obj.calPoints(s));
    }
}