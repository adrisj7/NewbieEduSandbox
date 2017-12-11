package org.usfirst.frc.team694.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	// (Copied here from previous exercises)
	CANTalon motorFrontLeft;
	CANTalon motorBackLeft;
	CANTalon motorFrontRight;
	CANTalon motorBackRight;

	public Drivetrain() {
		motorFrontLeft = new CANTalon(1);
		motorBackLeft = new CANTalon(2);
		motorFrontRight = new CANTalon(3);
		motorBackRight = new CANTalon(4);
    }

	// (Copied here from previous exercises, and made public)
	public void tankDrive(double left, double right) {
		motorFrontLeft.set(left);
		motorBackLeft.set(left);
		motorFrontRight.set(right);
		motorBackRight.set(right);
	}

    public void initDefaultCommand() {

    }
}

