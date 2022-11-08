//This Program Is Created By Aswani Darsh 21CE006
//https:
/*AiM:Design a class named Triangle that extends GeometricObject. 
•   The class contains: Three double data fields named side1, side2, and side3 
•   with default values 1.0 to denote three sides of a triangle. 
•   A no-arg constructor that creates a default triangle. 
•   A constructor that creates a triangle with the specified side1, side2, and side3.
•   The accessor methods for all three data fields.
•   A method named getArea() that returns the area of this triangle.
•   A method named getPerimeter() that returns the perimeter of this triangle.
•   A method named toString() that returns a string description for the triangle. 
•   return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + 
•   side3
*/

public class Triangle_main {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(25.256, 68.546, 86.46);
        
        System.out.println(t1.toString());
        t1.print();
        System.out.println();
        
        System.out.println(t2.toString());
        t2.toString();
        t2.print();
        System.out.println("This Program Is Created By Aswani Darsh 21CE006");
    }

}
