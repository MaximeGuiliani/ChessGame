package src.pieces;

import src.Board;
import src.Coordinates;
import src.Player;

public class Queen extends Piece {

    public Queen(int x, int y, Player owner) {
        super(x, y, owner);
        owner.setQueen(this);
    }

    public boolean isMoveAuthorized(Board board, Coordinates destination) {
        /*  int dx = destination.getX();
        int dy = destination.getY();
        int ox = this.getX();
        int oy = this.getY(); */

        return true;
    }

    @Override
    public Type getType() {
        return Type.QUEEN;
    }

    @Override
    public int getValue() {
        return 0;
    }

}
