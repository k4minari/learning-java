/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstjavainmycpu;

/**
 *
 * @author francisco
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona (String nom, int ed)
    {
        nombre = nom;
        edad = ed;
    }
    // GETTERS (metodos de esta clase)
    public String devuelveNombre(){
        return nombre;
    }
    public int devuelveEdad(){
        return edad;
    }
}
