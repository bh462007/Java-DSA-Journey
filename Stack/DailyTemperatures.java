import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int prev = stack.pop();
                ans[prev] = i - prev;
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] temps = {30, 40, 35, 50};
        System.out.println(Arrays.toString(dailyTemperatures(temps)));
    }
}