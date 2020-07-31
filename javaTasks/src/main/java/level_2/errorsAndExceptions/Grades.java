package level_2.errorsAndExceptions;


import level_2.errorsAndExceptions.universityExceptions.GradeOutOfBordersException;

public
class Grades {
    private Subjects subject;
    private int grade;

    public
    Grades(Subjects subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public
    Subjects getSubject() {
        return subject;
    }

    public
    int getGrade() throws GradeOutOfBordersException {
        if (grade < 0 | grade > 10) {
            throw new GradeOutOfBordersException(String.format("Grade %s for %s is less than 0 or more than 10", grade, subject));
        } else
            return grade;
    }

    @Override
    public
    String toString() {
        return "Grades{" +
                "subject=" + subject +
                ", grade=" + grade +
                "}\n                        ";
    }
}
