package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar implements Runnable {
    private PatriotBattery battery;
    private Executor executor;
    private Integer amount;

    public BetterRadar(PatriotBattery battery, Executor executor, Integer amount) {
        this.battery = battery;
        this.executor = executor;
        this.amount = amount;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        executor.execute(this);
    }


    @Override
    public void run() {
        for (int i = 0; i < amount; i++) {
            battery.launchPatriot();
        }
    }
}
