package practica;

import java.util.Scanner;
        
public class Practica {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int MiArreglo[]={1,3,5,7,9};
        System.out.println(MiArreglo[2]);
        
        System.out.println("Prueba de busqueda en arreglo");
        for(int i=0; i<MiArreglo.length; i++)
        {
            if (MiArreglo[i]==7)
            {
                System.out.println("Tu numero es :"+MiArreglo[i]);
                
            }
            else
            {
                System.out.println("No se encuentra el deseado, este es el: "+MiArreglo[i]);
            }
        }
            
            
    }
    
}
