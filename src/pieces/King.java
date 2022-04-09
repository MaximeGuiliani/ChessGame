package src.pieces;

import src.Board;
import src.Coordinates;
import src.Player;

public class King extends Piece {

    public King(int x, int y, Player owner) {
        super(x, y, owner);
        owner.setKing(this);
    }

    public boolean isMoveAuthorized(Board board, Coordinates destination) {
        int dx = destination.getX();
        int dy = destination.getY();
        int ox = this.getX();
        int oy = this.getY();
        if (dy - oy > 1 || dy - oy < -1) {

        }

        return false;
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
