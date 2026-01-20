class Duplicate{
    public static void main(String[] args) {
        int[] arr={1, 3, 4, 2, 3};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if(arr[j]==arr[j+1]){
                    System.out.println("Duplicate");
                    break;
                }
            }
        }
    }
}