//Conversion value ILS to USD

public class USD extends Coin {
    private final double value = 3.52;

    @Override
    public double getValue() {
        return value;
    }
    public double calculate(double input) {
        return input * getValue();
    }

    @Override
    public String GetName() {
        return "ILS to USD";
    }
}

