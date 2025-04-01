import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfSubarray {
    // public static void SubArray(int arr[]){
    //     int ms=Integer.MIN_VALUE;
    //     int cs=0;
    //     for(int i=0;i<arr.length;i++){
    //     cs= cs+arr[i];
    //     ms= Math.max(cs, ms);
    //     if(cs<0){
    //         cs=0;
    //     }
    //     }
    //     System.out.println(ms);
    // }
    // public static void main(String args[]){
    //     int[] arr ={-1,-2,-3,-4} ;
    //     // {-2,-3,4,-1,-2,1,5,-3};
    //     SubArray(arr); 
   
   
    // }


    public static void SubArray(int []number){
        int ms=Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<number.length;i++){
        cs=cs + number[i];
        ms = Math.max(cs, ms);

        if(cs < 0){
            cs = 0;
        }
        }
        System.out.println(ms);
    }

public  static void main(String args []){
    int [] number={22,6,45,34,82,23,12,11};
    Arrays.sort(number);
    for(int i=0;i<=number.length;i++){
        i++;
    }
    SubArray(number);
}


}




