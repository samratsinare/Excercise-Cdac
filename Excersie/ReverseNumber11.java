

  import java.util.Scanner;
public class ReverseNumber11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();


        int sum=0;

  while(input !=0)  // n is not equal to zero

{

  int a = input % 10;

  sum=sum*10+a;

  input/=10;

}

      System.out.println("reverse number="+sum);
         
         

    }
    
}
