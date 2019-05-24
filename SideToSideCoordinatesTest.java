import com.sun.tools.javac.util.Assert;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class SideToSideCoordinatesTest
{
    private final String ON_YARDLINE = "SIDE 1: On 45 yd ln";
    private final String SIDE1_INSIDE = "SIDE 1: 4.0 steps inside 25 yd ln";
    private final String SIDE1_OUTSIDE = "SIDE 1: 3.25 steps outside 50 yd ln";
    private final String SIDE2_INSIDE = "SIDE 2: 4.0 steps inside 30 yd ln";
    private final String SIDE2_OUTSIDE = "SIDE 2: 3.75 steps outside 10 yd ln";

    @Test
    public void testNullEmptyCoordinate()
    {
        try
        {
            new SideToSideCoordinates(null);
        }
        catch (AssertionError e)
        {
            Assert.check(true, "Valid: Null argument caught");
        }

        try
        {
            new SideToSideCoordinates("");
        }
        catch (AssertionError e)
        {
            Assert.check(true, "Valid: Empty argument caught");
        }
    }

    @Test
    public void testInvalidCoordinates()
    {
        try
        {
            new SideToSideCoordinates("This is a test");
        }
        catch (InvalidParameterException e)
        {
            Assert.check(e.getMessage().equals("Unable to parse coordinate {This is a test}"),
                         "Valid: Was able to verify exception was thrown for bad coordinates");
        }
    }

    @Test
    public void verifySideToSideWorks()
    {
        final SideToSideCoordinates sideToSideCoordinatesA = new SideToSideCoordinates(SIDE1_INSIDE);
        final SideToSideCoordinates sideToSideCoordinatesB = new SideToSideCoordinates(SIDE2_INSIDE);

        Assert.check(sideToSideCoordinatesA.getSide() == 0, "Validates that Side 1 return 0");
        Assert.check(sideToSideCoordinatesB.getSide() == 100, "Validates that Side 2 return 100");
    }

    @Test
    public void verifyGetOutsideWorks()
    {
        final SideToSideCoordinates on = new SideToSideCoordinates(ON_YARDLINE);
        final SideToSideCoordinates side1Inside = new SideToSideCoordinates(SIDE1_INSIDE);
        final SideToSideCoordinates side1Outside = new SideToSideCoordinates(SIDE2_INSIDE);
        final SideToSideCoordinates side2Inside = new SideToSideCoordinates(SIDE1_OUTSIDE);
        final SideToSideCoordinates side2Outside = new SideToSideCoordinates(SIDE2_OUTSIDE);

        Assert.check(on.getOutside() == 1, "Validates that getOutside returns 1 for on the yardline");
        Assert.check(side1Inside.getOutside() == 1, "Validates that getOutside returns 1 for side 1 inside");
        Assert.check(side1Outside.getOutside() == -1, "Validates that getOutside returns -1 for side 1 outside");
        Assert.check(side2Inside.getOutside() == -1, "Validates that getOutside returns -1 for side 2 inside");
        Assert.check(side2Outside.getOutside() == 1, "Validates that getOutside returns 1 for side 2 outside");
    }

    @Test
    public void verifyStepsWorksProperly()
    {
        final SideToSideCoordinates on = new SideToSideCoordinates(ON_YARDLINE);
        final SideToSideCoordinates side1Inside = new SideToSideCoordinates(SIDE1_INSIDE);

        Assert.check(on.getSteps() == 0.0, "Validates that getSteps returns 0.0 for on the yardline");
        Assert.check(side1Inside.getSteps() == 4.0, "Validates that getSteps returns 4.0 for side 1 inside");
    }

    @Test
    public void verifyYardlineWorksProperly()
    {
        final SideToSideCoordinates on = new SideToSideCoordinates(ON_YARDLINE);
        final SideToSideCoordinates side1Inside = new SideToSideCoordinates(SIDE1_INSIDE);

        Assert.check(on.getYardLine() == 45, "Validates that getYardline returns 45 for on the yardline");
        Assert.check(side1Inside.getYardLine() == 25, "Validates that getYardline returns 25 for side 1 inside");
    }

    @Test
    public void validateCoordinates()
    {
        final SideToSideCoordinates on = new SideToSideCoordinates(ON_YARDLINE);
        final SideToSideCoordinates side1Inside = new SideToSideCoordinates(SIDE1_INSIDE);
        final SideToSideCoordinates side1Outside = new SideToSideCoordinates(SIDE1_OUTSIDE);
        final SideToSideCoordinates side2Inside = new SideToSideCoordinates(SIDE2_INSIDE);
        final SideToSideCoordinates side2Outside = new SideToSideCoordinates(SIDE2_OUTSIDE);

        Assert.check(on.getxCoordinates() == 45.0, "Verifies that on the 45 returns 45.0");
        Assert.check(side1Inside.getxCoordinates() == 29.0, "Verifies that 4 steps inside the 25 (side 1) returns 29.0");
        Assert.check(side1Outside.getxCoordinates() == 46.75, "Verifies 3.25 steps outside the 50 (side 1) returns 47.75");
        Assert.check(side2Inside.getxCoordinates() == 66.0, "Verifies 4 steps inside the 30 (side 2) returns 66.0");
        Assert.check(side2Outside.getxCoordinates() == 93.75, "Verifies 3.72 steps outside the 10 (side 2) returns 93.75");

    }
}
