
public class Test {

    public static void main(String[] args) {

        /**
         * Adapter - Adopt other (stranger) abstraction in our own abstraction
         */

        ShinyNewBox box = new ShinyNewBox();
        System.out.println(box);
        box.getCharger().info();

        box.setCharger(new ChargerAdapter());
        System.out.println(box);
        box.getCharger().info();


    }

}
