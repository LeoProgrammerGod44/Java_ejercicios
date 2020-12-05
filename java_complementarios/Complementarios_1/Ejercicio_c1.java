// Ejercicio complementario Java numero 1  
// Solicitar por consola un nombre asignarlo a una variable e imprimirlo como "Hola Usuario"
// Realizado con objetos, metodos y un ciclo do while 

package Complementarios_1;
import java.util.Scanner; 


public class Ejercicio_c1 {
  Scanner scan = new Scanner(System.in);
  int continuar; 
  
  public void Metodo1() {
    System.out.println("\nPor Favor ingrese un nombre: ");
    String nombre = scan.nextLine();    
    System.out.println("\nHola "+nombre+" !");
  } 
  public void Metodo2() {
    System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
    continuar = scan.nextInt();  
    scan.nextLine();
  } 
  public static void main(String[] args) {

    Ejercicio_c1 obj1 = new Ejercicio_c1();
    Scanner scan = new Scanner(System.in);
    //int continuar;
    do {
        obj1.Metodo1();
        obj1.Metodo2();

    } while (obj1.continuar == 1);   

    System.out.println("\nHasta luego ! ha salido del programa");
    scan.close();
}
} 