class FirstIndex{
    public static void main(String[] args) {
        int[] arr={-5,0,2,3,5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==i){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}