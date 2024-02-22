import java.util.Scanner;
    public class Problem5{
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int evenSum = 0;
            int oddSum = 0;
            int arr[][] = new int[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] % 2 == 0)
                        evenSum += arr[i][j];
                    else
                        oddSum += arr[i][j];
                }
            }
            System.out.println("Sum of even elements = " + evenSum);
            System.out.println("Sum of odd elements = " + oddSum);
            if (evenSum == oddSum)
                System.out.println("special array");
            else
                System.out.println("not a special array");
        }
    }

