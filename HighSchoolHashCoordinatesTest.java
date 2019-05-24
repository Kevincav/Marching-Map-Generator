import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

public class HighSchoolHashCoordinatesTest
{
    @Test
    public void testHighSchoolOnBackHash()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("On Back Hash (HS)");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 56);
    }

    @Test
    public void testHighSchoolOnFrontHash()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("On Front Hash (HS)");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 28);
    }

    @Test
    public void testHighSchoolOnBackSideline()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("On Back side line");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 84);
    }

    @Test
    public void testHighSchoolOnFrontSideline()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("On Front side line");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 0);
    }

    @Test
    public void testHighSchoolBehindFrontHash()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("10.0 steps behind Front Hash (HS)");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 38);
    }

    @Test
    public void testHighSchoolBehindBackHash()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("10.0 steps behind Back Hash (HS)");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 66);
    }

    @Test
    public void testHighSchoolBehindFrontSideline()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("10.0 steps behind Front side line");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 10);
    }

    @Test
    public void testHighSchoolInFrontOfFrontHash()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("10.0 steps in front of Front Hash (HS)");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 18);
    }

    @Test
    public void testHighSchoolInFrontOfBackHash()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("10.0 steps in front of Back Hash (HS)");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 46);
    }

    @Test
    public void testHighSchoolInFronOfBackSideline()
    {
        HighSchoolHashCoordinates highSchoolHashCoordinates = new HighSchoolHashCoordinates("10.0 steps in front of Back side line");
        Assert.check(highSchoolHashCoordinates.getyCoordinate() == 74);
    }
}
