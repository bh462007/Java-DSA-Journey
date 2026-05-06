
import java.util.Stack;

class StockSpanner{
    
    Stack<int[]> stack;
    public StockSpanner(){
        stack=new Stack<>();
    }

    public int next(int price){

        int span=1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            span+=stack.peek()[1];
            stack.pop();
        }

        stack.push(new int[]{price,span});
        return span;
    }

    public static void main(String[] args) {
        StockSpanner sp = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int price : prices) {
            int result = sp.next(price);
            System.out.println("Price: " + price + " -> Span: " + result);
        }
    }
}