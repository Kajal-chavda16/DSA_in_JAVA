public class Triangle extends Shapes {

    // late binding
    void area(){
        System.out.println("Area is 0.5 * h * b");
    }

    // // Early binding
    //final void area(){
    //     System.out.println("Area is 0.5 * h * b");
    // }

    // static method can be inheritance but it can't overridden.
}
