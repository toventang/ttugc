package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.avframework.engine.NativeObject */
public class NativeObject {
    public long mNativeObj;

    static {
        Covode.recordClassIndex(99974);
    }

    private native void nativeRelease(long j);

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public void finalize() {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public synchronized void release() {
        MethodCollector.m26663i(1487);
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeObj = 0;
        }
        MethodCollector.m26664o(1487);
    }

    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
