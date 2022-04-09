package src.pieces;

import src.Board;
import src.Coordinates;
import src.Player;

public class Rook extends Piece {

    public Rook(int x, int y, Player owner) {
        super(x, y, owner);
        owner.setRook(this);
    }

    public boolean isMoveAuthorized(Board board, Coordinates destination) {
        /* int dx = destination.getX();
        int dy = destination.getY();
        int ox = this.getX();
        int oy = this.getY(); */

        return true;
    }

    @Override
    public Type getType() {
        return Type.KING;
    }

    @Override
    public int getValue() {
        return 0;
    }

}
