public class DigitalClock implements Clock {
    int minute = 0;
    int hour = 0;

    @Override
    public String getTime() {
        return convertToString(hour) + ":" + convertToString(minute) + '\n';
    }

    private String convertToString(int time) {
        if (time < 10) {
            return "0" + time;
        }
        return String.valueOf(time);
    }

    @Override
    public void minuteTick() {
        hour = (hour + ((minute + 1) / 60)) % 24;
        minute = (minute + 1) % 60;
        System.out.println("Added 1 minute");
    }

    @Override
    public void tenMinutesTick() {
        hour = (hour + ((minute + 10) / 60)) % 24;
        minute = (minute + 10) % 60;
        System.out.println("Added 10 minutes");
    }

    @Override
    public void hourTick() {
        hour = (hour + 1) % 24;
        System.out.println("Added 1 hour");
    }
}
