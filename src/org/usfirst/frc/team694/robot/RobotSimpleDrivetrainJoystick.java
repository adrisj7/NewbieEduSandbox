package org.usfirst.frc.team694.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class RobotSimpleDrivetrainJoystick extends IterativeRobot {

	// (These should remain from previous exercise)
	CANTalon motorFrontLeft;
	CANTalon motorBackLeft;
	CANTalon motorFrontRight;
	CANTalon motorBackRight;

	// NEW: Joystick class!
	// Allows us to grab button and axis (actual joystick) inputs 
	//   from a real world joystick or gamepad!
	Joystick gamepad;

	@Override
	public void robotInit() {
		// (Ports from Rafael)
		motorFrontLeft = new CANTalon(1);
		motorBackLeft = new CANTalon(2);
		motorFrontRight = new CANTalon(3);
		motorBackRight = new CANTalon(4);

		// Joysticks have ports too!
		// (Operator port)
		gamepad = new Joystick(1);
	}

	@Override
	public void teleopPeriodic() {
		// (Port values copied from Gamepad.java)

		// We'll hold the y (vertical axis) values of our joysticks in these variables:
		double leftVal = gamepad.getRawAxis(1);
		double rightVal = gamepad.getRawAxis(3);

		// To demonstrate that they work, print out these values and test the code
		System.out.println(leftVal + ", " + rightVal);

		// Now, we can run tankDrive:
		tankDrive(leftVal, rightVal);
		
		// Huzzah! We have user control!
	}

	// (This should be here from the previous exercise)
	private void tankDrive(double left, double right) {
		motorFrontLeft.set(left);
		motorBackLeft.set(left);
		motorFrontRight.set(right);
		motorBackRight.set(right);
	}

}
