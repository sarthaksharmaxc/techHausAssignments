import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Problem2 {
    public static void reversesTheArray(int arr[]){
    for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }}
    }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        reversesTheArray(array);

    }
}
