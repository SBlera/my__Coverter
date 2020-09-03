//conversion value

public class EUR extends Coin{

    private final double value = 4.23;
    @Override
    public double getValue() {
        return value;
    }
    public double calculate(double input) {
        return input * getValue();
    }
}
