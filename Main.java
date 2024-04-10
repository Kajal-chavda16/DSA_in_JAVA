public class Main{
    public static void main(String[] args) {
        int a = 8 ; 
        int b = 0 ;

        try{
            // divide(a, b);
            // throw new Exception("just for fun.");
            String name = "kajal";
            if (name == "kajal") {
                throw new MyException("name is kajal.");
            }
        } catch(MyException e){
            System.out.println(e.getMessage());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("normal exception");
        } finally {
            System.out.println(" it is always execute.");
        }
    
    }

    static int divide(int a , int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("pls don't divide by zero.");
        }
        return a / b ;
    }
}