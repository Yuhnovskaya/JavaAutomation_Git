package errorsAndExceptions.universityExceptions;

public
class NoSubjectException extends Exception{
    public
    NoSubjectException() {
    }

    public
    NoSubjectException(String message) {
        super(message);
    }

    public
    NoSubjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public
    NoSubjectException(Throwable cause) {
        super(cause);
    }
}
