package com.chess.pieces;
import com.chess.board.Position;

public class Rook implements Piece{

    Color color;

    public Rook(Color color){
        this.color = color;
    }

    @Override
    public boolean canMove(Position from, Position to) {
        return true;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String toString(){
        return this.color == Color.WHITE ? "♜" : "♖";
    }
}
