import java.util.Objects;

public class Measurement {
    private int value;
    private String unit;

    public Measurement(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public boolean isEqualTo(Measurement measurement2) {
        return value == measurement2.getValue();
    }

    @Override
    public boolean equals(Object o) {
        int feetInInches = value;
        if(unit != null && unit.equals("Feet")) {
            feetInInches = feetToInches(this.value);
        }

        Measurement that = (Measurement) o;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return feetInInches == that.value;
    }

    private int feetToInches(int feet) {
        return feet * 12;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
