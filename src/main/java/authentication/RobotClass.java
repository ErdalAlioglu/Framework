package authentication;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);

    }
}
