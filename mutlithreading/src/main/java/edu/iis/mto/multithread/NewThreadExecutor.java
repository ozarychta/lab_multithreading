package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class NewThreadExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).run();
    }
}
