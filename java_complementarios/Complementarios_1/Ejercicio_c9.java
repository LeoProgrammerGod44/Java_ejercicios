// Ejercicio complementario Java numero 9
// Programa que pide una palabra o frase y luego una letra. Escanea cuantas veces aparece la letra en la //palabra 


package Complementarios_1;
import java.util.Scanner; 



public class Ejercicio_c9 {
    Scanner scan = new Scanner(System.in); 
    char caracter;
    int posicion; 
    int contador = 0; 
    String str; 
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Palabra() {
        System.out.println("\nIngrese la palabra a escanear: ");
        str = scan.nextLine(); 
        System.out.println("\nIngrese la letra a escanear de la palabra "+str);
        caracter = scan.next().charAt(0); 
    } 
   
    public void Calculo() {
           posicion = str.indexOf(caracter);   
           while (posicion != -1){
                contador++;
                posicion =   str.indexOf(caracter, posicion + 1);
           }
           System.out.println("\nEL numero de veces que aparece la letra "+caracter+" en la palabra "+str+" es "+contador);
      }    
      
      public void Salir() {
        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();      
        scan.nextLine();   
        contador = 0;
      }   

    public void Adios() {
        System.out.println("\nHasta luego ! ha salido del programa");
        scan.close(); 
      }  
   public static void main(String[] args) {
        
        Ejercicio_c9 obj2 = new Ejercicio_c9();    
        obj2.continuar = 1;    

        while (obj2.continuar == 1){
            obj2.Saludo(); 
            obj2.Palabra();
            obj2.Calculo(); 
            obj2.Salir();
        } 
        obj2.Adios();
        
   } 
} 



















