package HW1;

public class Race extends Obstacle {
    int length;

    public Race(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
