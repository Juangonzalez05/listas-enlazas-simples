/*
Jose Daniel Morales Gomez
Juan Manuel Gonzalez Rincon
*/
package listasenlazadas;


public class ListaEnlazadaSimple {
 
 private Nodo cabeza;
 public ListaEnlazadaSimple() {
 this.cabeza = null;
 }
 public ListaEnlazadaSimple(Nodo cabeza) {
 this.cabeza = cabeza;
 }
 public Nodo getCabeza() {
 return cabeza;
 }
 public void setCabeza(Nodo cabeza) {
 this.cabeza = cabeza;
 }

 public boolean isVacia() {
 return this.cabeza==null;
 }

 public void anular() {
 this.cabeza = null;
 }

 
 public void recorrer(){
  Nodo nodoActual;
if(this.cabeza !=null){
    nodoActual = this.cabeza;
    System.out.println(nodoActual.getDato());
    while(nodoActual.getSiguiente() !=null){
     
        nodoActual = nodoActual.getSiguiente();
        System.out.println(nodoActual.getDato());
 }
    System.out.println("---------------------------------");
    }  
    }
public Nodo localizar(Integer x){
   Nodo nodoActual = this.cabeza;
   while(nodoActual !=null){
       if(nodoActual.getDato().equals(x)){
           return nodoActual;
       }
       nodoActual = nodoActual.getSiguiente();
   }
   return null;
}
public void agregarCabeza(Integer d){
    Nodo nuevoNodo = new Nodo(d);
    nuevoNodo.setSiguiente(this.cabeza);
    this.cabeza = nuevoNodo;
}

public Nodo ultimo(){
    Nodo ultimoo = null;
    boolean comprobar = true;
    
    if(this.cabeza !=null){
        ultimoo=this.cabeza;
        while(comprobar){
            if(ultimoo.getSiguiente() !=null){
                ultimoo.setSiguiente(this.cabeza);
            }else{
                comprobar=false;
            }
        }
    }
    return ultimoo;
}



public void agregarUltimo(Integer d){
    if(!isVacia()){
        cabeza.siguiente = new Nodo(d);
        cabeza = cabeza.siguiente;
    }
}

public void agregarEnPosicion(int i,int d){
    
    Nodo nuevo=this.cabeza;
    
    for(int j=1; j<i; j++){
        if(nuevo.getSiguiente()== null)
            break;
        nuevo=nuevo.getSiguiente();
    }
    
    Nodo a= new Nodo(d, nuevo.getSiguiente());
    nuevo.setSiguiente(a);
}

public void suprimirCabeza(){
    
    if(cabeza !=null){
     Nodo nodoActual = cabeza;
     cabeza = cabeza.siguiente;
     nodoActual.siguiente  = null;
   
}
    }

public void suprimirCola(){
    if(cabeza != null){
        if(cabeza.siguiente == null){
            cabeza = null;
        }else{
            Nodo puntero = cabeza;
            while(puntero.siguiente.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente=null;
        }
    }
}
public void suprimirEnPosicion(Integer i){
    if(cabeza !=null){
        if(i == 0){
            Nodo nodoActual = cabeza;
            cabeza = cabeza.siguiente;
            nodoActual.siguiente =null;
            
        }
        Nodo puntero=cabeza;
        Nodo temp = puntero.siguiente;
        puntero.siguiente = temp.siguiente;
        temp.siguiente = null;
    }
}


}



