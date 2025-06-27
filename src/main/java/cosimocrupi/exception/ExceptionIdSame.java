package cosimocrupi.exception;

public class ExceptionIdSame extends RuntimeException {
    @Override
    public String getMessage() {
        return "Errore! ID inserito è già presente!";
    }
}
