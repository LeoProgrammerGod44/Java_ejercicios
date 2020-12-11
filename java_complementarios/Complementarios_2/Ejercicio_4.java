
// Ejercicio de complementarios 2 Java numero 4
// Agregar 12 nombres a un Arraylist , subdividir el arraylist y mostrar el array completo 
// y las 3 subdivisiones del mismo array.   

package Complementarios_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_4 {
    Scanner scan = new Scanner(System.in); 
    ArrayList<String> lista = new ArrayList<String>(); 
    String str1 = "Pedro"; 
    String str2 = "jack"; 
    String str3 = "leandro"; 
    String str4 = "pablo"; 
    String str5 = "fulano"; 
    String str6 = "walt disney"; 
    String str7 = "eskere"; 
    String str8 = "luke skywalker"; 
    String str9 = "Kurco"; 
    String str10 = "mengano"; 
    String str11 = "sultano"; 
    String str12 = "john";  
    int continuar; 
    
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   
   
    public void Calculo() {
           lista.add(str1);
           lista.add(str2);
           lista.add(str3);
           lista.add(str4);
           lista.add(str5);
           lista.add(str6);
           lista.add(str7);
           lista.add(str8);
           lista.add(str9);
           lista.add(str10);
           lista.add(str11);
           lista.add(str12);
           
           System.out.println(" ");
           List<String> sublist1 = lista.subList(0, 4);
           List<String> sublist2 = lista.subList(4, 8);
           List<String> sublist3 = lista.subList(8, 12);
           System.out.println("Lista completa de nombres: "+lista);
           System.out.println("Curso 1 -> "+sublist1);
           System.out.println("Curso 2 -> "+sublist2);
           System.out.println("Curso 3 -> "+sublist3);
        
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
        
        Ejercicio_4 obj2 = new Ejercicio_4();    
        obj2.continuar = 1;    

        while (obj2.continuar == 1){
            obj2.Saludo(); 
            obj2.Calculo(); 
            obj2.Salir();
        } 
        obj2.Adios();
        
   } 
} 




