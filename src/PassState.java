public class PassState implements State<Action>, FinalState{
    @Override
    public State<Action> input(Action action) {
        return null;
    }

    @Override
    public String getMessage() {
        return "The player now passes the ball";
    }
}