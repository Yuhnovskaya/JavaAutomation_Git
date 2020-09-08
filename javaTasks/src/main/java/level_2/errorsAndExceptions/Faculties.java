
package level_2.errorsAndExceptions;


import level_2.errorsAndExceptions.universityExceptions.NoGroupsInFacultyExeption;
import level_2.errorsAndExceptions.universityExceptions.NoStudentInGroupException;

import java.util.List;


public
class Faculties {
    private String facultyName;
    private List<Groups> groupsList;

    public
    Faculties(String facultyName, List<Groups> groupsList) {
        this.facultyName = facultyName;
        this.groupsList = groupsList;
    }

    public
    String getFacultyName() {
        return facultyName;
    }

    public
    List<Groups> getGroupsList() throws NoGroupsInFacultyExeption {
        if (groupsList.isEmpty()) {
            throw new NoGroupsInFacultyExeption(String.format("There are no groups in the faculty %s", facultyName));
        } else
            return groupsList;
    }

    @Override
    public
    String toString() {
        return "Faculties{" +
                "facultyName='" + facultyName + '\'' +
                ", \n       groupsList=" + groupsList +
                "}\n";
    }
}
