package com.chess;

import com.chess.board.GameBoard;
import com.chess.board.Position;

public class Main {

    public static void main(String[] args) {
        GameBoard gameboard = new GameBoard();
        gameboard.movePiece(new Position(2, 0), new Position(1, 1));
        System.out.print(gameboard);
    }
}
