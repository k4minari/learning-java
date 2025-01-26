/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjavainmycpu;

/**
 *
 * @author francisco
 */
public class MyFirstJavaInMyCPU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicios de Arreglos (estructura de datos)
        /**
         * NOTA: Al crear un arreglo es importante especificar que tipo
         * de dato se va a tratar, y los objetos tratados en el programa
         * pueden ser utilizados como un tipo de dato para crear 
         * un nuevo arreglo.
         * 
         * Estos datos tipo objeto pueden almacenar tipos de datos variados 
         * dependiendo de los atributos del objeto utilizado.
        */
        
        // MANERA Nº1 DE ASIGNAR OBJETOS A UN ARRAY
        
        Persona arrayPersonas[] = new Persona[5];
        arrayPersonas[0] = new Persona("David", 19);
        arrayPersonas[1] = new Persona("Juan", 17);
        arrayPersonas[2] = new Persona("Perla", 25);
        arrayPersonas[3] = new Persona("Benito", 21);
        arrayPersonas[4] = new Persona("Daniela", 30);
        
        // MANERA Nº2 DE ASIGNAR OBJETOS A UN ARRAY
        
        /** Persona arrayPersonas[] = {new Persona("David", 19), 
         * new Persona("Juan", 17)};
        */
        
            EdadMayor.personaMayor(arrayPersonas);
            System.out.println("La edad mayor del arreglo es: "+EdadMayor.personaMayor(arrayPersonas));
    }
    
}
