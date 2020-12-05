package Complementarios_1;
import java.util.Scanner; 
// Ejercicio complementario Java numero 2
// Solicitar dos numeros enteros al usuario e imprimir resultados de suma , resta , multiplicacion
// division y modulo de ambos numeros. 
// Realizado con objetos , metodos y un ciclo do while 

public class Ejercicio_c2 {
  Scanner scan = new Scanner(System.in);
  int continuar; 
  int a = 1;
  int b = 1; 
  
        public void Saludo(){
          System.out.println("\nBienvenido al programa: ");
        } 
        
        public void Numero1() {
          System.out.println("\nIngrese el primer numero: ");
          a = scan.nextInt();    
        } 
        public void Numero2() {
          System.out.println("\nIngrese el segundo numero: ");
          b = scan.nextInt();    
        } 
        public void Results() {
          System.out.println("\nLos resultados de las operaciones son: ");
          int suma = a + b;
          int resta = a - b;
          int multiplicacion = a * b;
          int division = a / b;
          int modulo = a % b;
          System.out.println("\nSuma: "+suma);
          System.out.println("Resta: "+resta);
          System.out.println("Multiplicacion: "+multiplicacion);
          System.out.println("Division: "+division);
          System.out.println("Modulo: "+modulo);
        } 
        public void Salir() {
          System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
          continuar = scan.nextInt();  
          scan.nextLine();
        } 
        public static void main(String[] args) {
      
          Ejercicio_c2 obj1 = new Ejercicio_c2();
          
          do {
              obj1.Saludo();
              obj1.Numero1();
              obj1.Numero2();
              obj1.Results();
              obj1.Salir();
      
          } while (obj1.continuar == 1);   
      
          System.out.println("\nHasta luego ! ha salido del programa");
          obj1.scan.close();
      }
} 