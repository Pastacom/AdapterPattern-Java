public class ClockWithArrows implements ClockAdapter {

    private final Clock clock;

    public ClockWithArrows(Clock clock) {
        this.clock = clock;
    }

    @Override
    public String getTime() {
        return buildTime(clock.getTime());
    }

    private String buildTime(String input) {
        int[] result = extractData(input);
        int hour = result[0], minute = result[1];
        int m = minute == 60 || minute < 5 ? 12 : minute / 5;
        int mRemainder = minute % 5;
        int h = hour == 12 || hour == 0 ? 12 : hour % 12;
        int hRemainder = minute / 12;
        return String.format("Hour arrow at %d'%d. Minute arrow at %d'%d\n",
                             h, hRemainder, m, mRemainder);
    }

    private int[] extractData(String str) {
        String[] data = str.trim().split(":");
        return new int[]{Integer.parseInt(data[0]), Integer.parseInt(data[1])};
    }

    @Override
    public void minuteTick() {
        clock.minuteTick();
    }

    @Override
    public void tenMinutesTick() {
        clock.tenMinutesTick();
    }

    @Override
    public void hourTick() {
        clock.hourTick();
    }
}
