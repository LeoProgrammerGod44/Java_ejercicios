
// Ejercicio de complementarios 2 Java numero 6
// Armar un HashSet con objetos de empleados que contienen dni , nombre , apellido ,
// horas trabajadas y valor por hora.
// Se calcula la cantidad de horas trabajadas por el precio por hora.
// Luego se cargan los dni y los salarios calculados a un HashMap
// Por ultimo se muestra el HashMap  

package Complementarios_2;

//import Complementarios_2.Empleado;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class Ejercicio_6 {

  static Set<Empleado> empleado1 = new HashSet<>();

  // colocar parametros al Map , < clave / valor >
  static Map<Integer, Integer> EMP = new HashMap<>();

  static Empleado obj1 = new Empleado(111222, "mango", "yeyo", 42, 250);
  static Empleado obj2 = new Empleado(333444, "lalo", "pepo", 30, 200);
  static Empleado obj3 = new Empleado(555666, "mila", "nesa", 50, 350);
  static Empleado obj4 = new Empleado(777888, "juanjo", "maña", 47, 450);

  Scanner scan = new Scanner(System.in);
  int continuar;

  public void Saludo() {
    System.out.println("\nBienvenido al programa: ");
  }

  public void Calculo() {
    System.out.println("El salario del empleado 1 "+"de nombre: "+obj1.MostrarNombre()+" apellido: "+obj1.MostrarApellido()+" "+obj1.CalculoDeSalario());
    System.out.println("El salario del empleado 2 "+"de nombre: "+obj2.MostrarNombre()+" apellido: "+obj2.MostrarApellido()+" "+obj2.CalculoDeSalario());
    System.out.println("El salario del empleado 3 "+"de nombre: "+obj3.MostrarNombre()+" apellido: "+obj3.MostrarApellido()+" "+obj3.CalculoDeSalario());
    System.out.println("El salario del empleado 4 "+"de nombre: "+obj4.MostrarNombre()+" apellido: "+obj4.MostrarApellido()+" "+obj4.CalculoDeSalario());
    System.out.println("\n");
  }

  public void MostrarEmp() {
    //System.out.println("El hashSet es: "+empleado1);
    for (Empleado i : empleado1) {
      System.out.println(i);
    }
  }

  public void Map() {
    for (Empleado i : empleado1) {
      EMP.put(i.MostrarDni(), i.CalculoDeSalario());
    }
  }

  public void MostrarMap() {
    System.out.println("Map de empleados: ");
    for (Object i : EMP.keySet()) {
      System.out.println("Dni: " + i + " Salario: " + EMP.get(i));
    }

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

    Ejercicio_6 objLocal = new Ejercicio_6();

        empleado1.add(obj1);
        empleado1.add(obj2);
        empleado1.add(obj3);
        empleado1.add(obj4);
        objLocal.continuar = 1;    

        while (objLocal.continuar == 1){
            objLocal.Saludo();
            //objLocal.MostrarEmp();
            objLocal.Calculo();
            objLocal.Map();
            objLocal.MostrarMap();
            objLocal.Salir();
        } 
        objLocal.Adios();
        
   } 
} 












