package level_2.errorsAndExceptions.universityExceptions;

public
class NoGroupsInFacultyExeption extends Exception {
    public
    NoGroupsInFacultyExeption() {
    }

    public
    NoGroupsInFacultyExeption(String message) {
        super(message);
    }

    public
    NoGroupsInFacultyExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public
    NoGroupsInFacultyExeption(Throwable cause) {
        super(cause);
    }
}
