/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment8solution;

/**
 *
 * @author fundacion
 */
public class Assignment8 {
    String input;
    public Assignment8(String input){
        this.input = input;
    }
    @Override
    public String toString() {
        String result="";
        var words = input.split(" ");
        for(int a=0;a<words.length;a++){
            char anagram[] = words[a].toCharArray();
            int finalLetters = 1;
            char lastLetter = anagram[anagram.length-1];
            if(lastLetter == ',' || lastLetter =='.' || lastLetter == ';'){
                finalLetters = 2;
            }
            for (int x = 1; x<anagram.length-finalLetters; x++){
                int i = (int) (Math.random() *(anagram.length-finalLetters-1))+1;
                int j = (int) (Math.random() *(anagram.length-finalLetters-1))+1;
                char aux = anagram[i];
                anagram[i] = anagram[j];
                anagram[j] = aux;
            }
        result += " " + String.valueOf(anagram);
        }
        return result;
    }
}