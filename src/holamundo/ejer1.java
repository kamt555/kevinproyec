
package holamundo;
import java.util.Scanner;
public class ejer1 {
    public static void main(String[]arg){
    
        Scanner leer = new Scanner(System.in);
        
        int s1=0;
        int s2=0;
        int suma=0;
        int producto=0;
        
        
        System.out.println("Ingrese el primer numero");
        s1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        s2=leer.nextInt();
    
        if(s1==s2){
        
            suma= s1+s2;
            System.out.println("La suma de los numeros "+s1+" + "+s2+" es ="+suma);
        
        }else{
        
            producto= s1*s2;
            System.out.println("El producto de los numeros "+s1+" * "+s2+" es = "+producto);
        }
    }
}
