/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto4;

/**
 *
 * @author AlfonsoRE
 */
public class ProbandoConjunto {

    public static void main(String[] args) {
        ConjuntoEntero ce1 = new ConjuntoEntero();
        ConjuntoEntero ce2 = new ConjuntoEntero();
        ConjuntoEntero ce3 = new ConjuntoEntero();
        ce1.insertarEntero(7);
        ce1.insertarEntero(0);
        ce1.insertarEntero(100);
        ce1.eliminarEntero(9);
        ce1.eliminarEntero(0);
        ce1.insertarEntero(-1);
        ce1.insertarEntero(101);
        ce2.insertarEntero(7);
        ce2.insertarEntero(100);
        ce3.insertarEntero(7);
        ce3.insertarEntero(17);
        ce3.insertarEntero(14);
        ce3.insertarEntero(15);
        System.out.println("ce1: " + ce1.convertirConjuntoaTexto());
        System.out.println("ce2: " + ce2.convertirConjuntoaTexto());
        System.out.println("ce3: " + ce1.convertirConjuntoaTexto(ce3.a));
        System.out.println("ce1==ce2: " + ce1.conjuntosIguales(ce2.a));
        System.out.println("ce2==ce3: " + ce1.conjuntosIguales(ce2.a, ce3.a));
        System.out.println("ce1 union ce2: " + ce1.convertirConjuntoaTexto(ce1.union(ce2.a)));
        System.out.println("ce2 union ce3: " + ce1.convertirConjuntoaTexto(ce1.union(ce2.a, ce3.a)));
        System.out.println("ce1 interseccion ce2: " + ce1.convertirConjuntoaTexto(ce1.interseccion(ce2.a)));
        System.out.println("ce2 interseccion ce3: " + ce1.convertirConjuntoaTexto(ce1.interseccion(ce2.a, ce3.a)));

    }
}
