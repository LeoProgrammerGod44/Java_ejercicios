
// Ejercicio numero 6 _ Java

import java.util.Scanner; 

public class ejercicio_6 {
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    int continuar = 1;
    
    while (continuar == 1) {
        System.out.println("\nPor Favor ingrese un numero: ");
        int nro = scan.nextInt();    
        System.out.println("\nEl numero ingresado es: "+nro);

        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();  
    }    
    System.out.println("\nHasta luego ! ha salido del programa");
    scan.close();

  }
} 














