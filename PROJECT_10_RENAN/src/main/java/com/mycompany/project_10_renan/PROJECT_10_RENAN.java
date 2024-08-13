/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_10_renan;

/**
 *
 * @author renan
 */
import java.util.Random;
public class PROJECT_10_RENAN {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int numEmployee = 5;
        int employeeTasks = 0;
        
        int numTasks = 20;
        int estDuration, maxTerm;
        
        for (int counter = 1; counter <= 1; counter ++){
            employeeTasks = rand.nextInt(numTasks / numEmployee);
            numEmployee --;
            numTasks -= employeeTasks;
            if (employeeTasks == 0){
                employeeTasks += 1;
            }
            System.out.printf("Employee: %d \nTasks : %d", counter, employeeTasks);
        }
    }
}
