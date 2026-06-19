package railways;

public class Luggage extends Compartment {

    @Override
    public String notice() {
        return "Luggage Compartment: Carry only permitted luggage.";
    }
}