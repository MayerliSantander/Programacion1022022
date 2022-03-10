/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment9solution;

/**
 *
 * @author Mayerli
 */
public class Utility {
    public static String[] Repeated(String sentence){
        String words [] = sentence.split(" ");
        String wordsB [] = sentence.split(" ");
        
        int amount = words.length;
        String[] result = new String[2];
        int counterMostRepeated =  0;
 
        for (int i = 0; i < amount; i++) {
                int counter = 0;
          //resultado += palabras[i];
                String word = words[i];
 
                for (int j = 0; j < amount; j++) {
 
                        if (word.equalsIgnoreCase(wordsB[j])){
                                counter++;
                                words[j] = "";
                        }
                }
 
                if ((counter > 1)&& (counter > counterMostRepeated)){
                        result[0] = word;
                        result[1] = String.valueOf(counter);
                        counterMostRepeated = counter;
                        System.out.print(words[i]);
                }    
        }
        return result;
    }
}
