class Main {
    public static void rotate(int[] arr,int k){
        
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){   // 0 to end
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        k=k%arr.length;    // if k =20 then 20%7-->6
      
        
        start=0;
        end=k-1;
        
        while(start<=end){    // 0 to k-1
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        
        start=k;
        end=arr.length-1;
        
         while(start<=end){   // k to end
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        
        
        
    }
    public static void main(String[] args) {
        int[] arr={-1,-100,3,99};
        int k=2;
        rotate(arr,k);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
