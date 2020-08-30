public abstract class Coin implements ICalculator {
    public abstract double getValue();{
    }
    public double calculate(double input) {
        return input*getValue();
    }
}
