
package level_2.errorsAndExceptions;


import level_2.errorsAndExceptions.universityExceptions.NoSubjectException;

import java.util.List;

public
class Students {
    private int studentID;
    private List<Grades> gradesList;

    public
    Students(int studentID, List<Grades> gradesList) {
        this.studentID = studentID;
        this.gradesList = gradesList;
    }

    public
    int getId() {
        return studentID;
    }

    public
    List<Grades> getGradesList() throws NoSubjectException {
        if (gradesList.isEmpty()){
            throw new NoSubjectException(String.format("The student id=%s doesn't have any subject",studentID));
        }
        return gradesList;
    }

    public
    void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    @Override
    public
    String toString() {
        return "Students{" +
                "studentID=" + studentID +
                ",\n                        gradesList=" + gradesList +
                "}\n                ";
    }
}

