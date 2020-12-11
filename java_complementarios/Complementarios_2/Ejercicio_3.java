
// Ejercicio de complementarios 2 Java numero 3
// Agregar numeros de la baraja francesa a un arraylist y mostrar el array ordenado
// al reves y mezclado. 


package Complementarios_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_3 {
    Scanner scan = new Scanner(System.in); 
    ArrayList<Integer> lista = new ArrayList<Integer>(); 
    int num1 = 1;
    int num2 = 2; 
    int num3 = 3; 
    int num4 = 4; 
    int num5 = 5; 
    int num6 = 6; 
    int num7 = 7;
    int num8 = 8;
    int num9 = 9;
    int num10 = 10;
    int num11 = 11;
    int num12 = 12;
    int num13 = 13;
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   
   
    public void Calculo() {
           lista.add(num1);
           lista.add(num2);
           lista.add(num3);
           lista.add(num4);
           lista.add(num5);
           lista.add(num6);
           lista.add(num7);
           lista.add(num8);
           lista.add(num9);
           lista.add(num10);
           lista.add(num11);
           lista.add(num12);
           lista.add(num13);

           System.out.println(" ");
           System.out.println("Lista original");
           System.out.println("Baraja sin mezclar: "+lista);
           Collections.reverse(lista);
           System.out.println("Baraja al reves: "+lista);
           Collections.shuffle(lista);
           System.out.println("Baraja mezclada: "+lista);
           
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
        
        Ejercicio_3 obj2 = new Ejercicio_3();    
        obj2.continuar = 1;    

        while (obj2.continuar == 1){
            obj2.Saludo(); 
            obj2.Calculo(); 
            obj2.Salir();
        } 
        obj2.Adios();
        
   } 
} 













