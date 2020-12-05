// Ejercicio complementario Java numero 7
// Programa que dado un string de entrada en minusculas devuelve un string en MAYUSCULAS.    


package Complementarios_1;
import java.util.Scanner; 


public class Ejercicio_c7 {
    Scanner scan = new Scanner(System.in); 
    String str; 
    String result;
    char ch;
    int continuar;
    
    public void Saludo(){
        System.out.println("\nBienvenido al programa: ");
      }   

    public void Palabra() {
        System.out.println("\nIngrese una frase en minusculas: ");
        str = scan.nextLine();    
    } 
   
    public void Calculo() {
       
          String result = "";
          char ch = ' ';
          for (int i = 0; i < str.length(); i++) {
              
              //check valid alphabet and it is in lowercase
              if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                  ch = (char)(str.charAt(i) - 32);
              }
              //else keep the same alphabet or any character
              else {
                  ch = (char)(str.charAt(i));
              }
              
              result += ch; // concatenation, append c to result
          }
          System.out.println("\nLa palabra en mayusculas es: "+result);
      }   
      
      public void Salir() {
        System.out.println("\nDesea continuar ? ingrese 1 , Desea salir ? ingrese otro numero: ");
        continuar = scan.nextInt();      
        scan.nextLine();   
      }   

    public void Adios() {
        System.out.println("\nHasta luego ! ha salido del programa");
        scan.close(); 
      }  
   public static void main(String[] args) {
        
        Ejercicio_c7 obj2 = new Ejercicio_c7();    
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
