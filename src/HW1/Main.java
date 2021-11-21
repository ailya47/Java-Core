package HW1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Race(2000));
        Team team = new Team(new Human("Папа"), new Human("Мама"), new Human("Брат"), new Human("Сестра"));
        c.go(team);
        team.showResults();
    }
}
