import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

public class CollegeHashCoordinatesTest
{
    @Test
    public void testCollegeOnBackHash()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("On Back Hash (College)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 52);
    }

    @Test
    public void testCollegeOnFrontHash()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("On Front Hash (College)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 32);
    }

    @Test
    public void testCollegeOnBackSideline()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("On Back side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 84);
    }

    @Test
    public void testCollegeOnFrontSideline()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("On Front side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 0);
    }

    @Test
    public void testCollegeBehindFrontHash()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("10.0 steps behind Front Hash (College)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 42);
    }

    @Test
    public void testCollegeBehindBackHash()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("10.0 steps behind Back Hash (College)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 62);
    }

    @Test
    public void testCollegeBehindFrontSideline()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("10.0 steps behind Front side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 10);
    }

    @Test
    public void testCollegeInFrontOfFrontHash()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("10.0 steps in front of Front Hash (College)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 22);
    }

    @Test
    public void testCollegeInFrontOfBackHash()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("10.0 steps in front of Back Hash (College)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 42);
    }

    @Test
    public void testCollegeInFronOfBackSideline()
    {
        CollegeHashCoordinates collegeHashCoordinates = new CollegeHashCoordinates("10.0 steps in front of Back side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 74);
    }
}
