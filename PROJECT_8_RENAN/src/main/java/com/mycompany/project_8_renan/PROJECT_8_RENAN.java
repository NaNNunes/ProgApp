/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_8_renan;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class PROJECT_8_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int gold, silver, bronze, sumMedals;
        String perf;
        
        System.out.printf("Gold medals: ");
        gold = read.nextInt();
        System.out.printf("Silver medals: ");
        silver = read.nextInt();
        System.out.printf("Bronze medals: ");
        bronze = read.nextInt();
        
        sumMedals = gold + silver + bronze;
        
        if (gold > 10){
            perf = "Best";
        }else if (gold >= 5 && sumMedals > 30){
            perf = "Wonderfull";
        }else if (gold >= 5 ){
            perf = "Good";
        } else if (gold < 5 && sumMedals > 20){
            perf = "Regular";
        } else {
            perf = "Weak";
        }
        
        System.out.printf("Performance: %s", perf);
    }
}
