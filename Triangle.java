public class Triangle {
    public static void main(String[] args) {
        p2(5, 0);
    }

    static void p2(int row , int col){
        if(row == 0){
            return;
        }
        if (col < row) {
            p2(row,col+1);
            System.out.print("* ");
           
        } else {
            p2(row-1, 0);
            System.out.println();
            
        }   
    }
    static void p1(int row , int col){
        if(row == 0){
            return;
        }
        if (col < row) {
            System.out.print("* ");
            p1(row,col+1);
        } else {
            System.out.println();
            p1(row-1, 0);
        }   
    }
}
