// Display all number entered by user except multiples of 10
// continue

import java.util.*;

public class MultipleOf10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println("Number was: "+ n);
        } while(true);
    }
}