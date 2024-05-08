package magicNumber.after;

public class RobotMain {
	public static void main(String[] args) {
		Robot robot = new Robot("cute");
		
		robot.order(robot.COMMAND_WALK);
		robot.order(robot.COMMAND_STOP);
		robot.order(robot.COMMAND_JUMP);
		
		robot.order(100);
	}
}
