package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.engine.AudioEncoder */
public abstract class AudioEncoder extends NativeObject {
    static {
        Covode.recordClassIndex(99959);
    }

    public abstract int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    /* access modifiers changed from: protected */
    public native void nativeEncoded(ByteBuffer byteBuffer, int i, int i2, long j);

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void release() {
    }
}
