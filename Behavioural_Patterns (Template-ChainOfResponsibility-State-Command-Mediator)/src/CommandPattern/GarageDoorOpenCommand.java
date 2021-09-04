package CommandPattern;

import TemplateMethod.PastaDish;

public class GarageDoorOpenCommand implements Command {
    Garage garage;

    public GarageDoorOpenCommand(Garage garage){
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.up();
    }
}
