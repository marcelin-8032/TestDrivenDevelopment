package point;

public class Point {


    private int x;
    private int y;

    public Point(int i, int j) {
        this.x = i;
        this.y = j;
    }

    public Point midPoint(Point point2) {
        return new Point((this.x + point2.x) / 2, (this.y + point2.y) / 2);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point scale(int scale) {
        return new Point(this.x *scale, this.y *scale);
    }
}
