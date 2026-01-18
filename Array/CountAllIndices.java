class CountAllIndices{
    public static void main(String[] args) {
        int[] arr={0, 2, 2, 3, 4};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==i){
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}