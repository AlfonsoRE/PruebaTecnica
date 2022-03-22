/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

/**
 *
 * @author AlfonsoRE
 */

//TAMBIEN REALICE LA CLASE DE PRUEBA CON JUNIT EN LA CARPETA DE TEST
public class EmployeeTest {

    public static void main(String[] args) {
        System.out.println("testPrueba1");
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        emp1.setNombre("Alfonso");
        emp1.setApellido("Rosas Escobedo");
        emp1.setSalario(30000);
        emp2.setNombre("Pedro");
        emp2.setApellido("Perez");
        emp2.setSalario(20000);
        System.out.println("Salario de " + emp1.getNombre() + ": " + emp1.getSalario());
        System.out.println("Salario de " + emp2.getNombre() + ": " + emp2.getSalario());
        emp1.setSalario(emp1.getSalario() * 1.1);
        emp2.setSalario(emp2.getSalario() * 1.1);
        System.out.println("Salario de " + emp1.getNombre() + ": " + emp1.getSalario());
        System.out.println("Salario de " + emp2.getNombre() + ": " + emp2.getSalario());
        System.out.println("Numeros de empleados en la empresa: " + Empleado.getN_empleados());
    }
}
