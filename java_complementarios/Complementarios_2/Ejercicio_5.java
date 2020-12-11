
// Ejercicio de complementarios 2 Java numero 5
// Hacer un array con precio por dia , otro array con datos de horas trabajadas que ingresa
// el usuario y el ultimo array muestra el total de monto ,(hora trabajada * precio/hora)
// por ultimo se muestra la suma total a cobrar por las horas trabajadas por dia   

package Complementarios_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_5 {
    Scanner scan = new Scanner(System.in); 
    ArrayList<Integer> lista = new ArrayList<Integer>(); 
    ArrayList<Integer> montos = new ArrayList<Integer>(); 
    ArrayList<Integer> total = new ArrayList<Integer>(); 
    int num1;
    int num2; 
    int num3; 
    int num4; 
    int num5; 
    int num6 = 350;
    int num7 = 345; 
    int num8 = 550; 
    int num9 = 600; 
    int num10 = 320; 
    int sumaTotal;
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    
    public void Añadir() {
        System.out.println("\nIngrese el numero de horas del dia 1 : ");
        num1 = scan.nextInt();    
        System.out.println("Ingrese el numero de horas del dia 2 : ");
        num2 = scan.nextInt();    
        System.out.println("Ingrese el numero de horas del dia 3 : ");
        num3 = scan.nextInt();    
        System.out.println("Ingrese el numero de horas del dia 4 : ");
        num4 = scan.nextInt();    
        System.out.println("Ingrese el numero de horas del dia 5 : ");
        num5 = scan.nextInt();    
    }   
   
    public void Calculo() {
           lista.add(num1);
           lista.add(num2);
           lista.add(num3);
           lista.add(num4);
           lista.add(num5);
           montos.add(num6);
           montos.add(num7);
           montos.add(num8);
           montos.add(num9);
           montos.add(num10);
        
           System.out.println("\nLista de horas trabajadas: "+lista);
           System.out.println("Lista de montos por hora/dia: "+montos);
           
           for(int i=0; i< lista.size(); i++){
             int totalCobrar = lista.get(i) * montos.get(i);
                 total.add(totalCobrar);
            }
           System.out.println("Lista de montos totales a cobrar: "+total);
           sumaTotal = 0;
           for(int i=0; i < total.size(); i++){
                   sumaTotal += total.get(i);
             }
             System.out.println("Lista de suma total a cobrar: $ "+sumaTotal);
      }    
      
      public void Salir() {
        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();      
        scan.nextLine();
        lista.clear();   
        montos.clear();   
        total.clear();   
      }   

    public void Adios() {
        System.out.println("\nHasta luego ! ha salido del programa");
        scan.close(); 
      }  
   public static void main(String[] args) {
        
        Ejercicio_5 obj2 = new Ejercicio_5();    
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
















