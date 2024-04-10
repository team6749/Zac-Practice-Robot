// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilderImpl;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
    public WPI_TalonSRX frontRight = new WPI_TalonSRX(0);
    public WPI_TalonSRX backRight = new WPI_TalonSRX(1);
    public WPI_TalonSRX frontLeft = new WPI_TalonSRX(2);
    public WPI_TalonSRX backLeft = new WPI_TalonSRX(3);
    double xSpeed;
    double rotationSpeed;
    

    
    DifferentialDrive myDrive = new DifferentialDrive(frontLeft, frontRight);
    
    /** Creates a new DriveBaseSubsystem. */
    public DriveBaseSubsystem() {
        backLeft.follow(frontLeft);
        backRight.follow(frontRight);
        
    }
    
    
    @Override
    public void periodic() {
        myDrive.arcadeDrive(xSpeed, rotationSpeed);
        // This method will be called once per scheduler run
    }
    
    public double getForwardSpeed() {
        return xSpeed;
    }
    
    public void setSpeed(double speed) {
        this.xSpeed = speed;
    }
    public double getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(double rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }
    
  
}
