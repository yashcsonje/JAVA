// Print Sum Of First n Natural Numbers

import java.util.*;

public class PrintSum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int Sum = 0;

        int i=1;
        while(i <= n) {
            Sum += i;
            i++;
        }

        System.out.println("Sum is: " + Sum);
    }
}