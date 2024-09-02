# ArbolBinario.java

## Descripción
Este archivo implementa un árbol binario básico en Java. Incluye operaciones para insertar nodos, recorrer el árbol en orden y calcular su altura.

## Contenido

### Importaciones
```java
import java.io.*;
```

### Clase `NodoBinario`
Define la estructura básica de un nodo en el árbol binario.
```java
class NodoBinario {
    int dato; // Valor almacenado en el nodo
    NodoBinario Hizq, Hder; // Referencias a los hijos izquierdo y derecho

    // Constructor del nodo binario
    NodoBinario(int Elem) {
        dato = Elem; // Asigna el valor al nodo
        Hizq = Hder = null; // Inicializa los hijos como nulos
    }
}
```

- **`dato`**: Almacena el valor del nodo.
- **`Hizq`**: Referencia al hijo izquierdo.
- **`Hder`**: Referencia al hijo derecho.
- **Constructor**: Inicializa el nodo con un valor y establece los hijos como nulos.

### Clase `Arbol`
Define la estructura del árbol binario y las operaciones básicas.
```java
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
            Inorden(Nodo.Hizq); // Recorre el subárbol izquierdo
            System.out.print(Nodo.dato + " "); // Imprime el dato del nodo actual
            Inorden(Nodo.Hder); // Recorre el subárbol derecho
        }
    }

    // Calcula la altura del árbol
    public int Altura(NodoBinario Nodo) {
        if (Nodo == null) {
            return 0; // La altura de un nodo nulo es 0
        } else {
            // Calcula la altura de los subárboles izquierdo y derecho
            int AlturaIzq = Altura(Nodo.Hizq);
            int AlturaDer = Altura(Nodo.Hder);
            // Devuelve la altura máxima de los subárboles más 1 (para el nodo actual)
            return Math.max(AlturaIzq, AlturaDer) + 1;
        }
    }
}
```
