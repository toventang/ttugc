package com.samsung.sdk.sperf;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class TaskBoostReleaseHandler extends Handler implements Runnable {
    private SPerfManager sPerfManager = null;
    private int type = 64532198;

    static {
        Covode.recordClassIndex(35083);
    }

    public TaskBoostReleaseHandler(Context context, SPerfManager sPerfManager2, int i) {
        super(context.getMainLooper());
        this.sPerfManager = sPerfManager2;
        this.type = i;
    }

    public void handleMessage(Message message) {
        if (message.what == 15067) {
            run();
        }
    }

    public void run() {
        this.sPerfManager.stopBoost(this.type, PerformanceManager.getPid());
    }

    public void startBoostTimeout(int i) {
        removeMessages(15067);
        sendEmptyMessageDelayed(15067, (long) i);
    }
}
