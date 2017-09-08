package holamundo;
import java.util.Scanner;

public class ejer3 {
    public static void main(String [] arg){
        Scanner leer=new Scanner(System.in);
        
        double hipo=0;
        double opuesto=0;
        double adyacente=0;
        
        System.out.println("Ingrese el lado opuesto de su triangulo");
        opuesto=leer.nextDouble();
        
        System.out.println("Ingrese el lado adyacente de su triangulo");
        adyacente=leer.nextDouble();
        
        hipo=Math.sqrt(((Math.pow(opuesto, 2))+(Math.pow(adyacente, 2))));
    
        System.out.println("La Hipotenusa del triangulo es = "+hipo);
    }
    
}
