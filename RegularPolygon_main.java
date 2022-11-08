public class RegularPolygon_main {

    public static void main(String[] args) {
        
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(5, 120);
        RegularPolygon p3 = new RegularPolygon(10, 600, 60, 20);
        
        System.out.println("Polygon 1 Default");
        p1.print();
        System.out.println("Polygon 2 without coordinate");
        p2.print();
        System.out.println("Polygon 3 with coordinate");
        p3.print();
        System.out.println("This Program is created By Aswani Drash 21CE006");
        
    }

}
