/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_14_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano. 
 * Calcular e escrever: 
 * a) Menor temperatura do ano 
 * b) Maior temperatura do ano 
 * c) Temperatura média anual 
 * d) O número de dias no ano em que a temperatura foi inferior a média anual
 * @author renan_8tvcd4n
 */
public class Exercicio_14_Renan {
    public static DataInputStream data;
    public static void main(String[] args) throws IOException{
        float[] avTempDay;
        try {
            avTempDay = inputTemperatures();
            avTempDay = sorterTemps(avTempDay);
            OutputXtremeTemps(avTempDay);
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        
    }
    public static float[] inputTemperatures() throws IOException{
        String input;
        final int numDaysYear = 10;
        float[] dailyTemp = new float[numDaysYear];
        float sumTemps = 0;
        float avrgAnTemp;
        
        for (int i = 0; i < numDaysYear; i++) {
            System.out.printf("temperatura media do %d2.o dia (em Celsius): ", (i+1));
            data = new DataInputStream(System.in);
            dailyTemp[i] = Float.parseFloat(input = data.readLine());
            sumTemps += dailyTemp[i];
        }
        
        System.out.println("----------------------------------------------------");
        System.out.printf("Temperatura Media Anual: %2.2f Celsius\n", avrgAnTemp = avrgAnnualTemp(sumTemps, numDaysYear));
        System.out.println("----------------------------------------------------");
        System.out.println("Dias com Temperatura Abaixo da Media Anual: " + daysWhTempBlwAnnualAvrg(avrgAnTemp, dailyTemp));
        return dailyTemp;
    }
    public static float[] sorterTemps(float[] temperatures){
        int indexAux;
        float aux;
        
        for (int i = 0; i < temperatures.length; i++){
            indexAux = i;
            aux = temperatures[i];
            
            while (indexAux > 0 && temperatures[(indexAux - 1)] > aux){
                temperatures[indexAux] = temperatures[(indexAux - 1)];
                indexAux --;
            }
            temperatures[indexAux] = aux;
        }
        return temperatures;
    }
    
    public static float avrgAnnualTemp(float sumTemp, int numDays){
        return sumTemp / numDays;
    } 
    public static int daysWhTempBlwAnnualAvrg(float avrgTemp, float[] temperatures){
        int numDaysWhTempBlwAvrg = 0;
        for (float temperature : temperatures) {
            if (temperature < avrgTemp){
                numDaysWhTempBlwAvrg ++;
            }
        }
        return numDaysWhTempBlwAvrg;
    }
    
    public static void OutputXtremeTemps(float[] temperatures){
        System.out.println("----------------------------------------------------");
        System.out.printf("Menor temperatura do ano: %2.2f Celsius\n", temperatures[0]);
        System.out.println("----------------------------------------------------");
        System.out.printf("Maior temperatura do ano: %2.2f Celsius\n", temperatures[(temperatures.length - 1)]);
    }
}
