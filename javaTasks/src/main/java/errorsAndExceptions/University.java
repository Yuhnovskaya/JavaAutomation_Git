package errorsAndExceptions;

import errorsAndExceptions.universityExceptions.*;

import java.util.List;

public
class University {
    private String universityName;
    private List<Faculties> facultiesList;

    public
    University(String universityName, List<Faculties> facultiesList) {
        this.universityName = universityName;
        this.facultiesList = facultiesList;
    }

    public
    String getUniversityName() {
        return universityName;
    }

    public
    List<Faculties> getFacultiesList() throws NoFacultiesInUniversityExeption {
        if (facultiesList.isEmpty()) {
            throw new NoFacultiesInUniversityExeption(String.format("There are no faculties in %s", universityName));
        } else
            return facultiesList;
    }

    public
    double getAverageStudentsGrade(int studentID) throws NoSubjectException, NoStudentInGroupException, NoGroupsInFacultyExeption, NoFacultiesInUniversityExeption, GradeOutOfBordersException {
        double gradesSum = 0;
        int gradesNumber = 0;
        for (Faculties faculties : this.getFacultiesList()) {
            for (Groups groups : faculties.getGroupsList()) {
                for (Students students : groups.getStudentsList()) {
                    if (students.getId() == studentID) {
                        for (Grades grades : students.getGradesList()) {
                            gradesSum += grades.getGrade();
                            gradesNumber += 1;
                        }
                    }
                }
            }
        }
        return Math.round(gradesSum / gradesNumber * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public
    double getAverageGroupSubjectGrade(String facultiesName, String groupNumber, Subjects subject) throws NoSubjectException, NoStudentInGroupException, NoGroupsInFacultyExeption, NoFacultiesInUniversityExeption, GradeOutOfBordersException {
        double gradesSum = 0;
        int gradesNumber = 0;
        for (Faculties faculties : this.getFacultiesList())
            if (faculties.getFacultyName() == facultiesName) {
                for (Groups groups : faculties.getGroupsList()) {
                    if (groups.getGroupNumber() == groupNumber) {
                        for (Students students : groups.getStudentsList()) {
                            for (Grades grades : students.getGradesList()) {
                                if (grades.getSubject() == subject) {
                                    gradesSum += grades.getGrade();
                                    gradesNumber += 1;
                                }
                            }
                        }
                    }
                }
            }
        return Math.round(gradesSum / gradesNumber * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public
    double getAverageUniversitySubjectGrade(Subjects subject) throws NoSubjectException, NoStudentInGroupException, NoGroupsInFacultyExeption, NoFacultiesInUniversityExeption, GradeOutOfBordersException {
        double gradesSum = 0;
        int gradesNumber = 0;
        for (Faculties faculties : this.getFacultiesList()) {
            for (Groups groups : faculties.getGroupsList()) {
                for (Students student : groups.getStudentsList()) {
                    for (Grades grades : student.getGradesList()) {
                        if (grades.getSubject() == subject) {
                            gradesSum += grades.getGrade();
                            gradesNumber += 1;
                        }
                    }
                }
            }
        }
        return Math.round(gradesSum / gradesNumber * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    @Override
    public
    String toString() {
        return "University{" +
                "UniversityName='" + universityName + '\'' +
                ",\nfacultiesList=" + facultiesList +
                "}\n";
    }
}
