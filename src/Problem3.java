import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i =2;i<= n/2;i++){
            if(n % i ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("its prime");
        }
        else
            System.out.println("not prime");
        }


}
