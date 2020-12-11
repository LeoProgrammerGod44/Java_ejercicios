
// Ejercicio de ejemplo Empleado , practica de clases, objetos y metodos 

package Package1;

public class EmpleadoEfectivo extends Empleado1 {
        
        // definimos los atributos 
        private int sueldo;
        private int antiguedad;

        // definimos el constructor de EmpleadoEfectivo con sus atributos + los heredados 
        // super llama al constructor Padre 
        public EmpleadoEfectivo(int dni , String nombre , String apellido, int sueldo ,
        int antiguedad) {
              super(dni, nombre, apellido);
              this.sueldo = sueldo;
              this.antiguedad = antiguedad;
        }

        @Override
        public int calcularSueldo(){
            return (this.sueldo + (this.antiguedad * 1000));
        }

} 














































































































