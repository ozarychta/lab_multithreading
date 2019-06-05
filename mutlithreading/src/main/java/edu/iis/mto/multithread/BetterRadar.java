package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar extends Radar{

    private Executor executor;
    private LaunchRunnable launchRunnable;
    private Integer rocketsToLaunchNumber;

    public BetterRadar(PatriotBattery battery, Executor executor, Integer rocketsToLaunchNumber) {
        super(battery);
        this.executor = executor;
        this.launchRunnable = new LaunchRunnable(rocketsToLaunchNumber, battery);
        this.rocketsToLaunchNumber = rocketsToLaunchNumber;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        executor.execute(launchRunnable);
    }
}