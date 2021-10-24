package com.chess.pieces;

import com.chess.board.Position;

public class Bishop implements Piece{
    Color color;

    public Bishop(Color color){
        this.color = color;
    }

    @Override
    public boolean canMove(Position from, Position to) {
        return (Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY()));
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String toString(){
        return this.color == Color.WHITE ? "♝" : "♗";
    }
}
