/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.HatchGrabDefault;


/**
 * Add your docs here.
 */
public class HatchGrabber extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private PWMTalonSRX hatch_motor = new PWMTalonSRX(RobotMap.MOTEUR_HATCH_PWM);
  private Servo cameraservo = new Servo(RobotMap.SERVO_CAMERA_PWM);
  DigitalInput limitswitch1 = new DigitalInput(RobotMap.SWITCH_HATCH_DIO);
 DoubleSolenoid piston_hatch_grabber = new DoubleSolenoid(1,0, 7);
  
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new HatchGrabDefault());
  }

  public void setSpeed (double speed, int degree, int piston){
  
    hatch_motor.set(speed);
    cameraservo.setAngle(degree);
    
    if(piston == 2)
    piston_hatch_grabber.set(DoubleSolenoid.Value.kOff);
    if(piston == 1)
    piston_hatch_grabber.set(DoubleSolenoid.Value.kForward);
    if(piston == 0)
    piston_hatch_grabber.set(DoubleSolenoid.Value.kReverse);

}

public boolean limitswitch1value(){
  return limitswitch1.get();
}

}
