import java.util.Scanner;

public class Positive2 {

      public static void main(String[] args) {
        
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter the number");
            int number = scanner.nextInt();

             if(number<0)
             {
                 System.out.println("Number is negative : "+number);
             }

             else
             {
                  System.out.println("Number is Positive : "+number);
             }

      }
    
}
