package edu.iis.mto.multithread;

import org.junit.Rule;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BetterRadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @RepeatRule.Repeat(times = 10)
    public void noticesAScudMissile_runLaunchPatriot5TimesInCurrentThread_repeatTest10Times() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar radar = new BetterRadar(batteryMock, new CurrentThreadExecutor(), 5);
        radar.notice(new Scud());
        verify(batteryMock, times(5)).launchPatriot();
    }
}