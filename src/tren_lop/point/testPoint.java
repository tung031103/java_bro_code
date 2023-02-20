package tren_lop.point;

import java.io.*;
import java.util.*;

public class testPoint {
    public static void main(String[] args) {
        List<point2D> listPoint2D = new ArrayList<point2D>();

        point2D p1_2D = new point2D(3.0, 4.0);
        point2D p2_2D = new point2D(3.5, 5.0);
        point2D p3_2D = new point2D(2.2, 6.0);

        listPoint2D.add(p1_2D);
        listPoint2D.add(p2_2D);
        listPoint2D.add(p3_2D);

        for (point2D point2d : listPoint2D) {
            System.out.println(point2d.show());
        }

        double sum2D = 0.0;
        for (point2D point2d : listPoint2D) {
            System.out.println(point2d.distance());
        }

    }
}
