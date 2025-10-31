import caso1.EjerciciosAlumno;
import caso2.EjerciciosProducto;
import caso3.EjerciciosLibro;
import caso4.EjerciciosEmpleado;

public class Main {
    public static void main(String[] args) {

        // Caso 1: Alumnos
        EjerciciosAlumno.main(args);
        System.out.println("\n" + "=".repeat(60) + "\n");

        // Caso 2: Productos
        EjerciciosProducto.main(args);
        System.out.println("\n" + "=".repeat(60) + "\n");

        // Caso 3: Libros
        EjerciciosLibro.main(args);
        System.out.println("\n" + "=".repeat(60) + "\n");

        // Caso 4: Empleados
        EjerciciosEmpleado.main(args);
        System.out.println("\n" + "=".repeat(60));

    }
}

