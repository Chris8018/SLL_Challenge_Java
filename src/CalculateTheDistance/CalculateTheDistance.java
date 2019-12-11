package CalculateTheDistance;

import java.awt.*;

public class CalculateTheDistance {
    /*
    A Cartesian plane is defined by 2 perpendicular number lines:
    the X-axis, which is horizontal
    the Y-axis, this is vertical
    Using these axes, we can describe any point in the plane using an ordered pair of number

    Task: write a program which takes 2 different points
    A(x1, y1) and B(x2, y2) and return the distance between these 2 points

    Pythagorean Theorem: AB^2 = (x2 - x1)^2 + (y2 - y1)^2
     */

    public static double calculate(Point a, Point b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }
}
