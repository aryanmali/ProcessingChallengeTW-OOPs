import processing.core.PApplet;

public class ProcessingFourBalls extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int DIAMETER = 10;
    int xCoordinate = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingFourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(xCoordinate++, HEIGHT / 5);
        drawCircle(xCoordinate * 2, HEIGHT / 5 * 2);
        drawCircle(xCoordinate * 3, HEIGHT / 5 * 3);
        drawCircle(xCoordinate * 4, HEIGHT / 5 * 4);
    }

    private void drawCircle(int xCoordinate, int HEIGHT) {
        ellipse(xCoordinate, HEIGHT, DIAMETER, DIAMETER);
    }
}
