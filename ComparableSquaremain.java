//This program is created by Aswani Darsh 21CE006
//Github link:-
// //Aim:- Define a class named ComparableSquare that extends Square and implements Comparable. Implement the compareTo method to compare the Squares on the basis of area. Write a test class to find the larger of two instances of ComparableSquareobjects.
interface Comparable{
    public void CompareTo(double Area1,double Area2);
}
class Square{
    private double s1;
    double Area = 0.0;
    Square(){
        s1 = 5.0;
    }
    Square(double s1){
        this.s1 = s1;
    }
    public double getArea(double s1){
        return s1*s1;
    }
    public void setside(double s1){
        this.s1 = s1;
    }
    public double getSide(){
        return s1;
    }
}
class comparableSquare extends Square implements Comparable{

    @Override
    public void CompareTo(double Area1,double Area2){
        if(Area1 == Area2){
            System.out.println("Both squares are same");
        }
        else{
            System.out.println("Both squares are different");
        }

    }
}
public class ComparableSquaremain {
    public static void main(String[] args) {
        comparableSquare c1 = new comparableSquare();
        comparableSquare c2 = new comparableSquare();
        c1.setside(10);
        c2.setside(10.1);
        System.out.println("side of square 1:"+c1.getSide());
        System.out.println("side of square 2:"+c2.getSide());
        System.out.println("area of square 1:"+c1.getArea(c1.getSide()));
        System.out.println("area of square 2:"+c2.getArea(c2.getSide()));
        c1.CompareTo(c1.getArea(c1.getSide()),c2.getArea(c2.getSide()));
        System.out.println("This program is created by Darsh Aswani 21CE006");
    }
}
