package src.pieces;

import src.Board;
import src.Coordinates;
import src.Player;

public class Knight extends Piece {

    public Knight(int x, int y, Player owner) {
        super(x, y, owner);
        owner.setKnight(this);

    }

    @Override
    public boolean isMoveAuthorized(Board board, Coordinates destination) {
        return false;
    }

    @Override
    public Type getType() {
        return Type.KNIGHT;
    }

    @Override
    public int getValue() {
        return 0;
    }

}
