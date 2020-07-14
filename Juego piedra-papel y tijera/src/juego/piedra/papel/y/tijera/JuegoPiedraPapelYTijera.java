/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.piedra.papel.y.tijera;

import java.util.Scanner;

public class JuegoPiedraPapelYTijera {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int piedra =0,  papel =1,  tijera = 2;
        int maquina =papel;
        int numeroPlayer;
        
        // Parte del usiario
        System.out.println("Para poder jugar Recuerda escoger una de estas opciones");
                System.out.println("(0)- para piedra");
                System.out.println("(1)- para papel");
                System.out.println("(2)- para tijera ");     
       numeroPlayer = lector.nextInt();
       lector.nextLine();
       
       // pate de las condiciones
        System.out.println("la maquina a escogido papel");
        if(numeroPlayer == piedra ){
            if(maquina ==piedra){
                 System.out.println("Empate");
                }else if(maquina == papel ){
                  System.out.println("Pierdes");
                }else if(maquina == tijera ){
                  System.out.println("Ganas");
                }
        }else if(numeroPlayer == papel ){
            if(maquina ==piedra){
                 System.out.println("Ganas");
                }else if(maquina == papel ){
                  System.out.println("Empate");
                }else if(maquina == tijera ){
                  System.out.println("Pierdes");
                }
        }else if(numeroPlayer == tijera ){
            if(maquina ==piedra){
                 System.out.println("Pierdes");
                }else if(maquina == papel ){
                  System.out.println("Ganas");
                }else if(maquina == tijera ){
                  System.out.println("Empate");
                }   
        }
    }
    
}
