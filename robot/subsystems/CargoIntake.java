/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.CargoGrabDefault;

/**
 * Add your docs here.
 */
public class CargoIntake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private PWMTalonSRX cargo_motor = new PWMTalonSRX(RobotMap.MOTEUR_CARGO_PWM);
  DigitalInput limitswitch2 = new DigitalInput(RobotMap.SWITCH_CARGO_DIO);
  DigitalInput limitswitch3 = new DigitalInput(RobotMap.SWITCH_HATCHGROUND_DIO);
 Solenoid piston_cargo_1 = new Solenoid(0,2);
 Solenoid piston_cargo_2 = new Solenoid(0,3);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new CargoGrabDefault());
  }

  public void setSpeed (double speed,int piston){
  
    cargo_motor.set(speed);
    if(piston == 0){
    piston_cargo_1.set(false);
    piston_cargo_2.set(false);
  }
    if(piston == 1){
      piston_cargo_1.set(false);
      piston_cargo_2.set(true);
    }
    if(piston == 2){
      piston_cargo_1.set(true);
      piston_cargo_2.set(true);
    }



}
public boolean limitswitch2value(){
  return limitswitch2.get();
}

public boolean limitswitch3value(){

  return limitswitch3.get();
}

}
