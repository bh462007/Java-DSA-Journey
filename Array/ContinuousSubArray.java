//Check if any continuous subarray has sum = K.
class ContinuousSubArray{
    public static void main(String[] args) {
        int[] arr={2, 4, 1, 3, 6};
        int[] prefix=new int[arr.length];

        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        System.out.println("Prefix sums:");
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }

    }
}