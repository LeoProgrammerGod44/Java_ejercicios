// Ejercicio complementario Java numero 6
// Programa que solicita dos numeros y realiza la operacion de potencia   


package Complementarios_1;
import java.util.Scanner; 


public class Ejercicio_c6 {
    Scanner scan = new Scanner(System.in); 
    int a;
    int b; 
    int result; 
    int continuar;
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Numero1() {
        System.out.println("\nIngrese el primer numero: ");
        a = scan.nextInt();    
    } 
    public void Numero2() {
        System.out.println("\nIngrese el segundo numero , indica la potencia a elevar el primer numero: ");
        b = scan.nextInt();    
    } 

    public void Calculo() {

         if (a == 0 && b == 0){
            System.out.println("\n ### ERROR 0 elevado a 0 esta indefinido: ");  
         }
         else if (b == 1){
            System.out.println("\nRegla de potenciacion "+a+" ^ 1 = "+a); 
            System.out.println("La potencia es: "+a);
         }
         else if (b == 0){
            System.out.println("\nRegla de potenciacion "+a+" ^ 0 = 1"); 
            System.out.println("La potencia es: 1");
         }
         else { 
            result = 1; 
            for (int i = 1;i <= b; ++i) {
                result *= a;
            }   
            System.out.println("\nEl resutlado de la potencia es: "+result);    
         }
      }  

    public void Salir() {
        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();      
      }   

    public void Adios() {
        System.out.println("\nHasta luego ! ha salido del programa");
        scan.close(); 
      }  
   public static void main(String[] args) {
        Ejercicio_c6 obj2 = new Ejercicio_c6();    
        obj2.continuar = 1;    

        while (obj2.continuar == 1){
            obj2.Saludo(); 
            obj2.Numero1();
            obj2.Numero2();
            obj2.Calculo(); 
            obj2.Salir();
        } 
        obj2.Adios();
        
   } 
} 