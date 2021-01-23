import java.util.Scanner;

public class Vowels9 {

    public static void main(String[] args) {
        

         Scanner sc = new Scanner(System.in);

         char l = sc.next().charAt(0);

         if(l=='a' || l=='A' && l=='o' || l=='O' && l=='e' || l=='E' && l=='i' || l=='I' && l=='u' || l=='U')
         {
             System.out.println("Charcter : "+l+" : is Vowel");
         }

         else
         {
            System.out.println("Charcter : "+l+" : is consonant");
         }




    }
    
}
