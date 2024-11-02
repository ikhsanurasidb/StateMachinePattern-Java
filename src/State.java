public interface State<T> {
    public State<T> input(T action);
    public String getMessage();
}