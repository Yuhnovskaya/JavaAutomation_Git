package javaClasses.mainTask4;

public
class Abiturient {
    private int id;
    private Name name;
    private String address;
    private int phone;
    private Grades grades;

    class Name {
        private String firstName;
        private String middleName;
        private String lastName;

        public
        Name(String firstName, String middleName, String lastName) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        public
        String getFirstName() {
            return firstName;
        }

        public
        void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public
        String getMiddleName() {
            return middleName;
        }

        public
        void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public
        String getLastName() {
            return lastName;
        }

        public
        void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public
        String toString() {
            return "Name{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    class Grades {
        int grade1;
        int grade2;
        int grade3;

        public
        Grades(int grade1, int grade2, int grade3) {
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
        }

        public
        int getGrade1() {
            return grade1;
        }

        public
        void setGrade1(int grade1) {
            this.grade1 = grade1;
        }

        public
        int getGrade2() {
            return grade2;
        }

        public
        void setGrade2(int grade2) {
            this.grade2 = grade2;
        }

        public
        int getGrade3() {
            return grade3;
        }

        public
        void setGrade3(int grade3) {
            this.grade3 = grade3;
        }

        @Override
        public
        String toString() {
            return "Grades{" +
                    "grade1=" + grade1 +
                    ", grade2=" + grade2 +
                    ", grade3=" + grade3 +
                    '}';
        }
    }


    public
    Abiturient(int id, String firstName, String middleName, String lastName, String address, int phone, int grade1, int grade2, int grade3) {
        this.id = id;
        name = new Name(firstName, middleName, lastName);
        this.address = address;
        this.phone = phone;
        grades = new Grades(grade1, grade2, grade3);
    }

    public
    Grades getGrades() {
        return grades;
    }

    public
    void setGrades(Grades grades) {
        this.grades = grades;
    }

    public
    int getId() {
        return id;
    }

    public
    void setId(int id) {
        this.id = id;
    }

    public
    Name getName() {
        return name;
    }

    public
    void setName(Name name) {
        this.name = name;
    }

    public
    String getAddress() {
        return address;
    }

    public
    void setAddress(String address) {
        this.address = address;
    }

    public
    int getPhone() {
        return phone;
    }

    public
    void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public
    String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", grades=" + grades +
                '}';
    }
}
