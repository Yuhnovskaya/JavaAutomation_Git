package errorsAndExceptions.universityExceptions;

public
class GradeOutOfBordersException extends Exception{
    public
    GradeOutOfBordersException() {
    }

    public
    GradeOutOfBordersException(String message) {
        super(message);
    }

    public
    GradeOutOfBordersException(String message, Throwable cause) {
        super(message, cause);
    }

    public
    GradeOutOfBordersException(Throwable cause) {
        super(cause);
    }
}
