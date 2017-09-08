package holamundo;
import java.util.Scanner;

public class ejer2 {
   public static void main(String []arg){
       
       Scanner leer=new Scanner(System.in);
       
       double base= 0;
       double altura=0;
       double area=0;
       do{
       System.out.println("Ingrse la base del Rectangulo");
       base=leer.nextDouble();
       }while()
       System.out.println("Ingrse la altura del Rectangulo");
       altura=leer.nextDouble();
       
       
       area=base*altura;
       
       System.out.println("El area de el rectangulo es = "+area);
       
   } 
}
