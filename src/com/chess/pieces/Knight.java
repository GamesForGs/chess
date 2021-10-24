package com.chess.pieces;

import com.chess.board.Position;

public class Knight implements Piece{

    Color color;

    public Knight(Color color){
        this.color = color;
    }

    @Override
    public boolean canMove(Position from, Position to) {
        return (Math.abs(from.getX() - to.getX()) == 1 && Math.abs(from.getY() - to.getY()) == 2) ||
                (Math.abs(from.getX() - to.getX()) == 2 && Math.abs(from.getY() - to.getY()) == 1);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String toString(){
        return this.color == Color.WHITE ? "♞" : "♘";
    }
}
