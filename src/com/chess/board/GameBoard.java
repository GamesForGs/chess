package com.chess.board;

import com.chess.pieces.*;

public class GameBoard {
    private Piece[][] board;
    private int width = 8;
    private int height = 8;

    public GameBoard() {
        board = new Piece[8][8];
        this.initBoardWithDefaultPos();
    }

    public void initBoardWithDefaultPos() {
        // white
        this.board[0][0] = new Rook(Color.WHITE);
        this.board[1][0] = new Knight(Color.WHITE);
        this.board[2][0] = new Bishop(Color.WHITE);
        this.board[3][0] = new Queen(Color.WHITE);
        this.board[4][0] = new King(Color.WHITE);
        this.board[5][0] = new Bishop(Color.WHITE);
        this.board[6][0] = new Knight(Color.WHITE);
        this.board[7][0] = new Rook(Color.WHITE);

        this.board[0][1] = new Pawn(Color.WHITE);
        this.board[1][1] = new Pawn(Color.WHITE);
        this.board[2][1] = new Pawn(Color.WHITE);
        this.board[3][1] = new Pawn(Color.WHITE);
        this.board[4][1] = new Pawn(Color.WHITE);
        this.board[5][1] = new Pawn(Color.WHITE);
        this.board[6][1] = new Pawn(Color.WHITE);
        this.board[7][1] = new Pawn(Color.WHITE);

        // black
        this.board[0][7] = new Rook(Color.BLACK);
        this.board[1][7] = new Knight(Color.BLACK);
        this.board[2][7] = new Bishop(Color.BLACK);
        this.board[3][7] = new Queen(Color.BLACK);
        this.board[4][7] = new King(Color.BLACK);
        this.board[5][7] = new Bishop(Color.BLACK);
        this.board[6][7] = new Knight(Color.BLACK);
        this.board[7][7] = new Rook(Color.BLACK);

        this.board[0][6] = new Pawn(Color.BLACK);
        this.board[1][6] = new Pawn(Color.BLACK);
        this.board[2][6] = new Pawn(Color.BLACK);
        this.board[3][6] = new Pawn(Color.BLACK);
        this.board[4][6] = new Pawn(Color.BLACK);
        this.board[5][6] = new Pawn(Color.BLACK);
        this.board[6][6] = new Pawn(Color.BLACK);
        this.board[7][6] = new Pawn(Color.BLACK);
    }

    @Override
    public String toString() {
        String s = "";

        for (int y = 0; y < this.board.length; y++) {
            s += " | ";
            for (int x = 0; x < this.board[0].length; x++) {
                s += this.board[x][y] != null ? this.board[x][y] : ".";
                s += " | ";
            }
            s += "\n";
        }

        return s;
    }

    public boolean movePiece(Position from, Position to) {
        if (from == null || to == null ||
                from.getX() >= width || from.getX() < 0 ||
                from.getY() >= height || from.getY() < 0 ||
                to.getX() >= width || to.getX() < 0 ||
                to.getY() >= height || to.getY() < 0
        ) return false;
        Piece pieceToMove = this.board[from.getX()][from.getY()];
        if (!pieceToMove.canMove(from, to)) return false;

        this.board[to.getX()][to.getY()] = pieceToMove;
        this.board[from.getX()][from.getY()] = null;

        return true;
    }
}
