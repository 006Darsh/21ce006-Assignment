// Name :- Aswani Darsh
// Roll no :-21ce006
/*In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains: 
•   A private int data field named n that defines the number of sides in the polygon with default value 3.
•   A private double data field named side that stores the length of the side with default value 1.
•   A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
•   A private double data field named y that defines the coordinate of the polygon’s center with default value 0.
•   A no-arg constructor that creates a regular polygon with default values.  A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
•   A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
•   The accessor and mutator methods for all data fields.
•   The method getPerimeter() that returns the perimeter of the polygon. 
•   The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon is:
 */
import java.math.*;

public class RegularPolygon {

    static double pi = 3.14;
    private int nos;
    private double sides;
    private double a;
    private double b;
    
    public RegularPolygon(){
        nos = 3;
        sides = 1;
        a = 0;
        b = 0;
    }
    
    public int getN() {
        return nos;
    }

    public void setN(int nos) {
        this.nos = nos;
    }

    public double getSide() {
        return sides;
    }

    public void setSide(double sides) {
        this.sides = sides;
    }

    public double getX() {
        return a;
    }

    public void setX(double x) {
        this.a = x;
    }

    public double getY() {
        return b;
    }

    public void setY(double y) {
        this.b = y;
    }

    public RegularPolygon(int nos, double sides){
        this.nos = nos;
        this.sides = sides;
        a = 0;
        b = 0;
    }
    
    public RegularPolygon(int nos, double sides, double x, double y){
        this.nos = nos;
        this.sides = sides;
        this.a = x;
        this.b = y;
    }
    
    public double getPerimeter() {
        return nos*sides;
    }
    
    public double getArea() {
        return (nos*sides*sides)/(4*Math.tan(pi/nos));
    }
    
    public void print() {
        System.out.println("No. of sides : " + nos);
        System.out.println("Length of sides : " + sides);
        System.out.println("Perimeter of Polygon : " + getPerimeter());
        System.out.println("Area of Polygon : " + getArea());
        System.out.println();
    }
}
    
