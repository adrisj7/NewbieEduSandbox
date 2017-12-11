package org.usfirst.frc.team694.robot;

import org.usfirst.frc.team694.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class RobotSubsystemDrivetrain extends IterativeRobot {

	// Now, we can hold all of our motors together in the Drivetrain subsystem
	Drivetrain drivetrain;
	
	Joystick gamepad;

	@Override
	public void robotInit() {
		// You don't have to memorize ports numbers now!
		drivetrain = new Drivetrain();

		gamepad = new Joystick(1);
	}

	@Override
	public void teleopPeriodic() {
		// (Port values copied from Gamepad.java)

		double leftVal = gamepad.getRawAxis(1);
		double rightVal = gamepad.getRawAxis(3);

		// We can call tankDrive from our Drivetrain subsystem!
		drivetrain.tankDrive(leftVal, rightVal);
	}


}
