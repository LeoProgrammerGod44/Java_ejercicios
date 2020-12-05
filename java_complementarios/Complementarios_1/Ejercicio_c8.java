// Ejercicio complementario Java numero 8
// Programa que pregunta nombre , apellido , direccion y ciudad. Devuelve los elementos de un array 


package Complementarios_1;
import java.util.Scanner; 
import java.util.ArrayList;


public class Ejercicio_c8 {
    Scanner scan = new Scanner(System.in); 
    ArrayList<String> lista = new ArrayList<String>(); 
    String str, str2, str3, str4; 
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Palabra() {
        System.out.println("\nIngrese el nombre: ");
        str = scan.nextLine();    
        System.out.println("\nIngrese el apellido: ");
        str2 = scan.nextLine();    
        System.out.println("\nIngrese la Direccion: ");
        str3 = scan.nextLine();    
        System.out.println("\nIngrese la Ciudad: ");
        str4 = scan.nextLine();    
    } 
   
    public void Calculo() {
           lista.add(str);
           lista.add(str2);
           lista.add(str3);
           lista.add(str4);
           System.out.println(" ");
           for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+" - ");
          }
           System.out.println(" ");
      }    
      
      public void Salir() {
        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();      
        scan.nextLine();
        lista.clear();   
      }   

    public void Adios() {
        System.out.println("\nHasta luego ! ha salido del programa");
        scan.close(); 
      }  
   public static void main(String[] args) {
        
        Ejercicio_c8 obj2 = new Ejercicio_c8();    
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























































































































