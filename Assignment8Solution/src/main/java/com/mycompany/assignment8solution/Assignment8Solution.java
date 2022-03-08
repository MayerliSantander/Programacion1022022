/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment8solution;

/**
 *
 * @author fundacion
 */
public class Assignment8Solution {

    public static void main(String[] args) {
        String input = "Según un estudio de una universidad inglesa, "
                + "no importa el orden en el que las letras están escritas, "
                + "la única cosa importante es que la primera y última letra estén escritas "
                + "en la posición correcta. El resto pueden estar totalmente mal y aún podrás "
                + "leerlo sin problemas. Esto es porque no leemos cada letra por sí misma. "
                + "sino la palabra como un todo. Personalmente me parece increíble.";
        Assignment8 d=new Assignment8(input);
        System.out.println(d);
    }
}
