// package OOP3.INHERITANCE;
// "C:\DSA in JAVA\source code\OOP\OOP3\INHERITANCE"

public class BoxWeight extends Box{
    double weight ;

    public BoxWeight() {
       this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l , double w , double h , double weight) {
        super(l,w,h);
        this.weight = weight;
        // System.out.println(super.weight);
    }
   
}
