package guru.qa;

public class Student {

    private String name;
    private int age;
    private int skill;

    public Student(String name, int age, int skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    void assign() {
        if (age >= 16) {
            if (name.equals("Гарри Поттер")) {
                System.out.println("Вы попадаете в \"Гриффиндор\"");
            } else if (name.equals("Драко Малфой")) {
                System.out.println("Вы попадаете в \"Слизерин\"");
            } else if (name.equals("Седрик Диггори")) {
                System.out.println("Вы попадаете в \"Пуффендуй\"");
            } else if (name.equals("Пенелопа Кристал")) {
                System.out.println("Вы попадаете в \"Когтевран\"");
            } else {
                System.out.println("Увы, из вас не получится волшебника");
            }
        } else {
            System.out.println("Увы, вам еще рано учиться в \"Хогвартсе\"");
        }
    }

    void fight(Student opponent) {
        if (this.skill > opponent.skill) {
            System.out.println("Победил " + this.name);
        } else if (this.skill < opponent.skill) {
            System.out.println("Победил " + opponent.name);
        } else {
            System.out.println("Ничья");
        }
    }
}
