// Ejercicio complementario Java numero 4
// Programa que calcula el factorial de un numero 

package Complementarios_1;
import java.util.Scanner; 


public class Ejercicio_c4 {
    Scanner scan = new Scanner(System.in); 
    long a; 
    int iFactorial;
    char continuar;
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Numero1() {
        System.out.println("\nIngrese un numero para calcular su factorial: ");
        a = scan.nextLong();    
      } 

    public void Calculo() {
      
      int iFactorial = 1;  
      for (int i = 1;i <= a; i++) {
        iFactorial = iFactorial * i;
       }
       System.out.println("\nEl factorial de "+a+" es "+iFactorial);   
      }  

    public void Salir() {
        System.out.println("\nDesea continuar ? ingrese c o C , Desea salir ? ingrese otra letra: ");
        continuar = scan.next().charAt(0);      
      }   

    public void Adios() {
        System.out.println("\nHasta luego ! ha salido del programa");
        scan.close(); 
      }  
   public static void main(String[] args) {
        Ejercicio_c4 obj2 = new Ejercicio_c4();    
        obj2.continuar = 'c';    

        while (obj2.continuar == 'c' || obj2.continuar == 'C'){
            obj2.Saludo(); 
            obj2.Numero1();
            obj2.Calculo(); 
            obj2.Salir();
        } 
        obj2.Adios();
        
   } 
} 
