package com.chess.pieces;

import com.chess.board.Position;

public class King implements Piece{

    Color color;

    public King(Color color){
        this.color = color;
    }

    @Override
    public boolean canMove(Position from, Position to) {
        return (Math.abs(from.getX() - to.getX()) <= 1 && Math.abs(from.getY() - to.getY()) <= 1);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String toString(){
        return this.color == Color.WHITE ? "♚" : "♔";
    }
}
