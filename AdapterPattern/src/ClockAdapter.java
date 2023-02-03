public interface ClockAdapter {
    String getTime();
    void minuteTick();
    void tenMinutesTick();
    void hourTick();
}
