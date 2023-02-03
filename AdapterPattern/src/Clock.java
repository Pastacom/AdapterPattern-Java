public interface Clock {
    String getTime();
    void minuteTick();
    void tenMinutesTick();
    void hourTick();
}
