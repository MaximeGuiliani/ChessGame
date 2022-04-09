package src;

import java.util.List;

import src.pieces.Bishop;
import src.pieces.King;
import src.pieces.Knight;
import src.pieces.Pawn;
import src.pieces.Piece;
import src.pieces.Queen;
import src.pieces.Rook;

public abstract class Player {
    protected ChessColor color;
    //private int score;
    // private King king;
    public boolean isCheck;
    public boolean isCheckMate;

    public Player(ChessColor color) {
    }

    public ChessColor getColor() {
        return null;
    }

    public int getScore() {
        return 0;
    }

    public void addToScore(int value) {
    }

    public void removeFromScore(int value) {
    }

    public abstract FromTo getFromTo();

    public Piece getKing() {
        return null;
    }

    public void setKing(King king) {
    }

    public boolean isCheckMate(Board board) {
        return false;
    }

    public void setCheck() {
    }

    public void unSetCheck() {
    }

    public List<Move> getAllMoves(Board board) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public void setBishop(Bishop bishop) {
    }

    public void setQueen(Queen queen) {
    }

    public void setRook(Rook rook) {
    }

    public void setKnight(Knight knight) {
    }

    public void setPawn(Pawn pawn) {
    }
}
