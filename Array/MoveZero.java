class MoveZero{
    public static void main(String[] args) {
        int[] arr={0, 1, 0, 3, 12};
        
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = 0; j < arr.length-1-i; j++) {
        //         if(arr[j]==0){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}