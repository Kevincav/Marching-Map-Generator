import java.security.InvalidParameterException;

public class ProfessionalHashCoordinates extends FrontToBackCoordinates
{
    ProfessionalHashCoordinates(final String frontToBack)
    {
        parseFrontToBack(frontToBack);
        converFrontToBackCoordinates();
    }

    private final void parseFrontToBack(final String frontToBack)
    {
        String[] tokens = frontToBack.split(" ");

        if (frontToBack.equals("On Back Hash (Professional)"))
        {
            setValues(0.0, Hash.PROFESSIONAL_BACK_HASH, Direction.IN_FRONT);
        }
        else if (frontToBack.equals("On Front Hash (Professional)"))
        {
            setValues(0.0, Hash.PROFESSIONAL_FRONT_HASH, Direction.IN_FRONT);
        }
        else if (frontToBack.equals("On Back side line"))
        {
            setValues(0.0, Hash.PROFESSIONAL_BACK_SIDELINE, Direction.IN_FRONT);
        }
        else if (frontToBack.equals("On Front side line"))
        {
            setValues(0.0, Hash.PROFESSIONAL_FRONT_SIDELINE, Direction.IN_FRONT);
        }
        else if (frontToBack.matches(behindFrontHash))
        {
            setValues(Double.parseDouble(tokens[0]), Hash.PROFESSIONAL_FRONT_HASH, Direction.BEHIND);
        }
        else if (frontToBack.matches(behindBackHash))
        {
            setValues(Double.parseDouble(tokens[0]), Hash.PROFESSIONAL_BACK_HASH, Direction.BEHIND);
        }
        else if (frontToBack.matches(behindFrontSideline))
        {
            setValues(Double.parseDouble(tokens[0]), Hash.PROFESSIONAL_FRONT_SIDELINE, Direction.BEHIND);
        }
        else if (frontToBack.matches(inFrontOfFrontHash))
        {
            setValues(Double.parseDouble(tokens[0]), Hash.PROFESSIONAL_FRONT_HASH, Direction.IN_FRONT);
        }
        else if (frontToBack.matches(inFrontOfBackHash))
        {
            setValues(Double.parseDouble(tokens[0]), Hash.PROFESSIONAL_BACK_HASH, Direction.IN_FRONT);
        }
        else if (frontToBack.matches(inFrontOfBackSideline))
        {
            setValues(Double.parseDouble(tokens[0]), Hash.PROFESSIONAL_BACK_SIDELINE, Direction.IN_FRONT);
        }
        else
        {
            throw new InvalidParameterException("Unable to parse coordinate {" + frontToBack + "}");
        }
    }
}
