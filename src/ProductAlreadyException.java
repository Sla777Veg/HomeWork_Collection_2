public class ProductAlreadyException extends RuntimeException {

    public ProductAlreadyException() {
    }

    public ProductAlreadyException(String message) {
        super(message);
    }
}
