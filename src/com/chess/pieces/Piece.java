package com.chess.pieces;

import com.chess.board.Position;

public interface Piece {
    boolean canMove(Position from, Position to);
    Color getColor();
}
