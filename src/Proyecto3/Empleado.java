package Proyecto3;

/**
 *
 * @author AlfonsoRE
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private double salario;
    private static int n_empleados;

    public Empleado() {
        n_empleados++;
    }

    /**
     * @return the n_empleados
     */
    public static int getN_empleados() {
        return n_empleados;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
