import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {

    @Test
    public void verifyThatTheMeasurementsAreEqual() {
        Measurement measurement1 = new Measurement(5, Measurement.Unit.INCH);
        Measurement measurement2 = new Measurement(5, Measurement.Unit.INCH);

        boolean result = measurement1.isEqualTo(measurement2);

        Assert.assertEquals(result, true);
    }

    @Test
    public void verifyThatTheMeasurementsAreNotEqual() {
        Measurement measurement1 = new Measurement(5, Measurement.Unit.INCH);
        Measurement measurement2 = new Measurement(15, Measurement.Unit.INCH);

        boolean result = measurement1.isEqualTo(measurement2);

        Assert.assertNotEquals(result, true);
    }

    @Test
    public void verifyThatTheMeasurementsAreNotEqualByObject() {
        Measurement measurement1 = new Measurement(5, Measurement.Unit.INCH);
        Measurement measurement2 = new Measurement(5, Measurement.Unit.INCH);
        Assert.assertEquals(measurement1, measurement2);
    }

    // Test cases with feet and inches
    @Test
    public void verifyIfTweleveInchesAndOneFeetAreEqual() {
        Measurement measurementInFeet = new Measurement(12, Measurement.Unit.INCH);
        Measurement measurementInInches = new Measurement(1, Measurement.Unit.FEET);
        Assert.assertEquals(measurementInFeet, measurementInInches);
    }

    @Test
    public void verifyIfOneFeetAndTwelveInchesAreEqual() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.FEET);
        Measurement measurementInInches = new Measurement(12, Measurement.Unit.INCH);
        Assert.assertEquals(measurementInFeet, measurementInInches);
    }

    @Test
    public void verifyIfOneFeetAndOneFeetAreEqual() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.FEET);
        Measurement measurementInInches = new Measurement(1, Measurement.Unit.FEET);
        Assert.assertEquals(measurementInFeet, measurementInInches);
    }

    @Test
    public void verifyIfOneFeetAndOneFeetAreNotEqual() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.FEET);
        Measurement measurementInInches = new Measurement(2, Measurement.Unit.FEET);
        Assert.assertNotEquals(measurementInFeet, measurementInInches);
    }

    @Test
    public void verifyIfOneInchAndOneInchAreEqual() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.INCH);
        Measurement measurementInInches = new Measurement(1, Measurement.Unit.INCH);
        Assert.assertEquals(measurementInFeet, measurementInInches);
    }
    @Test
    public void verifyIfOneInchAndTwoInchAreEqual() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.INCH);
        Measurement measurementInInches = new Measurement(2, Measurement.Unit.INCH);
        Assert.assertNotEquals(measurementInFeet, measurementInInches);
    }

    @Test
    public void verifyIfTweleveFeetAndOneInchAreNotEqual() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.INCH);
        Measurement measurementInInches = new Measurement(12, Measurement.Unit.INCH);
        Assert.assertNotEquals(measurementInFeet, measurementInInches);
    }

    //Test cases with add
    @Test
    public void verifySumOfOneFeetAndFiveInchesIsSeventeenInches() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.FEET);
        Measurement measurementInInches = new Measurement(5, Measurement.Unit.INCH);
        Measurement expectedMeasurement = new Measurement(17, Measurement.Unit.INCH);
        Assert.assertEquals(expectedMeasurement, measurementInFeet.add(measurementInInches));
    }

    @Test
    public void verifySumOfOneFeetAndFiveInchesIsNotTenInches() {
        Measurement measurementInFeet = new Measurement(1, Measurement.Unit.FEET);
        Measurement measurementInInches = new Measurement(5, Measurement.Unit.INCH);
        Measurement expectedMeasurement = new Measurement(10, Measurement.Unit.INCH);
        Assert.assertNotEquals(expectedMeasurement, measurementInFeet.add(measurementInInches));
    }


}
