public class HoldBallState implements State<Action> {
    @Override
    public State<Action> input(Action action) {
        return switch (action) {
            case LOW_POWER_KICK -> new PassState();
            case HIGH_POWER_KICK -> new ShootState();
            case DRIBBLE -> new RunState();
            default -> new InvalidState();
        };
    }

    @Override
    public String getMessage() {
        return "The player now holds the ball";
    }
}