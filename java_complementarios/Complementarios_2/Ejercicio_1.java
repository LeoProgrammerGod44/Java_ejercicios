
// Ejercicio de complementarios 2 Java numero 1  
// Colocar ciudades en un array y devolverlas en un Ranking   

package Complementarios_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_1 {
    Scanner scan = new Scanner(System.in); 
    ArrayList<String> lista = new ArrayList<String>(); 
    String str1, str2, str3; 
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Palabra() {
        System.out.println("\nIngrese la ciudad #1 : ");
        str1 = scan.nextLine();    
        System.out.println("\nIngrese la ciudad #2 : ");
        str2 = scan.nextLine();    
        System.out.println("\nIngrese la ciudad #3 : ");
        str3 = scan.nextLine();    

    } 
   
    public void Calculo() {
           lista.add(str1);
           lista.add(str2);
           lista.add(str3);
           System.out.println(" ");
           int contador = 0;
           for (int i = 0; i < lista.size(); i++) {
            contador++;
            System.out.println("Ciudad "+"#"+contador+" - "+lista.get(i));
          }
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
        
        Ejercicio_1 obj2 = new Ejercicio_1();    
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
