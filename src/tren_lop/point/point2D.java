package tren_lop.point;

public class point2D {
    private double x, y;

    point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public String show() {
        return "Point 2D (" + this.x + ", " + this.y + ")";
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
