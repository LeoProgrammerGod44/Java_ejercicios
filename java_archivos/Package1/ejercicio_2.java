
// Ejercicio numero 2 _ Java

package Package1;
import java.util.*; 

public class ejercicio_2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nBienvenido al programa: ");    
    int continuar; 
    
    do {   
      System.out.println("\nIngrese el primer numero: ");
      int a = scan.nextInt(); 
      System.out.println("\nIngrese el segundo numero: ");
      int b = scan.nextInt(); 
      System.out.println("\nIngrese el tercer numero: ");
      int c = scan.nextInt();
  
      System.out.println("\nEl primer numero ingresado es: "+ a);
      System.out.println("El segundo numero ingresado es: "+ b);
      System.out.println("El tercer numero ingresado es: "+ c);
      System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
      continuar = scan.nextInt();  
       
    } while (continuar == 1);

    System.out.println("\nHasta luego ! ha salido del programa");
    scan.close();
    }
}
