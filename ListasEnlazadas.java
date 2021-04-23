/*
Jose Daniel Morales Gomez
Juan Manuel Gonzalez Rincon
*/
package listasenlazadas;


public class ListasEnlazadas {

    
    public static void main(String[] args) {
        ListaEnlazadaSimple miLista = new ListaEnlazadaSimple();
        System.out.println(miLista.isVacia());
        Nodo miPrimerNodo = new Nodo(67);
        Nodo miSegundoNodo = new Nodo(-65);
        Nodo miTercerNodo = new Nodo(77);
        Nodo miCuartoNodo = new Nodo(-95);
        Nodo miQuintoNodo = new Nodo(-44);
        
        
        miLista.setCabeza(miPrimerNodo);
        miPrimerNodo.setSiguiente(miSegundoNodo);
        miSegundoNodo.setSiguiente(miTercerNodo);
        miTercerNodo.setSiguiente(miCuartoNodo);
        miCuartoNodo.setSiguiente(miQuintoNodo);
        
        
        System.out.println(miLista.isVacia());
        miLista.recorrer();
        
        
        
        System.out.println(miLista.localizar(67));
        System.out.println(miLista.localizar(-65));
        System.out.println(miLista.localizar(77));
        System.out.println(miLista.localizar(-95));
        System.out.println(miLista.localizar(-44));
        
        
        miLista.agregarCabeza(-200);
        miLista.recorrer();
        
        System.out.println(miQuintoNodo.getSiguiente());
        miQuintoNodo.setSiguiente(new Nodo(-300));
        miLista.recorrer();
        
        miLista.agregarEnPosicion(10, -400);
        miLista.recorrer();
        
        miLista.suprimirCabeza();
        miLista.suprimirCola();
        miLista.recorrer();
        
        miLista.suprimirEnPosicion(10);
        miLista.recorrer();
    }
    
}
