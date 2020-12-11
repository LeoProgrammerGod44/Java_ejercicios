
// Ejercicio numero 7 _ Java


package Package1;
import java.util.Scanner; 

public class ejercicio_7 {
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    int continuar;
    do {
        System.out.println("\nPor Favor ingrese un numero: ");
        int nro = scan.nextInt();    
        System.out.println("\nEl numero ingresado es: "+nro);

        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();  
    } while (continuar == 1);   

    System.out.println("\nHasta luego ! ha salido del programa");
    scan.close();

  }
} 







