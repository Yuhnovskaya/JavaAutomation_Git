package level_1.classes.mainTask4;

public
class CheckingGrades {
    public
    void findBadAbiturients(Abiturient[] abiturient) {
        for (int i = 0; i < abiturient.length; i++) {
            if (abiturient[i].getGrades().getGrade1() < 3 |
                    abiturient[i].getGrades().getGrade2() < 3 |
                    abiturient[i].getGrades().getGrade3() < 3) {
                System.out.println(abiturient[i]);
            }
        }
    }

    public
    void findAbiturientWithPassingScore(Abiturient[] abiturients, int passingScore) {
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getGrades().getGrade1() +
                    abiturients[i].getGrades().getGrade2() +
                    abiturients[i].getGrades().getGrade3() >= passingScore) {
                System.out.println(abiturients[i]);
            }
        }
    }

    public
    void findBestAbiturients(Abiturient[] abiturients, int abiturientsNumber) {
        Abiturient max = abiturients[0];
        for (int i = 0; i < abiturients.length; i++) {
            for (int j = i + 1; j < abiturients.length; j++) {
                int sumI = abiturients[i].getGrades().getGrade1() +
                        abiturients[i].getGrades().getGrade2() +
                        abiturients[i].getGrades().getGrade3();
                int sumJ = abiturients[j].getGrades().getGrade1() +
                        abiturients[j].getGrades().getGrade2() +
                        abiturients[j].getGrades().getGrade3();
                if (sumJ > sumI) {
                    Abiturient temp = abiturients[i];
                    abiturients[i] = abiturients[j];
                    abiturients[j] = temp;
                }
            }
        }
        for (int i = 0; i < abiturientsNumber; i++) {
            System.out.println(abiturients[i]);
        }
    }
}

