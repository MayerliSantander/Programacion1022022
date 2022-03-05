/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment7part2;
import java.util.Scanner;

/**
 *
 * @author Mayerli
 */
public class Main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int dimension = 0;
        do{
            System.out.println("Dar un número impar para el cuadrado");
            dimension = sn.nextInt();
        } 
        while (dimension <= 0 || dimension %2==0); 
    MagicSquare.calculateMagicSquare(dimension);
    }
}
