package level_2.errorsAndExceptions;


import level_2.errorsAndExceptions.universityExceptions.*;

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
                for (Student students : groups.getStudentsList()) {
                    if (students.getId() == studentID) {
                        for (Grades grades : students.getGradesList()) {
                            gradesSum += grades.getGrade();
                            gradesNumber += 1;
                        }
                    }
                }
            }
        }
        return Math.round(gradesSum / gradesNumber * 100) / 100;
    }

    public
    double getAverageGroupSubjectGrade(String facultiesName, String groupNumber, Subjects subject) throws NoSubjectException, NoStudentInGroupException, NoGroupsInFacultyExeption, NoFacultiesInUniversityExeption, GradeOutOfBordersException {
        double gradesSum = 0;
        int gradesNumber = 0;
        double averageGrade;
        for (Faculties faculties : this.getFacultiesList())
            if (faculties.getFacultyName() == facultiesName) {
                for (Groups groups : faculties.getGroupsList()) {
                    if (groups.getGroupNumber() == groupNumber) {
                        for (Student students : groups.getStudentsList()) {
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
        if (gradesNumber == 0) {
            System.out.println(String.format("Students of the group %s don't study %s", groupNumber, subject));
        }
        return Math.round(gradesSum / gradesNumber * 100) / 100;
    }

    public
    double getAverageUniversitySubjectGrade(Subjects subject) throws NoSubjectException, NoStudentInGroupException, NoGroupsInFacultyExeption, NoFacultiesInUniversityExeption, GradeOutOfBordersException {
        double gradesSum = 0;
        int gradesNumber = 0;
        for (Faculties faculties : this.getFacultiesList()) {
            for (Groups groups : faculties.getGroupsList()) {
                for (Student student : groups.getStudentsList()) {
                    for (Grades grades : student.getGradesList()) {
                        if (grades.getSubject() == subject) {
                            gradesSum += grades.getGrade();
                            gradesNumber += 1;
                        }
                    }
                }
            }
        }
        return Math.round(gradesSum / gradesNumber * 100) / 100;
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
