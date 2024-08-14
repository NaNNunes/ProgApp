/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_9_renan;

/**
 *
 * @author renan
 */
import java.util.Random;
public class PROJECT_9_RENAN {

    public static void main(String[] args) {
       Random spawn = new Random();
       int rand;
       
       final int limitLoop = 600, limitTrafficLight = 80, limitQueueCar = 10;
       
       int timer = 0;
       
       // more Cars
       int newCar_One, newCar_Two;
       // car out queue
       int outCar_St, outCar_Nd;
       // waiting time
       int waitTime_One, waitTime_Two;
       // passedCars
       int passedCar_St, passedCar_Nd;
       
       // colors
       String st_Tl_Status, nd_Tl_Status;
       for (int i = 0; i < 3; i++){
            newCar_One = 0; newCar_Two = 0;
            outCar_St = 0; outCar_Nd = 0;
            waitTime_One = 0; waitTime_Two = 0;
            passedCar_St = 0; passedCar_Nd = 0;
            
            for (int sec = 0; sec <= limitLoop; sec++){

                // timer
                if (timer <= limitTrafficLight){
                    timer++;
                }
                else {
                    timer = 0;
                }

                // Intersection
                // Fisrt Traffic Light 
                if (timer <= 30){
                    st_Tl_Status = "Green";
                    passedCar_St ++;
                    if (newCar_One > 0){
                        newCar_One --;
                        if (outCar_St > 0){
                            outCar_St --;
                        }
                    }
                }
                else if (timer <= 35){
                    st_Tl_Status = "Yellow";
                }
                else{
                    st_Tl_Status = "Red";
                }

                // Second Traffic Light
                if (timer <= 45){
                    nd_Tl_Status = "Red";
                }
                else if (timer <= 50){
                    nd_Tl_Status = "Yellow";
                }
                else {
                    nd_Tl_Status = "Green";
                    passedCar_Nd ++;
                    if (newCar_Two > 0){
                        newCar_Two --;
                        if (outCar_Nd > 0){
                            outCar_Nd --;
                        }
                    }
                }

                // accident alert
                if (nd_Tl_Status == "Green" && nd_Tl_Status == st_Tl_Status){
                    System.out.printf("\n!!! There was an accident at the intersection %d !!!\n", i);
                    sec = limitLoop + 1;
                }

                // more Cars
                while (sec % 15 == 0){
                    //first
                    if (st_Tl_Status != "Green"){
                        rand = spawn.nextInt(limitQueueCar * 2);
                        if (newCar_One <= limitQueueCar){
                            newCar_One += rand;
                        }
                        else{
                            outCar_St += rand;
                        }
                    }

                    // second
                    if (nd_Tl_Status != "Green"){
                        rand = spawn.nextInt(limitQueueCar * 2);
                        if (newCar_Two <= limitQueueCar){
                            newCar_Two += rand;
                        }
                        else {
                            outCar_Nd += rand;
                        }
                    }
                    break;
                }

                // waiting time
                if (st_Tl_Status != "Green" && newCar_One > 0){
                    waitTime_One += newCar_One;
                }
                if (nd_Tl_Status != "Green" && newCar_Two > 0){
                    waitTime_Two += newCar_Two;
                }

                // output
                System.out.printf("First Traffic Light Status: %s (%2ds) - %3ds ----- ", st_Tl_Status, timer, sec);
                System.out.printf("Second Traffic Light Status: %s (%2ds) - %3ds\n", nd_Tl_Status, timer, sec);
            }
            System.out.printf("Passed cars: %d\n", passedCar_St + passedCar_Nd);
            System.out.printf("Cars in traffic jam: %d\n",newCar_One + newCar_Two + outCar_St + outCar_Nd);
            System.out.printf("Avarage waiting tiime:  Queue One = %ds Queue Two = %ds\n\n", waitTime_One/newCar_One, waitTime_Two/newCar_Two);
       }
    }
}
