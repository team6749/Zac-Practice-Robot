// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveBaseSubsystem;

public class DriveBaseCommand extends Command {
DriveBaseSubsystem _Subsystem;
XboxController _Controller;
  /** Creates a new DriveBaseCommand. */
  public DriveBaseCommand(DriveBaseSubsystem subsystem, XboxController controller) {
    _Subsystem = subsystem;
    addRequirements(subsystem);
    _Controller = controller;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    _Subsystem.setSpeed(_Controller.getLeftY());
  }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
