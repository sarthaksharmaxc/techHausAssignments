import java.util.*;
public class Problem4 {
    public static void main(String args[] ){
        int count1=0;
        int count2=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for( int i=0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                count1++;
            if(Character.isLowerCase(s.charAt(i)))
                count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
        if (count2 == count1){
            System.out.println("Equal number of uppercase and lowercase letters");
        }
    }

}