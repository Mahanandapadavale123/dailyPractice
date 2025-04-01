public class PairsofArr {
    
    public static void pairsOfArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int start=0;
            for(int j=i+1;j<n;j++){
                int end=n-1;
                for(int k=0;k<=j;k++){
                    if(arr[k]+arr[j]==arr[i]){
                        System.out.println("("+arr[i]+","+arr[j]+")");

                }
                System.out.println();
            }
            System.out.println();
        }
        }
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
    
    }
}
