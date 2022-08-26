package concretecommand;

import command.Command;
import receiver.Fan;

public class FanRotateCommand implements Command {
    Fan fan;

    public FanRotateCommand(Fan fan) {
        this.fan = fan;
    }
    
    public void execute() {
        fan.rotate();
    } 
}
