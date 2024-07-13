// Enter cost of 3 items from the user (using float data type)- a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem

import java.util.*;

//Bill Of Items
public class Bill {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float Pencil=sc.nextFloat();
        float Pen=sc.nextFloat();
        float Eraser=sc.nextFloat();
        
        float Total= Pencil + Pen + Eraser;

        System.out.println("Bill is: "+ Total);

    
        //Add On - with 18% Tax
        float NewTotal=Total + (0.18f * Total);
        System.out.println("Bill With 18% Tax: "+ NewTotal);
    }
}