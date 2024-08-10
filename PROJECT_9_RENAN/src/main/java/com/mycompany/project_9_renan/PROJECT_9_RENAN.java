/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project_9_renan;
/**
 *
 * @author renan
 */
public class PROJECT_9_RENAN {

    public static void main(String[] args) {
        
        String color;
        int minC = 0;
        int sec = 0;
        
        int moreCar = 0;
        int carOut = 0;
        
        int counter = 0;
        
        
        // ciclo
        for (int i = 0; i <= 7; i ++){
            int lightTimer = 0;
            
            while(lightTimer <= 80){
               
                if (sec == 60){
                   minC++;
                   sec = 0;
                }
                
                if (lightTimer <= 30){
                    color = "Green";
                    if (moreCar > 0){
                        moreCar --;
                    }
                } else if (lightTimer <= 35){
                    color = "Yellow";
                }else{
                    color = "Red";
                }

                if (minC < 10){
                    System.out.printf(" - %2dm: %2ds (%3ds)\n", minC, sec, counter);
                    System.out.printf("Light Status: %s(%2ds)\n", color, lightTimer);
                    
                    if (sec % 15 == 0){
                        moreCar++;
                        System.out.printf("More Car (%d)\n", moreCar);
                    }
                } else {
                    System.out.printf(" - %2dm: %ds (%3ds)", minC, sec, counter);
                    lightTimer = 81;
                }

                lightTimer++;
                sec++;
                counter++;
            }
            
        }
    }
}
