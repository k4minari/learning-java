/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstjavainmycpu;

/**
 *
 * @author francisco
 */
public class EdadMayor {
    // METODO ESTATICO: No se necesitan objetos para invocar al metodo
    public static int personaMayor(Persona[]person)
    {
        int mayor;
        mayor = person[0].devuelveEdad();
        int i=1;
        while(i<person.length)
        {
            if(person[i].devuelveEdad()>mayor)
            {
                mayor = person[i].devuelveEdad();
            }
            i++;
        }    
        return mayor;
    }
}
