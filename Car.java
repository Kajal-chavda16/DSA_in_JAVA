public class Car implements Engine , Brake , Media {

    int a = 30;

    @Override
    public void start(){
        System.out.println("i am normal start");
    }

    @Override
    public void stop(){
        System.out.println("i am normal stop");
    }

    @Override
    public void acc(){
        System.out.println("i am normal acc");
    }

    @Override
    public void brake(){
        System.out.println("i am normal brake");
    }
}
