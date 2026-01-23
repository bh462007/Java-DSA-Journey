class LeftSumRightSum{
    public static void main(String[] args) {
        int[] arr={1, 7, 3, 6, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("Prefix sum:");
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }

        int totalSum = prefix[prefix.length - 1];

        if (0 == totalSum - prefix[0]) {
            System.out.println("Balanced index: 0");
        }

        for (int i = 1; i < prefix.length; i++) {
            int leftsum = prefix[i - 1];
            int rightsum = totalSum - prefix[i];

            if (leftsum == rightsum) {
                System.out.println("Balanced index: " + i);
            }
        }


    }
}