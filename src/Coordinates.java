package src;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Your coordinates are: " + x + " " + y;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Coordinates && ((Coordinates) o).x == x && ((Coordinates) o).y == y;
    }
}
