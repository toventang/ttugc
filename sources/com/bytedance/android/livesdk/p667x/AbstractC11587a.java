package com.bytedance.android.livesdk.p667x;

import com.bytedance.android.live.annotation.AbstractC2916a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3867b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.x.a */
public abstract class AbstractC11587a {
    public AbstractC11587a mNextTask;
    public volatile int mStatus;

    static {
        Covode.recordClassIndex(13253);
    }

    /* access modifiers changed from: protected */
    public Callable asyncCallable() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String getTaskName();

    /* access modifiers changed from: protected */
    public abstract void run();

    public synchronized boolean isFinished() {
        boolean z;
        if (this.mStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isIDLE() {
        boolean z;
        if (this.mStatus == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isRunning() {
        if (this.mStatus == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public List<Integer> preTasks() {
        return Arrays.asList(0);
    }

    public final List<Integer> getPreTasks() {
        ArrayList arrayList = new ArrayList();
        if (preTasks() != null) {
            arrayList.add(0);
            for (Integer num : preTasks()) {
                if (!arrayList.contains(num)) {
                    arrayList.add(num);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getTaskId() {
        try {
            return ((AbstractC2916a) getClass().getAnnotation(AbstractC2916a.class)).mo7569a();
        } catch (Exception e) {
            C3854a.m9453a(6, "ttlive_sdk_launch_error", getClass().getCanonicalName() + " task getTaskID exception");
            C3854a.m9455a(6, "ttlive_sdk_launch_error", e.getStackTrace());
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void start() {
        if (this.mStatus != 2 && this.mStatus != 1) {
            this.mStatus = 1;
            try {
                C3867b.m9480a("init_live_launch_task_" + getTaskName());
                run();
                C3867b.m9483b("init_live_launch_task_" + getTaskName());
                this.mStatus = 2;
            } catch (Exception e) {
                this.mStatus = 3;
                throw e;
            }
        }
    }
}
