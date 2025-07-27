public class secondlargest {
    public static int getSecondLargest(int[] arr) {
   
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }

        

        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max!=arr[i] && second_largest<arr[i]){
                second_largest=arr[i];
            }
        }
        
        if(second_largest==Integer.MIN_VALUE){
            return -1;
        }

        return second_largest;

    
    }
    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));

    }
}
