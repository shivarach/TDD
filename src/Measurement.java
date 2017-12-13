import java.util.Objects;

public class Measurement {
    private int value;
    private Unit unit;

    public enum Unit { FEET, INCH }

    public Measurement(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    public boolean isEqualTo(Measurement measurement2) {
        return value == measurement2.getValue();
    }

    public Measurement add(Measurement measurement) {
        return new Measurement(feetToInches(this) + feetToInches(measurement), Unit.INCH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement measurement = (Measurement) o;
        return feetToInches(this) == feetToInches(measurement);
    }

    private int feetToInches(Measurement measurement) {
        if(measurement.unit.equals(Unit.FEET)) {
            return 12 * measurement.getValue();
        }
        return measurement.getValue();
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }

}
