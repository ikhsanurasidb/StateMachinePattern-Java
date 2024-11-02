public class InvalidState implements State<Action> {
    @Override
    public String getMessage() {
        return "You can't do this action in current state!";
    }

    @Override
    public State<Action> input(Action action) {
        return null;
    }
}