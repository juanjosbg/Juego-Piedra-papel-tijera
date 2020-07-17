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
        //declaracion de variables
        int piedra =0,  papel =1,  tijera = 2, x=0;
        int maquina = (int) (Math.random()*3 +0); // <--- para un numero aleatorio 
        int numeroPlayer;
        int opcionUsuario;
        //parte del menu de seleccion
        do {
           System.out.println("Para inciar escoga una opcion de las siguientes");
           System.out.println("1 - Empezar Partida");
           System.out.println("2 - Instrucciones");
           System.out.println("3 - Salir del juego");
           opcionUsuario = lector.nextInt();
       lector.nextLine();
       if(opcionUsuario == 1 ){
                 // Parte del usiario
                 System.out.println("Para poder jugar Recuerda escoger una de estas opciones");
                         System.out.println("(0)- para piedra");
                         System.out.println("(1)- para papel");
                         System.out.println("(2)- para tijera ");     
                numeroPlayer = lector.nextInt();
                lector.nextLine();
                //para que la maquina escoga un valor aleatorio 
                if (maquina ==0){
                    System.out.println("La maquina escogio, piedra");  
                }else if (maquina ==1){
                    System.out.println("La maquina escogio, papel"); 
                }else if (maquina ==2){
                    System.out.println("La maquina escogio, tijera"); 
                }      
                // pate de las condiciones
                 if(numeroPlayer == piedra ){
                     System.out.println("Usted a escogido piedra");
                     if(maquina ==piedra){
                         System.out.println("Empate");
                         }else if(maquina == papel ){
                           System.out.println("Pierdes");
                         }else if(maquina == tijera ){
                           System.out.println("Ganas");
                         }
                 }else if(numeroPlayer == papel ){
                         System.out.println("Usted a escogido papel");
                     if(maquina ==piedra){
                          System.out.println("Ganas");
                         }else if(maquina == papel ){
                           System.out.println("Empate");
                         }else if(maquina == tijera ){
                           System.out.println("Pierdes");
                         }
                 }else if(numeroPlayer == tijera ){
                         System.out.println("Usted a escogido tijera");      
                     if(maquina ==piedra){
                          System.out.println("Pierdes");
                         }else if(maquina == papel ){
                           System.out.println("Ganas");
                         }else if(maquina == tijera ){
                           System.out.println("Empate");
                         }   
                 }
           
       }else if (opcionUsuario ==2){
           System.out.println("Para inicar partida recuerda: ");
           System.out.println("Tienes que elegir entre piedra, papel o tijera,");
           System.out.println("Recuerda que tu rival tambien podra hacer lo mismo que tu");
           System.out.println("la Piedra vence a la tijera");
           System.out.println("La tijera vence al papel");
           System.out.println("El papel vence a la roca");
       }else if (opcionUsuario ==3){
           System.out.println("Has abandonado el juego");
           x=1;
       }
       
            }while(x!=1);
    }
    
}
