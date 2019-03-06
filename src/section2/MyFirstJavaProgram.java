package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.moveTo(500, 500);
		bob.penDown();
		bob.setPenColor(Color.BLUE);
		bob.setSpeed(7);
		for(int i=0;i<4;i++) {
		bob.move(100);
		bob.turn(90);
		}
		// START HERE
	
		
		
	}
}
