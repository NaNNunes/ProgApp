/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_exportandjoption;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author r.nunes
 */
public class Pratica_exportAndJOption {

     public static void main(String[] args) throws IOException {
        toFile(inputValues());
    }
    
    public static int[] inputValues(){
        final int len = 5;
        String input;
        int[] values = new int[len];
        
        JOptionPane.showMessageDialog(null, "Informe 5 valores");
        
        for (int i = 0; i < len; i++){
            while (true){
                try {
                    //System.out.printf("%d.o valor: ", i+1);
                    input = JOptionPane.showInputDialog(null, (i+1) + " valor:");
                    values[i] = Integer.parseInt(input);
                    break;
                }
                catch (Exception erro){
                    JOptionPane.showMessageDialog(null ,"Valor invalido");
                } 
            }
        }
        return values;
    }
    
    public static void toFile(int[] values) throws IOException{
        String path = ".\\";
        String fileName = "Tabuada de ";
        
        FileWriter file;
        PrintWriter record;
        
        for (int i = 0; i < values.length; i++) {
            file = new FileWriter(path + fileName + values[i]);
            record = new PrintWriter(file);
            for (int j = 1; j <= 10; j++){
                record.printf("\n %3d x %3d = %3d", values[i], j, (values[i] * j));
            }
            record.printf("\n---------------");
            record.close();
            JOptionPane.showMessageDialog(null, fileName + values[i] +
            " salve em:\n" + "P:\\TURMAS\\HTC-DDS-19\\Renan\\MODULO-2\\Prog-APP\\praticas\\JOptionPane\\pratica_exportAndJOption\\" + fileName + values[i]);
        }
    }
}
