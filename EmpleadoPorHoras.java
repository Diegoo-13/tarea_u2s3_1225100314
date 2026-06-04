package utng.gtid2.dab.Herencia;

public class EmpleadoPorHoras extends Empleado {

    // Atributos propios
    private int horasTrabajadas;
    private double tarifaHora;

    // Constructor
    public EmpleadoPorHoras(String nombre, String departamento, int horasTrabajadas, double tarifaHora) {

        // Constructor del padre
        super(nombre, departamento);

        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    // Calcula salario
    @Override
    public double calcularSalario() {

        return horasTrabajadas * tarifaHora;
    }

    // Getter
    public int getHorasTrabajadas() {

        return horasTrabajadas;
    }

    // Mostrar información
    @Override
    public String toString() {

        return "[Empleado Por Horas] " + super.toString();
    }
}
