import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

public class FrontToBackCoordinatesTest
{
    @Test
    public void testHighSchoolFrontSideLineCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.HIGH_SCHOOL_FRONT_SIDELINE, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 3.75, "Verifies 3.75 in front of sideline");
    }

    @Test
    public void testHighSchoolFrontHashCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.HIGH_SCHOOL_FRONT_HASH, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 24.25, "Verifies 24.25 in front of sideline");

        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.HIGH_SCHOOL_FRONT_HASH, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 31.75, "Verifies 31.75 in front of sideline");
    }

    @Test
    public void testHighSchoolBackHashCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.HIGH_SCHOOL_BACK_HASH, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 52.25, "Verifies 52.25 in front of sideline");

        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.HIGH_SCHOOL_BACK_HASH, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 59.75, "Verifies 59.75 in front of sideline");
    }

    @Test
    public void testHighSchoolBackSideLineCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.HIGH_SCHOOL_BACK_SIDELINE, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 80.25, "Verifies 80.25 in front of sideline");
    }

    @Test
    public void testCollegeFrontSideLineCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.COLLEGE_FRONT_SIDELINE, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 3.75, "Verifies 3.75 in front of sideline");
    }

    @Test
    public void testCollegeFrontHashCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.COLLEGE_FRONT_HASH, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 28.25, "Verifies 28.25 in front of sideline");

        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.COLLEGE_FRONT_HASH, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 35.75, "Verifies 34.75 in front of sideline");
    }

    @Test
    public void testCollegeBackHashCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.COLLEGE_BACK_HASH, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 48.25, "Verifies 52.25 in front of sideline");

        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.COLLEGE_BACK_HASH, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 55.75, "Verifies 59.75 in front of sideline");
    }

    @Test
    public void testCollegeBackSideLineCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.COLLEGE_BACK_SIDELINE, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 80.25, "Verifies 80.25 in front of sideline");
    }

    @Test
    public void testProfessionalFrontSideLineCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.PROFESSIONAL_FRONT_SIDELINE, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 3.75, "Verifies 3.75 in front of sideline");
    }

    @Test
    public void testProfessionalFrontHashCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.PROFESSIONAL_FRONT_HASH, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 32.25, "Verifies 32.25 in front of sideline");

        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.PROFESSIONAL_FRONT_HASH, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 39.75, "Verifies 39.75 in front of sideline");
    }

    @Test
    public void testProfessionalBackHashCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.PROFESSIONAL_BACK_HASH, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 48.25, "Verifies 48.25 in front of sideline");

        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.PROFESSIONAL_BACK_HASH, FrontToBackCoordinates.Direction.BEHIND);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 55.75, "Verifies 55.75 in front of sideline");
    }

    @Test
    public void testProfessionalBackSideLineCoordinates()
    {
        FrontToBackCoordinates frontToBackCoordinates = new FrontToBackCoordinates();
        frontToBackCoordinates.setValues(3.75, FrontToBackCoordinates.Hash.PROFESSIONAL_BACK_SIDELINE, FrontToBackCoordinates.Direction.IN_FRONT);
        frontToBackCoordinates.converFrontToBackCoordinates();
        Assert.check(frontToBackCoordinates.getyCoordinate() == 84.25, "Verifies 84.25 in front of sideline");
    }
}
