/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class HatchGroundIn extends Command {
  public HatchGroundIn() {
    // Use requires() here to declare subsystem dependencies
    
    requires(Robot.cargoIntake);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_oi.playerone.setRumble(RumbleType.kLeftRumble, 1);
    Robot.cargoIntake.setSpeed(RobotMap.SPEED_HATCHGROUND_IN,0);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.m_oi.hatchground.get();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_oi.playerone.setRumble(RumbleType.kLeftRumble, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
