import java.util.Random;

public class Main {

    static Random rng = new Random();
    private static void outputTime(Clock myClock, ClockAdapter clockAdapter) {
        System.out.print(myClock.getTime());
        System.out.print(clockAdapter.getTime());
        System.out.println("--------------------------------------------------------------");
    }

    private static void makeOperation(Clock myClock) {
        int operation = rng.nextInt(3) + 1;
        switch (operation) {
            case 1 -> myClock.minuteTick();
            case 2 -> myClock.tenMinutesTick();
            case 3 -> myClock.hourTick();
        }
    }

    public static void main(String[] args) {
        Clock myClock = new DigitalClock();
        ClockAdapter clockAdapter = new ClockWithArrows(myClock);

        for (int i = 0; i < 50; ++i) {
            makeOperation(myClock);
            outputTime(myClock, clockAdapter);
        }
    }
}