public class MaxArray30 {

    public static void main(String[] args) {
        

         int array[] = new int[]{10,46,24,67,12};

         int max = array[0];

         for(int i = 0 ; i <array.length ; i++)
         {
              if(max < array[i])
              {
                  max = array[i];
              }           

         }

         System.out.println(max);


    }
    
}
