import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {

    @Test
    public void verifyThatTheMeasurementsAreEqual() {
        Measurement measurement1 = new Measurement(5);
        Measurement measurement2 = new Measurement(5);

        boolean result = measurement1.isEqualTo(measurement2);

        Assert.assertEquals(result, true);
    }

    @Test
    public void verifyThatTheMeasurementsAreNotEqual() {
        Measurement measurement1 = new Measurement(5);
        Measurement measurement2 = new Measurement(15);

        boolean result = measurement1.isEqualTo(measurement2);

        Assert.assertNotEquals(result, true);
    }

    @Test
    public void verifyThatTheMeasurementsAreNotEqualByObject() {
        Measurement measurement1 = new Measurement(5);
        Measurement measurement2 = new Measurement(5);
        Assert.assertEquals(measurement1, measurement2);
    }

    @Test
    public void verifyThatTwoDifferentUnitsAreEqual() {
        Measurement measurementInFeet = new Measurement(5);
        measurementInFeet.setUnit("Feet");
        Measurement measurementInInches = new Measurement(60);
        measurementInInches.setUnit("Inch");
        Assert.assertEquals(measurementInFeet, measurementInInches);


    }

    
}
