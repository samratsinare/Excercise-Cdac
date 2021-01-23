
  import java.util.Scanner;
public class Pal12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp = num;


        int sum=0;

        while(0<num)
      
      {
      
        int a=num%10;
      
        sum=sum*10+a;
      
        num=num/10;
                 
      }
          if(temp==sum)
      {
          System.out.println("number is palindrome ");
      }
         else
      {
           System.out.println("number is not palindrome");
      
       }
         

 

    }
    
}
