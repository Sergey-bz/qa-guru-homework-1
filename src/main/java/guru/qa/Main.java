package guru.qa;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student("Гарри Поттер", 18, 100);
        Student secondStudent = new Student("Драко Малфой", 18, 90);
        Student thirdStudent = new Student("Седрик Диггори", 20, 85);
        Student fourthStudent = new Student("Пенелопа Кристал", 17, 80);

        firstStudent.assign();
        secondStudent.assign();
        thirdStudent.assign();
        fourthStudent.assign();

        firstStudent.fight(secondStudent);
        secondStudent.fight(thirdStudent);
        thirdStudent.fight(fourthStudent);
    }
}
