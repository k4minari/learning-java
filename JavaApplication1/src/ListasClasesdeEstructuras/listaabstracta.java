/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasClasesdeEstructuras;

/**Define la estructura general de la lista enlazada. La implementacion 
 * la establece la subclase
 *
 * @author sl004
 * @param <T> Tipo de objeto que cotentra; la lista.
 */
public abstract class listaabstracta<T> {
    /**Almacena el tamaño de la lista*/
    int n;
    
    public listaabstracta(){
        n=0;
    }
    
    public abstract NewClass firts();
    public abstract boolean vacia ();
    
    /**Inserta el valor dado a contianuacion;n del nodo dado, retornando
     * false si no se pudo insertar
     * 
     * @param valor el valor al insertar 
     * @param nodo el nodo luego del cual se va a agregar un nodo nuevo
     * @return <code>true</code> si se pudo insertar,<br>
     *         <code>false</code> en caso contrario 
     */
    public abstract boolean insertar(T valor, NewClass nodo);
    
    /**Elimina el nodo dado de la lista, retornando false si no esta; en la lista
     * 
     * @param nodo el nodo a eliminar
     * @return <code>true</code> si se pudo insertar,<br>
     *         <code>false</code> en caso contrario
     */
    
    public abstract boolean eliminar(NewClass nodo);
    
    /**Retorn el nodo que sigue 
}
