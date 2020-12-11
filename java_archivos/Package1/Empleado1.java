
// Ejercicio de ejemplo Empleado , practica de clases, objetos y metodos 

// Notas: el encapsulamiento es la propiedad de un lenguaje OOP para poder ocultar 
// ciertas partes del codigo que no deben ser modificadas tan facilmente. 
// La clase abstracta no se puede instanciar con New , pero otras clases pueden heredar 
// sus caracteristicas.  

package Package1;
public abstract class Empleado1 {

         // atributos de la clase Empleado1 
         // se definen privados para que no puedan ser accedidos ni modificados 
         // desde otra clase  
         private int dni;
         private String nombre;   
         private String apellido;   
        
      
         // constructor de la clase Empleado1 
         // puede ser publico o protegido 
         public Empleado1(int dni , String nombre , String apellido){
             this.dni = dni;
             this.nombre = nombre;
             this.apellido = apellido;
         }


         // Metodo abstracto , establece cual es la firma que deben llevar las 
         // clases que hereden de Empleado1 
         public abstract int calcularSueldo();


         // metodo set para poder asignar un nombre nuevo , siendo el atributo private 
         // es la forma de poder acceder al atributo 
         public void setNombre(String nombre) {
             this.nombre = nombre;
         }
      
         // Override sobreescribe el metodo del padre 
         // Metodo toString devuelve una representacion en string de un objeto  
         // Los metodos pueden ser publicos , privados o protegidos 
         @Override
         public String toString(){
             return String.valueOf(this.dni) +
             " - " + this.nombre +
             " - " + this.apellido;
         }
   

} 













