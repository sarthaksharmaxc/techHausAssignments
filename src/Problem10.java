import java.util.*;

public class Problem10 {
        public static void main(String[] args)
        {
            int[] arr = { 1,2,3,4,5};
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int a : arr) {
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }
            }
            System.out.println("Sum = " + (max + min));
        }

}
