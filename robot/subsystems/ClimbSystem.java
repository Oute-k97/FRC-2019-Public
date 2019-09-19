/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.ClimbSystemDefault;

/**
 * Add your docs here.
 */
public class ClimbSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  DoubleSolenoid piston_swag = new DoubleSolenoid(1,1, 6);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ClimbSystemDefault());
  }

  public void setSpeed (){
    piston_swag.set(DoubleSolenoid.Value.kForward);
   //piston_swag.set(DoubleSolenoid.Value.kReverse);
   // piston_swag.set(DoubleSolenoid.Value.kForward);
   // piston_swag.set(DoubleSolenoid.Value.kOff);

}
}
