class CustomException extends RuntimeException {
    CustomException(String message) {
        super(message);
    }
}

public class MainCustomException {
    public static void main(String[] args) {
        throw new CustomException("This is a Custom Exception");
    }
}
