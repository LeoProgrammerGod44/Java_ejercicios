
// Ejercicio numero 5 _ Java

import java.util.Scanner; 

public class ejercicio_5 {
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);    
    System.out.println("\nBienvenido al programa");
    int continuar;  

    do { 
    System.out.println("\nIngrese el numero: ");
    int nro = scan.nextInt();  

    for (int i = 0; i <= 10; i++) {
        System.out.println("\n"+ nro +" * "+ i +" = "+ nro * i);
     }
   
    System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
    continuar = scan.nextInt();   

   } while (continuar == 1); 

   System.out.println("\nHasta luego ! ha salido del programa"); 
   scan.close(); 
  }
} 


