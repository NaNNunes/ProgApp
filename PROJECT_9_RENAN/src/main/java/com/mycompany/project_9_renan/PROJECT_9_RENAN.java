/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_9_renan;

import java.util.Random;

/**
 *
 * @author r.nunes
 */
public class PROJECT_9_RENAN {

    public static void main(String[] args) {
            Random rand = new Random();
    int spawn;
    
    final int limitCycle = 600;
    final int limitTl = 80;
    final int limitQueue = 10;
    
    int timer = 0;
    int waitTime_FirstTl, avrgWTime_St;
    int waitTime_SecondTl, avrgWTime_Nd;

    int moreCar_FirstTl;
    int passed_FirstTl;
    int outCar_FirstTl;
    
    int moreCar_SecondTl;
    int passed_SecondTl; 
    int outCar_SecondTl;

    int carInJam;
    
    String color_FirstTl;
    String color_SecondTl;

    for (int i = 0; i < 3; i++ ){
      waitTime_FirstTl = 0; waitTime_SecondTl = 0;
      moreCar_FirstTl = 0; moreCar_SecondTl = 0;
      passed_FirstTl = 0; passed_SecondTl = 0; 
      outCar_FirstTl = 0; outCar_SecondTl = 0;
      carInJam = 0;
  
      for (int sec = 0; sec <= limitCycle; sec ++){
  
        if (timer <= limitTl){
          timer++;
        }
        else{
          timer = 0;
        }
  
        if (timer <= 30){
          color_FirstTl = "Green";
  
          if (moreCar_FirstTl > 0){
            passed_FirstTl ++;
            moreCar_FirstTl --;
            
            if (outCar_FirstTl > 0){
              outCar_FirstTl --;
              moreCar_FirstTl ++;
            }
          }
        }      
        else if (timer <= 35){
          color_FirstTl = "Yellow";
        }
        else {
          color_FirstTl = "Red";
        }
  
        if (timer <= 45){
          color_SecondTl = "Red";
        }
        else if (timer <= 75){
          color_SecondTl = "Green";
          if (moreCar_SecondTl > 0){
            passed_SecondTl ++;
            moreCar_SecondTl --;
            if (outCar_SecondTl > 0){
              outCar_SecondTl --;
              moreCar_SecondTl ++;
            }
          }
        }
        else {
          color_SecondTl = "Yellow";
        }
  
        while (sec % 15 == 0){
          spawn = rand.nextInt(limitQueue + 2);
          
          if (moreCar_FirstTl <= limitQueue){
            moreCar_FirstTl += spawn;
            if (moreCar_FirstTl > limitQueue){
              outCar_FirstTl += (moreCar_FirstTl - limitQueue); 
            }
          }
          else {
            outCar_FirstTl += spawn;
          }
  
          if (moreCar_SecondTl <= limitQueue){
            moreCar_SecondTl += spawn;
            if (moreCar_SecondTl > limitQueue){
              outCar_SecondTl += moreCar_SecondTl - limitQueue;
            }
          }
          else {
            outCar_SecondTl += spawn;
          }
          
          break;
        }
  
        if (color_FirstTl != "Green" && moreCar_FirstTl > 0){
          waitTime_FirstTl += moreCar_FirstTl;
        }
        if (color_SecondTl != "Green" && moreCar_FirstTl > 0){
          waitTime_SecondTl += moreCar_SecondTl;
        }
  
        System.out.printf(" --- %3ds --- (%2ds) ---\n", sec, timer);
        System.out.printf(" - First Queue : %s ----- ", color_FirstTl);
        System.out.printf("Second Queue : %s\n", color_SecondTl);
      }
      carInJam = outCar_FirstTl + outCar_SecondTl;
      avrgWTime_St = waitTime_FirstTl / passed_FirstTl;
      avrgWTime_Nd = waitTime_SecondTl / passed_SecondTl ;
      System.out.printf("\nAvarage Time: \n");
      System.out.printf(" - First Queue: %ds --- Second Queue: %ds\n", avrgWTime_St, avrgWTime_Nd);
      System.out.printf("Passed Cars: \n");
      System.out.printf(" - First Queue: %d --- Second Queue %d\n", passed_FirstTl, passed_SecondTl);
      System.out.printf("Cars in Jam : %d\n\n", carInJam);
    }
    }
}
