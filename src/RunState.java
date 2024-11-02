public class RunState implements State<Action> {
    @Override
    public State<Action> input(Action action) {
        return switch (action) {
            case LOW_POWER_KICK -> new PassState();
            case HIGH_POWER_KICK -> new ShootState();
            case TRICK -> new SkillState();
            case STOP -> new HoldBallState();
            case DRIBBLE -> new RunState();
//            default -> new InvalidAction(); //all action is possible to do
        };
    }

    @Override
    public String getMessage(){
        return "The player now runs with the ball";
    }
}