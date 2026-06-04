package utng.gtid2.dab.Herencia;

public class Docente extends Empleado {

    // Atributos propios
    private int materiasImpartidas;
    private double pagoMateria;

    // Constructor
    public Docente(String nombre, int materiasImpartidas, double pagoMateria) {

        // Siempre pertenece al departamento de Docencia
        super(nombre, "Docencia");

        this.materiasImpartidas = materiasImpartidas;
        this.pagoMateria = pagoMateria;
    }

    // Bono extra
    public double bonoCatedra() {

        if (materiasImpartidas >= 3) {

            return 1500.0;
        }

        return 0.0;
    }

    // Calcula salario
    @Override
    public double calcularSalario() {

        return materiasImpartidas * pagoMateria + bonoCatedra();
    }

    // Asigna materia
    public void asignarMateria(String materia) {

        System.out.println(
                nombre + " tiene asignada la materia: "
                        + materia);
    }

    // Mostrar información
    @Override
    public String toString() {

        return "[Docente] " + super.toString();
    }
}