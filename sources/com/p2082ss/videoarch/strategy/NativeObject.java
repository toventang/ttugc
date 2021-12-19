package com.p2082ss.videoarch.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.videoarch.strategy.NativeObject */
public class NativeObject {
    protected long mNativeObj;

    static {
        Covode.recordClassIndex(102998);
    }

    private native void nativeRelease(long j);

    private long getNativeObj() {
        return this.mNativeObj;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public synchronized void release() {
        MethodCollector.m26663i(11440);
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeObj = 0;
        }
        MethodCollector.m26664o(11440);
    }

    /* access modifiers changed from: protected */
    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
