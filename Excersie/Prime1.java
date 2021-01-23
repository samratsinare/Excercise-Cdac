import java.util.*;

    class Prime1
 {

     public static void main(String[] args) 
     
     {

           int flag = 0;
           
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the number");

          int number = scanner.nextInt();

          for(int i =2 ; i<=number/2 ; i++)
          {
                 
               if(number % i == 0)
               {
                     flag = 1;
                     break;

               }

          }

             if(flag==0)
             {
                 System.out.println("Number is prime : "+number);
             }

             else

             {
               System.out.println("Number is Not Prime : "+ number);

             }
         
     }

 }