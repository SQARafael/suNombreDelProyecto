package kraken.web.exceptions;

public class ResultNotWaited extends AssertionError{
    public static final String MENSAJE_VALIDAR_TAG = "Se visualiza el mensaje de validacion del numero de tag, con el tag ingresado";


    public ResultNotWaited(String message, Throwable cause) {
        super(message,cause);
    }

}
