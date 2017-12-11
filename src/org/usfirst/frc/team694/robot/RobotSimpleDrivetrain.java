package org.usfirst.frc.team694.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;

public class RobotSimpleDrivetrain extends IterativeRobot {

	CANTalon motorFrontLeft;
	CANTalon motorBackLeft;
	CANTalon motorFrontRight;
	CANTalon motorBackRight;
	

	@Override
	public void robotInit() {
		// (Ports from Rafael)
		motorFrontLeft = new CANTalon(1);
		motorBackLeft = new CANTalon(2);
		motorFrontRight = new CANTalon(3);
		motorBackRight = new CANTalon(4);
	}

	@Override
	public void teleopPeriodic() {
		// Question: How do we make the robot rotate at say, 50% speed?
		// Solution:
		motorFrontLeft.set(-0.5);
		motorBackLeft.set(-0.5);
		motorFrontRight.set(0.5);
		motorBackRight.set(0.5);

		// NOTE how this is annoying and hard to read quickly. 
		// So, we'll create a method that does it for us!

		// After writing tankDrive,
		// comment out all of our previous code and replace it with this:
		tankDrive(-0.5, 0.5);

		// See how much nicer that looks?
	}

	// Question: What should the arguments be?
	// Question: Can anyone write out the method for us?
	private void tankDrive(double left, double right) {
		motorFrontLeft.set(left);
		motorBackLeft.set(left);
		motorFrontRight.set(right);
		motorBackRight.set(right);
	}

}
