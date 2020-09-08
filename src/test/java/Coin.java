// Calc for conversion result and conversion type

public abstract class Coin implements ICalculator {
    public abstract double getValue();{
    }
    public double calculate(double input) {
        return input*getValue();
    }

    public abstract String GetName();
}
