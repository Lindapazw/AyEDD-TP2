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

- **`Raiz`**: Nodo que representa la raíz del árbol.
- **Constructor**: Inicializa el árbol vacío.
- **`InsertaNodoHIzq`**: Inserta un hijo izquierdo en un nodo dado. Si el nodo es nulo, crea una nueva raíz.
- **`InsertaNodoHDer`**: Inserta un hijo derecho en un nodo dado. Si el nodo es nulo, crea una nueva raíz.
- **`Inorden`**: Realiza un recorrido en inorden del árbol, imprimiendo los valores de los nodos.
- **`Altura`**: Calcula la altura del árbol, considerando la altura máxima entre los subárboles izquierdo y derecho.

### Clase `ArbolBinario`

La clase principal para ejecutar el código del árbol binario y mostrar su funcionamiento.

```java
class ArbolBinario {
    public static void main(String[] ar) {
        // Crea una instancia del árbol binario
        Arbol A = new Arbol();
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
```

## Conclusión

En este trabajo, hemos implementado un árbol binario básico utilizando Java. La clase `NodoBinario` define la estructura fundamental de un nodo en el árbol, incluyendo el valor almacenado y las referencias a los hijos izquierdo y derecho. La clase `Arbol` gestiona la estructura del árbol binario, permitiendo la inserción de nodos tanto a la izquierda como a la derecha, así como el recorrido del árbol en inorden y el cálculo de su altura.

A través de la implementación del método principal en la clase `ArbolBinario`, hemos demostrado cómo construir un árbol binario con nodos insertados de manera secuencial. El recorrido en inorden del árbol nos ha permitido verificar que los nodos se almacenan y se recorren en el orden correcto. Además, el cálculo de la altura del árbol ha proporcionado una medida de la profundidad de la estructura.

Este ejercicio ha sido útil para comprender la construcción y manipulación de estructuras de datos en Java, específicamente árboles binarios. La implementación y prueba de estas operaciones fundamentales proporcionan una base sólida para trabajar con estructuras de datos más complejas en futuras aplicaciones.

