
package pilas.y.colas;

public class Pila {
int[] pila;
  int cima;
  int fondo;
    public Pila(int[] pila) {
        this.pila = pila;
    }

public void insertar(int dato){
    pila[cima]=dato;
    cima++;
 
    
}
public void retirar(){
    pila[cima] = 0;
    cima--;
}

  public  void mostrarPila() {
        for (int i = pila.length; i >0; i--) {
            if(pila[i - 1] !=0){
            System.out.println(pila[i - 1]);
        }}
        
    }
  public int cima(){
      System.out.println("La cima de la pila es: "+ pila[cima -1]);
      return pila[cima -1];
  }
  public int fondo(){
      System.out.println("El fondo de la pila es: "+ pila[fondo]);
   return pila[fondo];
  }










    
}
