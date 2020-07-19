package Exception;

public class FoodException extends Exception {
    private String message;

    public FoodException(String message) {
        super(message);
    }
}
