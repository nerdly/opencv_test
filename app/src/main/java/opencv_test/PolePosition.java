package opencv_test;

public class PolePosition {
    private int width;
    private int offsetFromCenter;

    public PolePosition(int width, int offsetFromCenter)
    {
        this.width = width;
        this.offsetFromCenter = offsetFromCenter;
    }

    public int getWidth(){
        return width;
    }

    public int getOffsetFromCenter(){
        return offsetFromCenter;
    }

    public String toString()
    {
        return String.format("width: %d offset: %d", width, offsetFromCenter);
    }
}
