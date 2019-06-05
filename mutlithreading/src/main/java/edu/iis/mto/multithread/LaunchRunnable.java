package edu.iis.mto.multithread;

public class LaunchRunnable implements Runnable {

    private int rocketsTolaunchNumber;
    private PatriotBattery battery;

    public LaunchRunnable(int rocketsToLaunchNumber, PatriotBattery battery) {
        this.rocketsTolaunchNumber = rocketsToLaunchNumber;
        this.battery = battery;
    }

    @Override
    public void run(){
        for (int i = 0; i < rocketsTolaunchNumber; i++) {
            battery.launchPatriot();
        }
    }
}