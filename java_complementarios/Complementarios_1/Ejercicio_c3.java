// Ejercicio complementario Java numero 3  
// Solicitar un numero para luego imprimir una secuencia de numeros en forma de piramide 
// Realizado con objetos , metodos , un ciclo for y un ciclo do while.  


package Complementarios_1;
import java.util.Scanner;


public class Ejercicio_c3 {
  Scanner scan = new Scanner(System.in);
  int continuar; 
  int a;
  
        public void Saludo(){
          System.out.println("\nBienvenido al programa: ");
        } 
        
        public void Numero1() {
          System.out.println("\nIngrese un numero para crear una piramide: ");
          a = scan.nextInt();    
        } 

        public void Results() {
          System.out.println("\nEl resultado es: ");
        
          for(int i = 1; i <= a; ++i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.print("    ___ linea => "+i);
            System.out.println();
         }

        }  

        public void Salir() {
          System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
          continuar = scan.nextInt();  
          scan.nextLine();
        } 
        public static void main(String[] args) {
      
          Ejercicio_c3 obj1 = new Ejercicio_c3();
          
          do {
              obj1.Saludo();
              obj1.Numero1();
              obj1.Results();
              obj1.Salir();
      
          } while (obj1.continuar == 1);   
      
          System.out.println("\nHasta luego ! ha salido del programa");
          obj1.scan.close();
      }
} 