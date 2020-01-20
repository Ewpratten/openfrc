package ca.retrylife.frc.openfrc.testrobot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
    public static void main(String... args) {

        // Start the robot wrapper
        RobotBase.startRobot(Robot::new);
    }
}
