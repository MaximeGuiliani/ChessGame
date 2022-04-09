package src.pieces;

import src.Board;
import src.Coordinates;
import src.Player;

public class Bishop extends Piece {

    public Bishop(int x, int y, Player owner) {
        super(x, y, owner);
        owner.setBishop(this);
    }

    public boolean isMoveAuthorized(Board board, Coordinates destination) {
        /*   int dx = destination.getX();
        int dy = destination.getY();
        int ox = this.getX();
        int oy = this.getY(); */

        return true;
    }

    @Override
    public Type getType() {
        return Type.BISHOP;
    }

    @Override
    public int getValue() {
        return 0;
    }

}
