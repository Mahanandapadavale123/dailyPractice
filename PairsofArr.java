import java.util.ArrayList;
import java.util.List;

public class PairsofArr {
    
    public static int[] pairsOfArray(int arr[]){
        int n = arr.length;

        List<int[]> pairs = new ArrayList<>();

        for(int i=0;i<n;i++){
            // int start=0;
            for(int j=i+1;j<n;j++){
                // int end=n-1;
                //    1+2 = 2
                //    if(arr[i]+arr[j]==arr[j]){
                        // System.out.println("("+arr[i]+","+arr[j]+")");
                //    } else{
                    // 
                //    }  
             }
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
         pairsOfArray(arr);   
    }
}
