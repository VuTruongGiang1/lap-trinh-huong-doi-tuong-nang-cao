package concretecommand;

import command.Command;
import receiver.Fan;

public class FanTurnlightCommand implements Command {
    Fan fan;

    public FanTurnlightCommand(Fan fan) {
        this.fan = fan;
    }
    
    public void execute() {
        fan.turnlight();
    } 
}
