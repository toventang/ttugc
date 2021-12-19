package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.NativeObject */
public class NativeObject {

    /* renamed from: l */
    protected long f192541l;

    static {
        Covode.recordClassIndex(101399);
    }

    private native void nativeRelease(long j);

    /* access modifiers changed from: protected */
    public void finalize() {
    }

    private long getNativeObj() {
        return this.f192541l;
    }

    /* access modifiers changed from: protected */
    public void setNativeObj(long j) {
        this.f192541l = j;
    }
}
