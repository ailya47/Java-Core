package HW1;

public class Human implements Competitor {
    String name;

    int maxDistance;

    boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxDistance = 3000;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxDistance) {
            System.out.println(name + " успешно пробежал дистанцию");
        } else {
            System.out.println(name + " проиграл соревнование");
            active = false;
        }
    }


    @Override
    public void status() {
        System.out.println(name + ": " + active);
    }
}