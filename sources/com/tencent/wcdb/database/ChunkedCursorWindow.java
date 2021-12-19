package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ChunkedCursorWindow extends AbstractC87245c {

    /* renamed from: a */
    long f197600a;

    static {
        Covode.recordClassIndex(103094);
    }

    private static native void nativeClear(long j);

    private static native long nativeCreate(int i);

    private static native void nativeDispose(long j);

    private static native void nativeEndRow(long j, long j2);

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native int nativeGetNumChunks(long j);

    private static native long nativeGetRow(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native long nativeRemoveChunk(long j, int i);

    private static native boolean nativeSetNumColumns(long j, int i);

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.AbstractC87245c
    /* renamed from: c */
    public final void mo141108c() {
        m151284a();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            m151284a();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    private void m151284a() {
        MethodCollector.m26663i(5260);
        long j = this.f197600a;
        if (j != 0) {
            nativeDispose(j);
            this.f197600a = 0;
        }
        MethodCollector.m26664o(5260);
    }
}
