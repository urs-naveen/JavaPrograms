import java.awt.*;
import java.util.Random;

public class MouseMovement {
    public static void main(String[] args) throws AWTException {
        Robot bot = new Robot();
        Random random = new Random();

        while (true) {
            bot.delay(60000);
            bot.mouseMove(random.nextInt() % 640, random.nextInt() % 480);
        }
    }
}
