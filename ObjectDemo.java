// package OOP4;

public class ObjectDemo {

    int num ; 
    float gpa ;

    public ObjectDemo(int num , float gpa) {
        this.num = num ;
        this.gpa = gpa ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {  
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable {       
    //     super.finalize();
    // }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12 , 55.6f);
        System.out.println(obj.hashCode());

        ObjectDemo obj2 = obj;
        System.out.println(obj2.hashCode());

        if (obj == obj2) {
            System.out.println("obj is equals to obj2");
        }

        if (obj.equals(obj2)) {
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass().getName());

    }
    
}
