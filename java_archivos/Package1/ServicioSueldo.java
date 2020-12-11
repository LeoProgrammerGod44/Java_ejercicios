
// Ejercicio de ejemplo Empleado , practica de clases, objetos y metodos 

package Package1;

public class ServicioSueldo {
    public static void main(String[] args) {
         
         // No se pueden crear objetos de una clase abstracta 
         // Empleado1 emp1 = new Empleado1(1234,"Homero","Simpson");
         
         // Se puede hacer una variable de tipo Empleado1 abstracta 
         // pero se construye el objeto con una clase concreta.  

         Empleado1 emp2 = new EmpleadoEfectivo(5678,"Lisa","Simpson",40000,2);   
         Empleado1 emp3 = new EmpleadoJornada(1234,"Homero","Simpson",100,400);   
         Empleado1 emp4 = new EmpleadoContrato(3210,"Bart","Simpson",15000);   
         
         // se puede cambiar el valor del atributo facilmente 
         // si no esta protegido. 
         // emp1.apellido = "Balboa";   

         // ejecutamos el set para cambiar el atributo 
         // emp1.setNombre("Marge");

         //System.out.println(emp2.toString());
      
         System.out.println("El salario del empleado 1 es: " + emp2.calcularSueldo());  
         System.out.println("El salario del empleado 2 es: " + emp3.calcularSueldo());  
         System.out.println("El salario del empleado 3 es: " + emp4.calcularSueldo());  

       }

} 








































































































