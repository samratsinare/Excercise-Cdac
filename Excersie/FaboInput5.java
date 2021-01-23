import java.util.Scanner;

public class FaboInput5 {

    public static void main(String args[])
    {

         Scanner scanner = new Scanner(System.in);

        int a=0;
    
        int b=1;
    
        int n=1;
    
     System.out.println("Enter the Number");
     int counter = scanner.nextInt();
    
       while(n<=counter)
    
    {
        System.out.println(a);
    
        int sum=a+b;
    
       a=b;
      
      b=sum;
    
      n++;
    
    }
    
    }

    
}
