public class Main {
    // int start = 0;
    //     int end= arr.length-1;
    //     while(start <= end){
    //         int mid = start + end /2;
    //         if(arr[mid] == key){
    //             return mid;
    //     }else{
    //         return -1;
    //     }}
    //     return -1;

    // public static int binarySearch(int arr[],int key){
        
    // }


    public static int binarySearch(int arr[], int key){
        int start =0;
        int end = arr.length-1;
        for(int i=0; i<=arr.length;i++){
            int mid = start + end /2;
            return mid;
        }
        return 0;
    }
        public static void main(String args []){
        int arr [] = {1,2,3,4,5,6,7};

        int key =4;
        System.out.println(binarySearch(arr, key));
        

    }
}
