/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  //Constante
  


  //MOTEUR
  public static final int MOTOR_LEFT_ID = 6;
  public static final int MOTOR_RIGHT_ID = 9;
  public static final int MOTEUR_HATCH_PWM = 5; //5
      public static final double SPEED_HATCH_IN1 = 0.9;
      public static final double SPEED_HATCH_IN2 = 0.1;
      public static final double SPEED_HATCH_OUT = -0.9;
      public static final double SPEED_HATCH_DEFAULT = 0;
  public static final int MOTEUR_CARGO_PWM = 3;
      public static final double SPEED_CARGO_IN1 = -0.7;
      public static final double SPEED_CARGO_IN2 = -0.1;
      public static final double SPEED_CARGO_OUT = 1.0;
      public static final double SPEED_CARGO_DEFAULT = 0;
      public static final double SPEED_HATCHGROUND_PICK = 1.0;
      public static final double SPEED_HATCHGROUND_IN = 0.1;
      public static final double SPEED_HATCHGROUND_OUT = -1.0;


  public static final int MOTEUR_ELEVATEUR_PWM = 4; //2
      public static final double DEFAULTSETPOINT = 1.4;
      public static final double ROCKETLVLONESETPOINT = 2.5;
      public static final double CARGOSETPOINT = 3;
  //SERVO
  public static final int SERVO_CAMERA_PWM = 7;
      public static final int CAMERA_FRONT = 0;
      public static final int CAMERA_REAR = 180;
  //DIGITAL INPUT
  public static final int SWITCH_HATCH_DIO = 5;
  public static final int SWITCH_CARGO_DIO = 0;
  public static final int SWITCH_HATCHGROUND_DIO = 4;//A DETERMINER
  public static final int SWITCH_ELEVATEUR_DIO = 9;

  //ANALOG INPUT
  public static final int POT_ELEVATEUR_AI = 1;
        public static final double ELEVATEUR_DEFAULTVALUE = 1.0;
        public static final double ELEVATEUR_CARGOVALUE = 4.0;
  //DRIVER CONTROLLER
	public static final int DRIVER_CONTROLLER_PLAYERONE = 0;
	public static final int DRIVETRAIN_DRIVE_ENCODER_A_LEFT = 1;
    public static final int DRIVETRAIN_DRIVE_ENCODER_B_LEFT = 2;
    public static final int DRIVETRAIN_DRIVE_ENCODER_A_RIGHT = 3;
	public static final int DRIVETRAIN_DRIVE_ENCODER_B_RIGHT = 4;
	
	// Button mappings
	static public int DPad = 0;
	static public int A = 1;
	static public int B = 2;
	static public int X = 3;
	static public int Y = 4;
	static public int LB = 5;
	static public int RB = 6;
	static public int Back = 7;
	static public int Start = 8;
	static public int LAxis = 9;
	static public int RAxis = 10;

}
