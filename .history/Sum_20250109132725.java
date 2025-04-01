import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int [] arr=new int[5];
    for (int i=0; i<arr.length;i++){
        sum = arr[i] + sum;
        i++;

    }
    System.out.println(sum);
}
    }
