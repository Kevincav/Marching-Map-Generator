import com.sun.tools.javac.util.Assert;

import java.security.InvalidParameterException;

public class SideToSideCoordinates
{
    private Outside outside;
    private Side side;
    private Integer yardLine;
    private Double steps;
    private Double xCoordinates;
    private String sideToSide;

    public enum Side
    {
        SIDE1(0),
        SIDE2(100),
        ;

        private int sideLine;

        Side(int sideLine)
        {
            this.sideLine = sideLine;
        }

        public int getSideLine()
        {
            return sideLine;
        }
    }

    public enum Outside
    {
        SIDE1_INSIDE(1),
        SIDE1_OUTSIDE(-1),
        SIDE2_INSIDE(-1),
        SIDE2_OUTSIDE(1),
        ;

        private int direction;

        Outside(int direction)
        {
            this.direction = direction;
        }

        public int getDirection()
        {
            return direction;
        }
    }

    public SideToSideCoordinates(final String sideToSide)
    {
        Assert.check(sideToSide != null && !sideToSide.isEmpty());
        this.sideToSide = sideToSide;
        parseSideToSide();
        convertSideToSideCoordinates();
    }

    private void parseSideToSide()
    {
        final String onMatching = "^SIDE [1,2]{1}: On \\d{1,2} yd ln";
        final String aroundMatching = "^SIDE [1,2]{1}: \\d*\\.\\d{1,2} steps [a-z]+ \\d{1,2} yd ln$";

        if (sideToSide.matches(onMatching))
        {
            final String[] coords = sideToSide.split(" ");

            side = "1:".equals(coords[1]) ? Side.SIDE1 : Side.SIDE2;
            yardLine = Integer.parseInt(coords[3]);
            steps = 0.0;
            outside = side == Side.SIDE1 ? Outside.SIDE1_INSIDE : Outside.SIDE2_OUTSIDE;
        }
        else if (sideToSide.matches(aroundMatching))
        {
            final String[] coords = sideToSide.split(" ");
            side = "1:".equals(coords[1]) ? Side.SIDE1 : Side.SIDE2;
            steps = Double.parseDouble(coords[2]);
            yardLine = Integer.parseInt(coords[5]);

            if ("outside".equals(coords[4]))
            {
                outside = side == Side.SIDE1 ? Outside.SIDE1_OUTSIDE : Outside.SIDE2_OUTSIDE;
            }
            else
            {
                outside = side == Side.SIDE1 ? Outside.SIDE1_INSIDE : Outside.SIDE2_INSIDE;
            }
        }
        else
        {
            throw new InvalidParameterException("Unable to parse coordinate {" + sideToSide + "}");
        }
    }

    private void convertSideToSideCoordinates()
    {
        int direction = side == Side.SIDE1 ? 1 : -1;
        xCoordinates = side.getSideLine() + direction * yardLine + outside.getDirection() * steps;
    }

    public Double getSteps()
    {
        return steps;
    }

    public Double getxCoordinates()
    {
        return xCoordinates;
    }

    public Integer getOutside()
    {
        return outside.getDirection();
    }

    public Integer getSide()
    {
        return side.getSideLine();
    }

    public Integer getYardLine()
    {
        return yardLine;
    }
}
