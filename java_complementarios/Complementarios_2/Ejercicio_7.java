
// Ejercicio de complementarios 2 Java numero 7
//  

package Complementarios_2;

//import Complementarios_2.Empleado;
import java.util.Scanner;


public class Ejercicio_7 {

  

  Scanner scan = new Scanner(System.in);
  int continuar;

  public void Saludo() {
    System.out.println("\nBienvenido al programa: ");
  }

  public void Calculo() {
    
  }

  
  public void Salir() {
    System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
    continuar = scan.nextInt();
    scan.nextLine();
  }

  public void Adios() {
    System.out.println("\nHasta luego ! ha salido del programa");
    scan.close();
  }

  public static void main(String[] args) {

    Ejercicio_7 objLocal = new Ejercicio_7();

        objLocal.continuar = 1;    

        while (objLocal.continuar == 1){
            objLocal.Saludo();
            //objLocal.MostrarEmp();
            objLocal.Calculo();
            objLocal.Salir();
        } 
        objLocal.Adios();
        
   } 
} 



