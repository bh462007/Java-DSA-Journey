class Pallindrome{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,6,2,1};
        
        int start=0;
        int end=arr.length-1;

        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("Not Pallindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Pallindrome");
        
        
    }
}