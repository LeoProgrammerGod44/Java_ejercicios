
// Ejercicio de complementarios 2 Java numero 2
// Colocar numeros en un array , agregar un numero al inicio y uno al final y mostrar la 
// iteracion antes de agregar el primer numero , despues del primer numero y despues del 
// segundo numero agregado  


package Complementarios_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {
    Scanner scan = new Scanner(System.in); 
    ArrayList<Integer> lista = new ArrayList<Integer>(); 
    int num0 = 0;
    int num1 = 1; 
    int num2 = 2; 
    int num3 = 3; 
    int num4 = 4; 
    int num5 = 5; 
    int num6 = 0;
    int numExtra;
    int numExtra2;
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Añadir() {
        System.out.println("\nIngrese el numero 1 : ");
        numExtra = scan.nextInt();    
        System.out.println("\nIngrese el numero 2 : ");
        numExtra2 = scan.nextInt();    
    } 
   
    public void Calculo() {
           lista.add(num0);
           lista.add(num1);
           lista.add(num2);
           lista.add(num3);
           lista.add(num4);
           lista.add(num5);
           lista.add(num6);
           System.out.println(" ");
           System.out.println("Lista original");
           int contador = 0;
           for (int i = 1; i < (lista.size()) - 1; i++) {
            contador++;
            System.out.println("Numero "+"#"+contador+" - "+lista.get(i));
          }
          contador = 0;
          //lista.add(numExtra); 
          lista.set(0, numExtra);
          System.out.println("\nLista con numero al inicio");
           for (int i = 0; i < (lista.size()) - 1; i++) {
            contador++;
            System.out.println("Numero "+"#"+contador+" - "+lista.get(i));
          }
          contador = 0;
          //lista.add(numExtra2); 
          lista.set(6, numExtra2);
          System.out.println("\nLista con numero al final");
          for (int i = 0; i < lista.size(); i++) {
            contador++;
            System.out.println("Numero "+"#"+contador+" - "+lista.get(i));
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
        
        Ejercicio_2 obj2 = new Ejercicio_2();    
        obj2.continuar = 1;    

        while (obj2.continuar == 1){
            obj2.Saludo(); 
            obj2.Añadir();
            obj2.Calculo(); 
            obj2.Salir();
        } 
        obj2.Adios();
        
   } 
} 