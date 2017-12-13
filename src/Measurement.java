import java.util.Objects;

public class Measurement {
    private int value;

    public Measurement(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEqualTo(Measurement measurement2) {
        return value == measurement2.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
