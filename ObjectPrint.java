public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ObjectPrint{num=" + num + "}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);
    }
}
