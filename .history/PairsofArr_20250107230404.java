public class PairsofArr {
    
    public static void pairsOfArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            // int start=0;
            for(int j=i+1;j<n;j++){
                // int end=n-1;
                   if(arr[i]+arr[j]==arr[j]){
                        System.out.println("("+arr[i]+","+arr[j]+")");
                }   
             }
        }
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        pairsOfArray(arr);
 for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
 }    
    }
}
