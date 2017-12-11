package org.usfirst.frc.team694.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;

public class RobotSimpleMotor extends IterativeRobot {

	CANTalon motorFront;
	CANTalon motorBack;

	@Override
	public void robotInit() {
		// (Ports from Rafael)

		// Motors on left side of the robot
		motorFront = new CANTalon(1);
		motorBack = new CANTalon(2);
	}

	@Override
	public void teleopPeriodic() {
		motorFront.set(0.5);
		motorBack.set(0.5);
	}


}
