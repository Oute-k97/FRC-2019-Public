/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Elevator extends PIDSubsystem {
  /**
   * Add your docs here.
   */
  PWMTalonSRX elevateur_motor = new PWMTalonSRX(RobotMap.MOTEUR_ELEVATEUR_PWM);
 // DigitalInput limitswitch3 = new DigitalInput(RobotMap.SWITCH_ELEVATEUR_DIO);
  AnalogInput Pot1 = new AnalogInput(RobotMap.POT_ELEVATEUR_AI);

  public Elevator() {
    // Intert a subsystem name and PID values here
    super("Elevator", 0.8, 0, 0);
    setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
    // Use these to get going:
    // setSetpoint() - Sets where the PID controller should move the system
    // to
    enable();// - Enables the PID controller.
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new ElevateurDefault());
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return Pot1.getAverageVoltage();
  }

  @Override
  protected void usePIDOutput(double output) {
    // Use output to drive your system, like a motor
    // e.g. yourMotor.set(output);
    
    if ( getSetpoint() == 1.4){
  
      elevateur_motor.pidWrite(-output*0.1);
  
      
  }
  else{
  
    elevateur_motor.pidWrite(-output);

    
}

  
  }

  public void setElevator (double setpoint){
  
    setSetpoint(setpoint);

    
}

public void changeElevatorsetpoint (){

if (Robot.m_oi.elevatorup.get()){

setElevator(RobotMap.CARGOSETPOINT);

}
if(Robot.m_oi.elevatordown.get()){

  setElevator(RobotMap.ROCKETLVLONESETPOINT);
}


}

}
