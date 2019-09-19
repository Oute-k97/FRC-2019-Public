/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;



import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class HatchGrabDefault extends Command {
  public HatchGrabDefault() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.hatchGrabber);
    
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //piston désactivée
    Robot.hatchGrabber.setSpeed(RobotMap.SPEED_HATCH_DEFAULT,RobotMap.CAMERA_FRONT,1);
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
