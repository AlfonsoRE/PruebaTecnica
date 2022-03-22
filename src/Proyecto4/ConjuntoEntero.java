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
public class ConjuntoEntero {

    boolean a[] = new boolean[101];

    public ConjuntoEntero() {
        for (int i = 0; i < a.length; i++) {
            a[i] = false;
        }
    }

    public boolean[] union(boolean c[]) {
        boolean[] nc = new boolean[101];
        for (int i = 0; i < nc.length; i++) {
            if (a[i] || c[i]) {
                nc[i] = true;
            } else {
                nc[i] = false;
            }
        }
        return nc;
    }

    public boolean[] union(boolean c[], boolean c2[]) {
        boolean[] nc = new boolean[101];
        for (int i = 0; i < nc.length; i++) {
            if (c[i] || c2[i]) {
                nc[i] = true;
            } else {
                nc[i] = false;
            }
        }
        return nc;
    }

    public boolean[] interseccion(boolean c[]) {
        boolean[] nc = new boolean[101];
        for (int i = 0; i < nc.length; i++) {
            if (a[i] && c[i]) {
                nc[i] = true;
            } else {
                nc[i] = false;
            }
        }
        return nc;
    }

    public boolean[] interseccion(boolean c[], boolean c2[]) {
        boolean[] nc = new boolean[101];
        for (int i = 0; i < nc.length; i++) {
            if (c[i] && c2[i]) {
                nc[i] = true;
            } else {
                nc[i] = false;
            }
        }
        return nc;
    }

    public void insertarEntero(int k) {
        if (k >= 0 && k <= 100) {
            a[k] = true;
            System.out.println("Entero insertado");
        } else {
            System.out.println("El numero entero se sale del rango(0..100)");
        }
    }

    public void eliminarEntero(int m) {
        if (m >= 0 && m <= 100) {
            a[m] = false;
            System.out.println("Entero eliminado");
        } else {
            System.out.println("El numero entero se sale del rango(0..100)");
        }
    }

    public String convertirConjuntoaTexto() {
        String texto = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                texto += i + " ";
            }
        }
        if (texto.length() > 0) {
            return texto;
        }
        return "-";
    }

    public String convertirConjuntoaTexto(boolean c[]) {
        String texto = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i]) {
                texto += i + " ";
            }
        }
        if (texto.length() > 0) {
            return texto;
        }
        return "-";
    }

    public boolean conjuntosIguales(boolean c[]) {
        boolean ban = true;
        for (int i = 0; i < c.length; i++) {
            if (a[i] != c[i]) {
                ban = false;
            }
        }
        return ban;
    }

    public boolean conjuntosIguales(boolean c[], boolean c2[]) {
        boolean ban = true;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != c2[i]) {
                ban = false;
            }
        }
        return ban;
    }

}
