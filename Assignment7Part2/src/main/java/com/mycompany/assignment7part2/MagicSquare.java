/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment7part2;

/**
 *
 * @author Mayerli
 */
public class MagicSquare {
    public static void calculateMagicSquare(int dimension){
        int matrix[][] = new int[dimension][dimension];
        int row = dimension-1;
        int column = dimension/2;
        matrix[row][column] = 1;
        for (int i = 2; i <= dimension*dimension; i++){
            if (matrix[(row + 1) % dimension][(column + 1) % dimension] == 0) {
                row = (row + 1) % dimension;
                column = (column + 1) % dimension;
            }
            else {
                row = (row - 1 + dimension) % dimension;
                // no cambia la columna, solo sube arriba
            }
            matrix[row][column] = i;
        }
        // print results
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (matrix[i][j] < 10)  System.out.print(" ");  // para alinear
                if (matrix[i][j] < 100) System.out.print(" ");  // para alinear
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

