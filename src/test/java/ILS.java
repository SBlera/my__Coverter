//Conversion value USD to ILS

public class ILS extends Coin{
      private final double value = 0.28;
    @Override
    public double getValue() {
        return value;
    }
    public double calculate(double input) {
        return input * getValue();
    }

    @Override
    public String GetName() {
        return "USD to ILS";
    }
}

