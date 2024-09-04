/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplodedis;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class ExemploDeDIS {

    public static void main(String[] args) throws IOException{
        String s = "";
        final int NumNotas = 4;
        float[] notas = new float[NumNotas + 1];
        float media;
        DataInputStream dado;
        
        for (int i = 0; i < NumNotas; i++){
            System.out.printf("Entre a %d.a nota: ", i+1);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            notas[i] = Float.parseFloat(s);
            notas[NumNotas] += notas[i];
        }
        media = notas[NumNotas] / NumNotas;
        System.out.println(media);
    }
}
