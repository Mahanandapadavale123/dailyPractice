 public class Main {
 

    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        for(int i=0; i<=arr.length;i++){
            int mid= start + end /2;
            return mid;

            if (arr[mid]==0) {
                return 0;
            }else{
                return 1;
            }


        }
        return -1;

    }
    public static void main(String arg[]){
        int arr[] = {22,44,50,78,90,100};
        int key = 10;
        System.out.println(binarySearch(arr, key));

    }
 }