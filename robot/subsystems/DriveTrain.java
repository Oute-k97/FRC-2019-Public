/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  
  
  private PWMTalonSRX motorLeft1 = new PWMTalonSRX(RobotMap.MOTOR_LEFT_ID);
  private PWMTalonSRX motorRight1 = new PWMTalonSRX(RobotMap.MOTOR_RIGHT_ID);
  Encoder encleft = new Encoder(1, 2, false, Encoder.EncodingType.k4X); //fonctionne
  Encoder encright = new Encoder(3, 4, false, Encoder.EncodingType.k4X); //fonctionne pas
  DoubleSolenoid piston_ballshifter = new DoubleSolenoid(0,0, 1);
  
  DifferentialDrive differentialDrive = new DifferentialDrive(motorLeft1, motorRight1);

  public boolean last;


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }
  
  public void arcadeDrive(double moveSpeed, double rotateSpeed) {
		differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

public void setlowgear(){

  piston_ballshifter.set(Value.kForward);

}

public void sethighgear(){

  piston_ballshifter.set(Value.kReverse);

}

public void switchgear(){

  if(Robot.m_oi.ballshifter.get() && last == false){

    sethighgear();
    last = true;

  }
  if(Robot.m_oi.ballshifter.get() && last == true){

    setlowgear();
    last = false;
  }

  

}

 
 

  public double getDriveEncoderCount() {
		return encleft.get();
	}

	public void resetDriveEncoderCount() {
		encleft.reset();
	}

	public double getDriveEncoderDistance() {
		double driveEncoderCountsPerFoot = 1;
		return (getDriveEncoderCount() / (driveEncoderCountsPerFoot)) * 12;
	}


}
