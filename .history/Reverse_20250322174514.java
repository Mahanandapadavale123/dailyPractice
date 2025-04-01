public class Reverse {
 
//     public static int[] reverseArray(int arr[]){
//         int n = arr.length;
//         int start=0;
//         int end=n-1;
//         while(start<end){
//             int temp = arr[end];
//             arr[end] = arr[start];
//             arr[start] = temp;
//             start++;
//             end--;
//     }
//     return arr;
//     }
//         public static void main(String args []){
//             int [] arr={2,5,6,7,10};
//             reverseArray(arr);
    
//             for(int i=0;i<arr.length;i++){
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
    
//         }



public static int[] reverseArray(int[] number){
    int n= number.length;
    int start=0;
    int end=n-1;
    while(start < end){
        int temp = number[start];
        number[start] = number[end];
        number[end] =  temp;
        start++;
        end--;
    }
    return number;
}
public static void main(String args[]){
    int [] number = {10,22,39,29,30};

    reverseArray(number);

    for(int i=0;i<=number.length;i++){
        System.out.print(number[i] + " ");
    }
    System.out.println();
}

    }


