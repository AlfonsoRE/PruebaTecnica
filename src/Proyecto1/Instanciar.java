/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

/**
 *
 * @author AlfonsoRE
 */
public class Instanciar {

    public static void main(String[] args) {
        Direccion d = new Direccion();
        Propietario p = new Propietario("Alfonso", "ROEA8502179D5", "INE", d);
        Auto a = new Auto(p);
        Marca m = new Marca();
        a.setMarca(m);
    }
}
