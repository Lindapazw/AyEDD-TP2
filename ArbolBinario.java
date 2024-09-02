//*********************************************************
//* Archivo: ArbolBinario.java
//* Descripción: Implementación de un árbol binario con operaciones básicas
//* Nombre: Linda Candela Paz
//* Legajo: VINF013378
//* DNI: 42379854

import java.io.*; // Importación de funcionalidades para entrada y salida

// Clase que define un nodo en el árbol binario
class NodoBinario {
    int dato; // Valor almacenado en el nodo
    NodoBinario Hizq, Hder; // Referencias a los hijos izquierdo y derecho

    // Constructor del nodo binario
    NodoBinario(int Elem) {
        dato = Elem; // Asigna el valor al nodo
        Hizq = Hder = null; // Inicializa los hijos como nulos
    }
}

// Clase que define el árbol binario
class Arbol {
    public NodoBinario Raiz; // Nodo que representa la raíz del árbol

    // Constructor del árbol
    public Arbol() {
        Raiz = null; // Inicializa el árbol vacío
    }

    // Inserta un hijo izquierdo en un nodo dado
    public NodoBinario InsertaNodoHIzq(NodoBinario Nodo, int Elem) {
        NodoBinario result = null;
        if (Nodo == null) {
            NodoBinario NodoAux = new NodoBinario(Elem);
            result = NodoAux;
            Raiz = NodoAux;
        } else {
            if (Nodo.Hizq == null) {
                NodoBinario NodoAux = new NodoBinario(Elem);
                Nodo.Hizq = NodoAux;
                result = NodoAux;
            } else {
                System.out.print("ERR- Hijo izquierdo no es nulo");
            }
        }
        return result;
    }

    // Inserta un hijo derecho en un nodo dado
    public NodoBinario InsertaNodoHDer(NodoBinario Nodo, int Elem) {
        NodoBinario result = null;
        if (Nodo == null) {
            NodoBinario NodoAux = new NodoBinario(Elem);
            result = NodoAux;
            Raiz = NodoAux;
        } else {
            if (Nodo.Hder == null) {
                NodoBinario NodoAux = new NodoBinario(Elem);
                Nodo.Hder = NodoAux;
                result = NodoAux;
            } else {
                System.out.print("ERR- Hijo derecho no es nulo");
            }
        }
        return result;
    }

    // Recorre el árbol en inorden
    public void Inorden(NodoBinario Nodo) {
        if (Nodo != null) {
            Inorden(Nodo.Hizq);
            System.out.print(Nodo.dato + " ");
            Inorden(Nodo.Hder);
        }
    }

    // Calcula la altura del árbol
    public int Altura(NodoBinario Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            int AlturaIzq = Altura(Nodo.Hizq);
            int AlturaDer = Altura(Nodo.Hder);
            return Math.max(AlturaIzq, AlturaDer) + 1;
        }
    }
}

// Clase principal para ejecutar el código del árbol binario
class ArbolBinario {
    public static void main(String[] ar) {

        Arbol A = new Arbol(); // Crea una instancia del árbol binario
        System.out.print("Agregando la raiz 30 \n");
        // Inserta nodos en el árbol
        NodoBinario NodoAux = null, NodoAux2 = null, NodoAux3 = null, NodoAux4 = null;
        NodoAux2 = A.InsertaNodoHIzq(NodoAux, 30); // Inserta la raíz
        NodoAux = NodoAux2; // Actualiza el nodo auxiliar
        NodoAux2 = A.InsertaNodoHIzq(NodoAux, 25); // Inserta un hijo izquierdo
        NodoAux3 = A.InsertaNodoHDer(NodoAux, 45); // Inserta un hijo derecho
        NodoAux = NodoAux2; // Actualiza el nodo auxiliar
        NodoAux2 = A.InsertaNodoHIzq(NodoAux, 20); // Inserta un hijo izquierdo
        NodoAux4 = A.InsertaNodoHDer(NodoAux, 27); // Inserta un hijo derecho

        // Muestra el árbol en inorden y la altura del árbol
        System.out.print("\n El árbol binario en In orden es: \n");
        A.Inorden(A.Raiz);
        Integer Altura = new Integer(A.Altura(A.Raiz));
        System.out.print("\n La altura del árbol es: " + Altura.toString() + "\n");
    }
}
