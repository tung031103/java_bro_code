package tren_lop.point;

public class point3D extends point2D {

    private double z;

    public point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String show() {
        return "Point 3D (" + this.getX() + ", " + this.gety() + ", " + this.z + ")";
    }

    @Override
    public double distance() {
        return Math.sqrt(this.getX() * this.getX() + this.gety() * this.gety() + this.z * this.z);
    }
}
