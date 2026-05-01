import java.util.Stack;

class EvaluateRPN{
    
    static int evaluate(String[] tokens){
        Stack<Integer> stack=new Stack<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b=stack.pop();
                int a=stack.pop();

                int result=0;

                switch (token) {
                    case "+":
                        result=a+b;
                        break;
                    case "-":
                        result=a-b;
                        break;
                    case "*":
                        result=a*b;
                        break;
                    case "/":
                        result=a/b;
                        break;
                     
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token)); //conversion
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] s1={"2","1","+","3","*"}; 
        String[] s2={"4","13","5","/","+"};

        System.out.println(evaluate(s1));
        System.out.println(evaluate(s2));
    }
}