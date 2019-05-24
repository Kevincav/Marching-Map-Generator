import com.sun.tools.javac.util.Assert;

public class FrontToBackCoordinates
{
    private Double steps;
    private Hash hash;
    private Direction direction;
    private Double yCoordinate;

    final public String behindFrontHash = "^\\d{1,2}\\.\\d{1,2} steps behind Front Hash (.*)$";
    final public String behindBackHash = "^\\d{1,2}\\.\\d{1,2} steps behind Back Hash (.*)$";
    final public String behindFrontSideline = "^\\d{1,2}\\.\\d{1,2} steps behind Front side line$";
    final public String inFrontOfFrontHash = "^\\d{1,2}\\.\\d{1,2} steps in front of Front Hash (.*)$";
    final public String inFrontOfBackHash = "^\\d{1,2}\\.\\d{1,2} steps in front of Back Hash (.*)$";
    final public String inFrontOfBackSideline = "^\\d{1,2}\\.\\d{1,2} steps in front of Back side line$";

    public enum Hash
    {
        HIGH_SCHOOL_FRONT_SIDELINE(0),
        HIGH_SCHOOL_FRONT_HASH(28),
        HIGH_SCHOOL_BACK_HASH(56),
        HIGH_SCHOOL_BACK_SIDELINE(84),
        COLLEGE_FRONT_SIDELINE(0),
        COLLEGE_FRONT_HASH(32),
        COLLEGE_BACK_HASH(52),
        COLLEGE_BACK_SIDELINE(84),
        PROFESSIONAL_FRONT_SIDELINE(0),
        PROFESSIONAL_FRONT_HASH(36),
        PROFESSIONAL_BACK_HASH(52),
        PROFESSIONAL_BACK_SIDELINE(88),
        ;

        private int stepCount;

        Hash (int stepCount)
        {
            this.stepCount = stepCount;
        }

        public int getStepCount()
        {
            return stepCount;
        }
    }

    public enum Direction
    {
        IN_FRONT(-1),
        BEHIND(1),
        ;

        int direction;

        Direction(int direction)
        {
            this.direction = direction;
        }

        public int getDirection()
        {
            return direction;
        }
    }

    public void converFrontToBackCoordinates()
    {
        yCoordinate = hash.getStepCount() + direction.getDirection() * steps;
    }

    public void setValues(final Double steps, final Hash hash, final Direction direction)
    {
        this.steps = steps;
        this.hash = hash;
        this.direction = direction;
    }

    public Double getyCoordinate()
    {
        return yCoordinate;
    }
}
