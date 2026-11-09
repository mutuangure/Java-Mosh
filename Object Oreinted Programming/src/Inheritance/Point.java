package Inheritance;

import java.util.Objects;

public class Point
{
    //Comparing Object.
    private int x;
    private int y;

    public Point(int x, int y) { //Generate constructor.
        this.x = x;
        this.y = y;
        System.out.println("\nPoint Class");
    }

    /*
    //IntelliJ Generated code

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    */

    @Override
    public boolean equals(Object obj) { //Cannot convert to point object since its override thus you down caste
        //Optimization technique.
        if (this == obj)
            return true;

        /*if (obj instanceof Point)) {
        ..........
        }
        return false; */ //Simplify
        if (!(obj instanceof  Point)) //If an object is not an instance of the point object return false.
            return false;
        var other = (Point)obj; //DownCasting
        return other.x == x && other.y == y;
    }

    @Override //Overriding the hashcode method.
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
