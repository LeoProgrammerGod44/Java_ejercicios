
// Ejercicio de ejemplo Empleado , practica de clases, objetos y metodos 

package Package1;

public class EmpleadoJornada extends Empleado1 {
        
        // definimos los atributos 
        private int horasTrabajadas;
        private int valorPorHora;

        // definimos el constructor de EmpleadoEfectivo con sus atributos + los heredados 
        // super llama al constructor Padre 
        public EmpleadoJornada(int dni , String nombre , String apellido, int horasTrabajadas , int valorPorHora) {
              super(dni, nombre, apellido);
              this.horasTrabajadas = horasTrabajadas;
              this.valorPorHora = valorPorHora;
        }

        @Override
        public int calcularSueldo(){
            return (this.horasTrabajadas * this.valorPorHora);
        }

} 













































































































































