package level_2.errorsAndExceptions;


import level_2.errorsAndExceptions.universityExceptions.*;

import java.util.Arrays;

public
class Runner {
    public static
    void main(String[] args) {
        Students student1 = new Students(101, Arrays.asList(
                new Grades(Subjects.ADVERTISING, 8),
                new Grades(Subjects.BUSINESS, 3),
                new Grades(Subjects.PSYCOLOGY, 5))
        );
        Students student2 = new Students(102, Arrays.asList(
                new Grades(Subjects.ADVERTISING, 7),
                new Grades(Subjects.BUSINESS, 5),
                new Grades(Subjects.PSYCOLOGY, 15))
        );
        Students student3 = new Students(103, Arrays.asList(
                new Grades(Subjects.COMMUNICATION, 8),
                new Grades(Subjects.ADVERTISING, 6),
                new Grades(Subjects.COMPUTER_SCIENCE, 4))
        );
        Students student4 = new Students(104, Arrays.asList(
                new Grades(Subjects.COMMUNICATION, 7),
                new Grades(Subjects.ADVERTISING, 7),
                new Grades(Subjects.PSYCOLOGY, 9))
        );
        Groups group1 = new Groups("gr-1", Arrays.asList(student1, student2));
        Groups group2 = new Groups("gr-2", Arrays.asList(student3));
        Groups group3 = new Groups("gr-3", Arrays.asList(student4));
        Faculties faculty1 = new Faculties("F1", Arrays.asList(group1, group2));
        Faculties faculty2 = new Faculties("F2", Arrays.asList(group3));
        University university = new University("UNIVER", Arrays.asList(faculty1, faculty2));
        System.out.println(university);

        try {
            System.out.println("Average grade of the student with id=102:\n" +
                    university.getAverageStudentsGrade(102));
            System.out.println("Avarage grade in PSYCOLOGY of the group 'gr-1' of the faculty 'F1':\n" + university.getAverageGroupSubjectGrade("F1", "gr-1", Subjects.PSYCOLOGY));
            System.out.println("Avarage University grade in PSYCOLOGY:\n" + university.getAverageUniversitySubjectGrade(Subjects.PSYCOLOGY));
        } catch (GradeOutOfBordersException e) {
            System.out.println(e);
        } catch (NoSubjectException e) {
            System.out.println(e);
        } catch (NoStudentInGroupException e) {
            System.out.println(e);
        } catch (NoGroupsInFacultyExeption e) {
            System.out.println(e);
        } catch (NoFacultiesInUniversityExeption e) {
            System.out.println(e);
        }
    }
}


