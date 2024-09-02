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
