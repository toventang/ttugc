package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.BaseInterceptor */
public abstract class BaseInterceptor {
    private boolean isEnabled;

    static {
        Covode.recordClassIndex(95489);
    }

    public abstract boolean intercept(ITask iTask);

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void enable(boolean z) {
        this.isEnabled = z;
    }
}
