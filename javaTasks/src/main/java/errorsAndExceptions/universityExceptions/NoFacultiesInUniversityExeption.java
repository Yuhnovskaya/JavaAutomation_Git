package errorsAndExceptions.universityExceptions;

public
class NoFacultiesInUniversityExeption extends Exception{
    public
    NoFacultiesInUniversityExeption() {
    }

    public
    NoFacultiesInUniversityExeption(String message) {
        super(message);
    }

    public
    NoFacultiesInUniversityExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public
    NoFacultiesInUniversityExeption(Throwable cause) {
        super(cause);
    }
}
