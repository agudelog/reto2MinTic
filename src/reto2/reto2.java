package reto2;

import java.util.Scanner;

public class reto2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
        
        int cant = Integer.parseInt(leer.nextLine());
        CuerpoDeAgua datos[] = new CuerpoDeAgua[cant];
                     
        
        for (int i = 0; i < cant; i++) {
            String[] lectura = leer.nextLine().split(" ");
            
            datos [i] = new CuerpoDeAgua(lectura[0],Integer.parseInt(lectura[1]),lectura[2],Double.parseDouble(lectura[3]));
        }
        int contador = 0;
        for (int i = 0; i < cant; i++) {
            System.out.println(datos[i].nivel());
            
            if (datos[i].getNivelIRCA() <= 35){
                contador++;          
            }
        }
        System.out.println(contador);
        String nivelMedios = "";
        for (int i = 0; i < cant; i++) {
            if (datos[i].getNivelIRCA() > 14 & datos[i].getNivelIRCA() <=35) {
               nivelMedios += datos[i].getNombre() + " ";
            }
        }       
        if(nivelMedios == ""){
                nivelMedios = "NA";
        }
                
        System.out.println(nivelMedios);
        
         double nivelMin = 101;
         String nombreMin = "";
         
         for (int i = 0; i < cant; i++) {
             if (datos[i].getNivelIRCA() < nivelMin){
                 nivelMin = datos[i].getNivelIRCA();
                 nombreMin = datos[i].getNombre() + " " + datos[i].getnId();
             } 
            
        
         }
         System.out.println(nombreMin);
         
    }
     
}