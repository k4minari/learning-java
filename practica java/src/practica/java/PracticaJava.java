/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.java;

import java.util.Scanner;

/**
 *
 * @author ile1
 */
public class PracticaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma, grade;
        
        System.out.println("Bienvenido al promediador unimetano");
        System.out.println("Escriba la primera nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Escriba la segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.println("Escriba la tercera nota: ");
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        grade = suma / 3;
        
        System.out.println("\n la suma es: "+suma);
        System.out.println("Tu promedio es de: "+grade);
        
// //////////////////////////////////////////////////////////////////////
        int horas, salario, total;
        
        System.out.println("Bienvenido a la calculadora de salarios\n");
        System.out.println("Escriba el total de horas trabajadas en una semana: ");
        horas = entrada.nextInt();
        System.out.println("Escriba su salario por hora: ");
        salario = entrada.nextInt();
        
        total = horas * salario;
        System.out.println("Usted semanalmente gana: "+total+"$");
    }
    
}
