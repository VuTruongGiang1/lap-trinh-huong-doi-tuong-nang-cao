import concretecommand.FanOffCommand;
import concretecommand.FanOnCommand;
import concretecommand.FanRotateCommand;
import concretecommand.FanTurnlightCommand;
import invoker.RemoteControl;
import receiver.Fan;

public class TestDrive {
    public static void main(String[] args) throws Exception {
        RemoteControl remote = new RemoteControl();
        Fan fan = new Fan();
        FanOnCommand fanOn = new FanOnCommand(fan);
        FanOffCommand fanOff = new FanOffCommand(fan);
        FanRotateCommand fanRotate = new FanRotateCommand(fan);
        FanTurnlightCommand fanTurnlight = new FanTurnlightCommand(fan);
        remote.setCommand(fanOn);
        remote.buttonWasPressed();
        remote.setCommand(fanOff);
        remote.buttonWasPressed();
        remote.setCommand(fanRotate);
        remote.buttonWasPressed();
        remote.setCommand(fanTurnlight);
        remote.buttonWasPressed();
    }
}
