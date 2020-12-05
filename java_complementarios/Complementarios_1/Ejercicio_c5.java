// Ejercicio complementario Java numero 5
// Programa que realiza la multiplicacion por sumas sucesivas   


package Complementarios_1;
import java.util.Scanner; 


public class Ejercicio_c5 {
    Scanner scan = new Scanner(System.in); 
    int a;
    int b; 
    int result; 
    int continuar;
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Numero1() {
        System.out.println("\nIngrese el primer numero a multiplicar: ");
        a = scan.nextInt();    
    } 
    public void Numero2() {
        System.out.println("\nIngrese el segundo numero a multiplicar: ");
        b = scan.nextInt();    
    } 

    public void Calculo() {

         if ((a <= 0) || (b <= 0)){
            System.out.println("\n###ERROR ingrese numeros mayores a 0: ");  
         }
         else { 
            result = 0; 
            for (int i = 1;i <= b; ++i) {
                result += a;
            }   
            System.out.println("\nEl resutlado de la multiplicacion es: "+result);    
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
        Ejercicio_c5 obj2 = new Ejercicio_c5();    
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



































































































































