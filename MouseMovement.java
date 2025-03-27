import java.awt.*;

public class MouseMovement {

    public static void main(String[] args) throws AWTException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        Robot bot = new Robot();

        while (true) {
            bot.delay(60000);
            bot.mouseMove(screenWidth, screenHeight);
        }
    }
}