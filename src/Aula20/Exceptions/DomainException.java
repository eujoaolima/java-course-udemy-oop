package Aula20.Exceptions;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
