import processing.core.PApplet;

public class FourBall extends PApplet {
    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 15;

    int firstBallPosition = 0;
    int secondBallPosition = 0;
    int thirdBallPosition = 0;
    int fourthBallPosition = 0;

    public static void main(String[] args) {
        PApplet.main("FourBall",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(fourthBallPosition, ballPlacingPosition(4),DIAMETER,DIAMETER);
        fourthBallPosition += 4;
        ellipse(thirdBallPosition, ballPlacingPosition(3),DIAMETER,DIAMETER);
        thirdBallPosition += 3;
        ellipse(secondBallPosition, ballPlacingPosition(2),DIAMETER,DIAMETER);
        secondBallPosition += 2;
        ellipse(firstBallPosition, ballPlacingPosition(1), DIAMETER,DIAMETER);
        firstBallPosition += 1;
    }

    private float ballPlacingPosition(int ballNumber) {
        float position = (HEIGHT * ballNumber) / 5;
        return position;
    }
}
