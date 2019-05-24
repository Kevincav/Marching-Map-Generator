import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

public class ProfessionalHashCoordinatesTest
{
    @Test
    public void testProfessionalOnBackHash()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("On Back Hash (Professional)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 52);
    }

    @Test
    public void testProfessionalOnFrontHash()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("On Front Hash (Professional)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 36);
    }

    @Test
    public void testProfessionalOnBackSideline()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("On Back side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 88);
    }

    @Test
    public void testProfessionalOnFrontSideline()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("On Front side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 0);
    }

    @Test
    public void testProfessionalBehindFrontHash()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("10.0 steps behind Front Hash (Professional)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 46);
    }

    @Test
    public void testProfessionalBehindBackHash()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("10.0 steps behind Back Hash (Professional)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 62);
    }

    @Test
    public void testProfessionalBehindFrontSideline()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("10.0 steps behind Front side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 10);
    }

    @Test
    public void testProfessionalInFrontOfFrontHash()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("10.0 steps in front of Front Hash (Professional)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 26);
    }

    @Test
    public void testProfessionalInFrontOfBackHash()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("10.0 steps in front of Back Hash (Professional)");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 42);
    }

    @Test
    public void testProfessionalInFronOfBackSideline()
    {
        ProfessionalHashCoordinates collegeHashCoordinates = new ProfessionalHashCoordinates("10.0 steps in front of Back side line");
        Assert.check(collegeHashCoordinates.getyCoordinate() == 78);
    }

}
