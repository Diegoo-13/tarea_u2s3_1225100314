package utng.gtid2.dab.Herencia;

public class Empleado {

    // Atributos protegidos: los hijos pueden usarlos directamente
    protected String nombre;
    protected String departamento;
    protected int numEmpleado;

    // Contador compartido por todos los empleados
    private static int contadorEmpleados = 0;

    // Constructor de la clase padre
    public Empleado(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;

        // Cada vez que se crea un empleado, aumenta el contador
        contadorEmpleados = contadorEmpleados + 1;

        // Asigna el número de empleado
        this.numEmpleado = contadorEmpleados;
    }

    // Método base: los hijos lo van a cambiar con @Override
    public double calcularSalario() {
        return 0.0;
    }

    // Muestra información básica
    public void mostrarInfo() {
        System.out.println("Numero empleado: " + numEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
    }

    // Devuelve la información como texto
    @Override
    public String toString() {
        return "[" + numEmpleado + "] " + nombre + " | " + departamento + " | $" + calcularSalario();
    }
}