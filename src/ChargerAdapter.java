
public class ChargerAdapter implements Charger{

    private AUCharger auCharger = new AUCharger();

    @Override
    public void info() {
        System.out.println("I adopt " + auCharger + " to Israel Electricity");
    }

    @Override
    public String toString() {
        return "Israel";
    }
}
