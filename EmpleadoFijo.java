package utng.gtid2.dab.Herencia;

public class EmpleadoFijo extends Empleado {

    // Atributos propios del empleado fijo
    private double salarioMensual;
    private double bono;

    // Constructor
    public EmpleadoFijo(String nombre,String departamento,double salarioMensual,double bono) {

        // Llama al constructor de la clase padre
        super(nombre, departamento);

        // Guarda el salario mensual
        this.salarioMensual = salarioMensual;

        // Guarda el bono
        this.bono = bono;
    }

    // Sobrescribe calcularSalario()
    @Override
    public double calcularSalario() {

        // Salario = sueldo + bono
        return salarioMensual + bono;
    }

    // Convierte el objeto a texto
    @Override
    public String toString() {

        return "[Empleado Fijo] " + super.toString();
    }
}
