// Keep entering numbers till user enters a multiple of 10
// break

import java.util.*;

public class MultipleOf10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
    }
}