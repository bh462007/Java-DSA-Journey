import java.util.HashSet;

class LongestConsecutive {

    static int consecutiveSequence(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int maxStreak = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int curr = num;
                int streak = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }

                if (streak > maxStreak) {
                    maxStreak = streak;
                }
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {

        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(consecutiveSequence(arr));
    }
}