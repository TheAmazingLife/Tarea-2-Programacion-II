package tarea2;

public class PagoIncorrectoException extends RuntimeException {

    /* public PagoIncorrectoException(){}
    public PagoIncorrectoException(Throwable cause){
        super(cause);
    }
    public PagoIncorrectoException(String msg, Throwable cause){
        super(msg, cause);
    } */
    public PagoIncorrectoException(String msg){
        super(msg);
    }
}
