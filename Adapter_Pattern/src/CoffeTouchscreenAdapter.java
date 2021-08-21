public class CoffeTouchscreenAdapter implements CoffeMachineInterface{
    OldCoffeMachine oldCoffeMachine;

    public CoffeTouchscreenAdapter(){
        oldCoffeMachine= new OldCoffeMachine();
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeMachine.selectB();
    }
}
