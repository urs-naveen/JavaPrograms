import java.awt.*;

public class MouseMovement {

    public static void main(String[] args) throws AWTException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Robot bot = new Robot();

        while (true) {
            int screenWidth = (int) screenSize.getWidth();
            int screenHeight = (int) screenSize.getHeight();

            bot.delay(60000);
            bot.mouseMove(screenWidth, screenHeight);
        }
    }
}