
import java.util.Scanner;
 
public class Greater10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         int num1 = 20;

         int num2 = 45;

         int num3 = 34;

         if(num1>num2 && num1>num3)
         {
             System.out.println("Number : "+num1+ " : is greater");
         }

         else if(num2>num3)
         {
            System.out.println("Number : "+num2+ " : is greater");

         }

         else
         {
            System.out.println("Number : "+num3+ " : is greater");
         }


    }
    
}
