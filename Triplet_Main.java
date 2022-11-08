//This program is created by Aswani Darsh 21CE006
//Github link:-
// //Aim:- Create a Triplet class that encapsulates three objects of the same data type in a given instance of Triplet.
class Triplet<T> {
    private T obj1;
    private T obj2;
    private T obj3;
    
    public Triplet(T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    
    public T getObj1() {
        return obj1;
    }
    
    public T getObj2() {
        return obj2;
    }
    
    public T getObj3() {
        return obj3;
    }

}
public class Triplet_Main {
    public static void main(String[] args) {
        Triplet<String> triplet = new Triplet<>("Aswani ", "Darsh ", "Hemrajbhai");
        System.out.println(triplet.getObj1());
        System.out.println(triplet.getObj2());
        System.out.println(triplet.getObj3());
        System.out.println("This program is created by Aswani Darsh 21CE006");
    }
}
