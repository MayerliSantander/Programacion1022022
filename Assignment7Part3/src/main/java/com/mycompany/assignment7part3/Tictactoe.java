/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment7part3;

/**
 *
 * @author Mayerli
 */
public class Tictactoe{
    //Reprentaciones de los jugadores y del simbolo vacio
    private final char J1 = 'X';
    private final char J2 = 'O';
    private final char Empty = '-';
 
    //turno actual
    //true = J1, false = J2
    private boolean turn;
    //tablero donde vamos a jugar
    private char board[][];
    public Tictactoe(){
        this.turn = true;
        this.board = new char[3][3];
        this.initializeBoard();
    }
    //Inicializa el tablero con el simbolo VACIO
    private void initializeBoard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                board[i][j] = Empty;
            }
        }
    }
    //Indica si es el fin de la partida, acaba cuando hay un ganador o el tablero esta lleno
    //return fin de partida
    public boolean endGame() {
        if (fullBoard()
                || lineMatch() != Empty
                || columMatch() != Empty
                || diagonalMatch() != Empty) {
            return true;
        }
        return false;
    }
    //Indica si el tablero esta llena cuando el simbolo por defecto aparezca,
    //no esta llena
    //return tablero vacio o no
    public boolean fullBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == Empty) {
                    return false;
                }
            }
        }
        return true;
    }
    //Indica si hay un ganador en una linea
    //return Simbolo del ganador, VACIO sino hay ganador
    private char lineMatch(){
        char symbol;
        boolean coincidence;
        for (int i = 0; i < board.length; i++){
            //Reiniciamos la coincidencia
            coincidence = true;
            //Cogemos el simbolo de la fila
            symbol = board[i][0];
            if (symbol != Empty){
                for (int j = 1; j < board[0].length; j++){
                    //sino coincide ya no habra ganador en esta fila
                    if (symbol != board[i][j]){
                        coincidence = false;
                    }
                }
                //Si no se mete en el if, devuelvo el simbolo ganador
                if (coincidence){
                    return symbol;
                }
            }
        }
        //Si no hay ganador, devuelvo el simbolo por defecto
        return Empty;
    }
    //Indica si hay un ganador en una columna
    //return Simbolo del ganador, VACIO sino hay ganador
    private char columMatch(){
        char symbol;
        boolean coincidence;
        for (int j = 0; j < board.length; j++){
            //Reiniciamos la coincidencia
            coincidence = true;
            //Cogemos el simbolo de la columna
            symbol = board[0][j];
            if (symbol != Empty){
                for (int i = 1; i < board[0].length; i++){
                    //sino coincide ya no habra ganador en esta columna
                    if (symbol != board[i][j]){
                        coincidence = false;
                    }
                }
                //Si no se mete en el if, devuelvo el simbolo ganador
                if (coincidence){
                    return symbol;
                }
            }
        }
        //Si no hay ganador, devuelvo el simbolo por defecto
        return Empty;
    }
    //Comprueba las diagonales
    //return Simbolo del ganador, VACIO sino hay ganador
    private char diagonalMatch(){
        char symbol;
        boolean coincidence = true;
        //Diagonal principal
        symbol = board[0][0];
        if (symbol != Empty) {
            for (int i = 1; i < board.length; i++) {
                //sino coincide ya no habra ganador en esta diagonal
                if (symbol != board[i][i]) {
                    coincidence = false;
                }
            }
            //Si no se mete en el if, devuelvo el simbolo ganador
            if (coincidence) {
                return symbol;
            }
        }
        coincidence = true;
        //Diagonal inversa
        symbol = board[0][2];
        if (symbol != Empty) {
            for (int i = 1, j = 1; i < board.length; i++, j--) {
                //sino coincide ya no habra ganador en esta diagonal
                if (symbol != board[i][j]) {
                    coincidence = false;
                }
            }
            //Si no se mete en el if, devuelvo el simbolo ganador
            if (coincidence) {
                return symbol;
            }
        }
        //Si no hay ganador, devuelvo el simbolo por defecto
        return Empty;
    }
    //Muestra el ganador de la partida
    public void showWinner(){
        char symbol = lineMatch();
        if (symbol != Empty){
            winner(symbol, 1);
            return;
        }
        symbol = columMatch();
        if (symbol != Empty){
            winner(symbol, 2);
            return;
        }
        symbol = diagonalMatch();
         if (symbol != Empty){
            winner(symbol, 3);
            return;
        }
        System.out.println("Hay empate");
    }
    //Funcion auxiliar de la anterior funcion
    private void winner(char symbol, int type){
        switch (type){
            case 1:
                if (symbol == J1){
                    System.out.println("Ha ganado el Jugador 1 por linea");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por linea");
                }
                break;
            case 2:
                if (symbol == J1){
                    System.out.println("Ha ganado el Jugador 1 por columna");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por columna");
                }
                break;
            case 3:
                if (symbol == J1){
                    System.out.println("Ha ganado el Jugador 1 por diagonal");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por diagonal");
                }
                break;
        }
    }
    //Insertamos en una posicion de una matriz un simbolo en concreto
    public void insertInto(int row, int column){
        if (turn) {
            this.board[row][column] = J1;
        } 
        else{
            this.board[row][column] = J2;
        }
    }
    //Muestra la matriz
    public void showBoard(){
        for (int i = 0; i < this.board.length; i++){
            for (int j = 0; j < this.board[0].length; j++){
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //Mostramos el turno actual
    public void showTurnActual(){
        if (turn) {
            System.out.println("Le toca al jugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }
    }
    //Cambia el turno
    public void changeTurn(){
        this.turn = !this.turn;
    }
    //Validamos la posicion que nos insertan
    public boolean isValid(int row, int column){
        if (row >= 0 && row < board.length && column >= 0 && column < board.length) {
            return true;
        }
        return false;
    } 
    //Indicamos si en una posicion hay una marca
    public boolean isEmpty(int row, int column){
        if (this.board[row][column] == Empty) {
            return true;
        }
        return false;
    }
}

