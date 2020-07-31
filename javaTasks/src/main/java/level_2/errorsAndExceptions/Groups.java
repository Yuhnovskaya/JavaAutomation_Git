
package level_2.errorsAndExceptions;


import level_2.errorsAndExceptions.universityExceptions.NoStudentInGroupException;

import java.util.List;

public
class Groups {
    private String groupNumber;
    private List<Students> studentsList;

    public
    Groups(String groupNumber, List<Students> studentsList) {
        this.groupNumber = groupNumber;
        this.studentsList = studentsList;
    }

    public
    String getGroupNumber() {
        return groupNumber;
    }

    public
    List<Students> getStudentsList() throws NoStudentInGroupException {
        if (studentsList.isEmpty()) {
            throw new NoStudentInGroupException(String.format("There are no students in group %s", groupNumber));
        } else
            return studentsList;
    }

    @Override
    public
    String toString() {
        return "Groups{" +
                "groupNumber='" + groupNumber + '\'' +
                ", \n                   studentsList=" + studentsList +
                "}\n        ";
    }
}