package utng.gtid2.dab.Herencia;

public class Main {

    public static void main(String[] args) {

        // Creamos un empleado fijo
        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Ana", "TI", 15000, 2500);

        // Creamos un empleado por horas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Luis", "Mantenimiento", 160, 85.0);

        // Creamos un docente
        Docente docente = new Docente("Dr. Garcia", 4, 3500.0);

        // Probamos el cálculo de salario de cada tipo de empleado
        System.out.println(empleadoFijo.calcularSalario()); // 17500.0
        System.out.println(empleadoPorHoras.calcularSalario()); // 13600.0
        System.out.println(docente.calcularSalario());  // 15500.0

        System.out.println("--------------------");

        // Creamos un arreglo con espacio para 6 empleados
        Empleado[] empleados = new Empleado[6];

        // Guardamos los empleados ya creados
        empleados[0] = empleadoFijo;
        empleados[1] = empleadoPorHoras;
        empleados[2] = docente;

        // Creamos y guardamos más empleados directamente
        empleados[3] = new EmpleadoFijo("Maria", "RH", 12000, 1000);
        empleados[4] = new EmpleadoPorHoras("Carlos", "Soporte", 100, 90.0);
        empleados[5] = new Docente("Mtra. Lopez", 2, 3000.0);

        // Generamos un reporte de todos los empleados
        generarReporte(empleados);

        // Calculamos la nómina total
        double total = calcularNomina(empleados);

        // Mostramos el total de salarios pagados
        System.out.println("Total de nomina mensual: $" + total);
    }

    //CALCULAR LA NÓMINA TOTAL
    public static double calcularNomina(Empleado[] empleados) {

        // Variable acumuladora
        double total = 0;

        // Recorremos todos los empleados
        for (Empleado empleado : empleados) {

            // Sumamos el salario de cada empleado
            total = total + empleado.calcularSalario();
        }

        // Regresamos el total acumulado
        return total;
    }

    // MÉTODO PARA GENERAR UN REPORTE
    public static void generarReporte(Empleado[] empleados) {

        // Recorremos todos los empleados
        for (Empleado empleado : empleados) {

            // Mostramos la información del empleado
            System.out.println(empleado.toString());

            // Verificamos si el empleado es un docente
            if (empleado instanceof Docente) {

                // Convertimos el empleado a tipo Docente
                Docente docente = (Docente) empleado;

                // Asignamos una materia para mostrar el uso de instanceof
                docente.asignarMateria("POO");
            }

            // Verificamos si el empleado es por horas
            if (empleado instanceof EmpleadoPorHoras) {

                // Convertimos el empleado a EmpleadoPorHoras
                EmpleadoPorHoras porHoras = (EmpleadoPorHoras) empleado;

                // Mostramos las horas trabajadas
                System.out.println("Horas trabajadas: " + porHoras.getHorasTrabajadas());
            }

            // Línea separadora para que el reporte se vea más ordenado
            System.out.println("--------------------");
        }
    }
}