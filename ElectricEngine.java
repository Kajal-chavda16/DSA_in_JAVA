public class ElectricEngine implements Engine {
    @Override
    public void start(){
        System.out.println("ec engine start");
    }

    @Override
    public void stop(){
        System.out.println("ec engine stop");
    }

    @Override
    public void acc(){
        System.out.println("ec engine accelerate");
    }

}