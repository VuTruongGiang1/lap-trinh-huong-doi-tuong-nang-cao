package concretecommand;

import command.Command;
import receiver.Fan;

public class FanOffCommand implements Command {
    
    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.off();
    }
}
