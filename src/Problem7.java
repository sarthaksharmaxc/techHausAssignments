public class Problem7 {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 5;

        if((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)){
            System.out.println("Addition will result in overflow: ");
        }
        if ((a > Integer.MAX_VALUE / b || a < Integer.MIN_VALUE / b ) && b != 0){
            System.out.println("Multiplication will result in overflow: ");
        }
    }
}
