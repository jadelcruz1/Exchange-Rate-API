public class Exchange {

    private int numberOptions;
    private double value;

    public Exchange(int numberOptions, double value) {
        this.numberOptions = numberOptions;
        this.value = value;
    }

    public int getNumberOptions() {
        return numberOptions;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "numberOptions=" + numberOptions +
                ", value=" + value +
                '}';
    }
}
