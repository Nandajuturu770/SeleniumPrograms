/* Automotive typing the keys*/
package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClass {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// to open the note pad
		Runtime.getRuntime().exec("notepad");
		// to wait
		Thread.sleep(2000);
		// to create an object for robot class
		Robot r = new Robot();
		// to press the keys  
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
	}
}
