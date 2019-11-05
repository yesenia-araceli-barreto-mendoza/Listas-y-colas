package pilas.y.colas;

import javax.swing.JOptionPane;

public class PilasYColas {

    public static void main(String[] args) {
        int pila[] = new int[10];
        int opc;
        Pila objPilaEnteros = new Pila(pila);
        objPilaEnteros.insertar(90);
        objPilaEnteros.insertar(56);
        objPilaEnteros.insertar(23);
        objPilaEnteros.insertar(12);
        String res=JOptionPane.showInputDialog("¿Desea iniciar una pila? si/no");
        if(res.equalsIgnoreCase("si")){
            do{
        
opc=Integer.parseInt(JOptionPane.showInputDialog("Elige la operación que deseas realizar \n1) Insertar \n2) Retirar \n"
        + "3)Mostrar pila \n4) Cimas \n5) Fondos \n6) Salir"));
switch(opc){
    case 1:
        int dato=Integer.parseInt(JOptionPane.showInputDialog("Escribe el dato que deseas insertar"));
        objPilaEnteros.insertar(dato);
        break;
    case 2:
           objPilaEnteros.retirar();
                   break;
    case 3:
         objPilaEnteros.mostrarPila();
         break;
    case 4:
         objPilaEnteros.cima();
    case 5:
           objPilaEnteros.fondo();
    break;
    case 6:
    System.exit(0);
}   }
            while(res != String.valueOf(6));     
    } else{
            System.exit(0);
        }




} 
     
       
    

}
