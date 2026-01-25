class RotateByK{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;

        int[] temp=new int[k];
        for (int i = 0; i < k; i++) {
            temp[i]=arr[i];
        }
       
        for (int i = 0; i < arr.length-k; i++) {
            arr[i]=arr[i+k];
        }

        for (int i = 0; i < k; i++) {
            arr[arr.length-k+i]=temp[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}