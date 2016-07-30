
package a;


public class Mountain extends Rock {
   Mountain()
   {
       super( "guarntee" );
       new Rock( "guarntee" );
   }
   public static void main(String[] args)
   {
       for(int i = 0; i<5; i++)
       {
           for(int j = 0; j<5; j++){
               if( i==j )
               System.out.print("11");
               else
                   System.out.print("00"); 
           }
           System.out.println("");
       }
   }
           
}
