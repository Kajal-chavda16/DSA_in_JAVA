public class EnumsEx {
    enum Week implements A{
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;
        // theses are enum constants
        // static, public and final
        // since it is final u cannot create child enums
        // type is Week

        Week(){
            System.out.println("constructor created for"+ this);
        }
        // this is not public or protected ; it is only private or default
        // why ? we don't want to create new objects
        // bcz its not enum ' s concept

        // internally : public static final Week Monday = new Week(); 

        public void greet(){
            System.out.println("Hello.................");
        }
    }


    public static void main(String[] args) {
        Week week ;
        week = Week.Monday ;
        week.greet();

        System.out.println(week.valueOf("Tuesday"));
        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        // System.out.println(week.ordinal());
    }
}
