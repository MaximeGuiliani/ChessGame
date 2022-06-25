package src;

public class FromTo {
    private final Coordinates from;
    private final Coordinates to;

    public FromTo(int ox, int oy, int dx, int dy) {
        this.from = new Coordinates(ox, oy);
        this.to = new Coordinates(dx, dy);
    }

    public Coordinates getFrom() {
        return from;
    }

    public Coordinates getTo() {
        return to;
    }
}
