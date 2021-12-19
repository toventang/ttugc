package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamOption */
public class LiveStreamOption {
    private TEBundle mOpt;

    static {
        Covode.recordClassIndex(100092);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        release();
    }

    public TEBundle getOpt() {
        return this.mOpt;
    }

    public synchronized void release() {
        MethodCollector.m26663i(1341);
        TEBundle tEBundle = this.mOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mOpt = null;
        }
        MethodCollector.m26664o(1341);
    }

    public LiveStreamOption(TEBundle tEBundle) {
        this.mOpt = tEBundle;
    }
}
