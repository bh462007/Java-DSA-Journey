class PrintEvenIndex{
    public static void main(String[] args) {
        int[] arr={4,2,3,5,6,1};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.println("Array elements at even index: "+arr[i]);
            }
        }
    }
}