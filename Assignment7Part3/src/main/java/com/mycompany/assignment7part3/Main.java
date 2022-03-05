/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment7part3;
import java.util.Scanner;
/**
 *
 * @author Mayerli
 */
public class Main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        Tictactoe ticTacToe = new Tictactoe();
        int row, column;
        //No salimos hasta que uno gane o no haya mas posibilidades
        while (!ticTacToe.endGame()){
            boolean valid = true;
            boolean empty = true;
            do {
                //mostramos el jugador al que le toca
                ticTacToe.showTurnActual();
                //muestro el tablero
                ticTacToe.showBoard();
                System.out.println("Ingrese la fila");
                row = sn.nextInt();
                System.out.println("Ingrese la columna");
                column = sn.nextInt();
                valid = ticTacToe.isValid(row, column);
                empty = valid && ticTacToe.isEmpty(row, column);
                if(!valid){
                    System.out.println("La posicion no es valida");
                }
                if(valid && !empty){
                    System.out.println("Ya hay una marca en esa posicion");
                }
                //Validamos la posicion
                //Si es valido, comprobamos que no haya ninguna marca
                //Si no hay marca, significa que es correcto
            } while (!valid || !empty);
            //depende del turno, inserta un simbolo u otro
            ticTacToe.insertInto(row, column);
            ticTacToe.changeTurn();
        }
        //Muestra el tablero
        ticTacToe.showBoard();
        //Mostramos el ganador
        ticTacToe.showWinner();
    }
        
}