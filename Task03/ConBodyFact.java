package Task03;

public class ConBodyFact implements BodyFactory {
    @Override
    public Main createBody(double current, double voltage1, double voltage2, double voltage3) {
        return new Main(current, voltage1, voltage2, voltage3);
    }
}
