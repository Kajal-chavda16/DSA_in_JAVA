public class Main {
    public static void main(String[] args) {
        Human kajal = new Human(20, "kajal", 10000, false);
        Human vasu = new Human(20, "vasu", 15000, false);
        Human vk = new Human(25, "vk", 50000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);

        // greeting();
    }

    static void fun() {
        // greeting();

        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
        ;
    }

    void greeting() {
        System.out.println("hello");
        fun();
    };
}
