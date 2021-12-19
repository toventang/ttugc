package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.ar.core.Segmentation */
public class Segmentation {
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32616);
    }

    private native long nativeAcquirePersonMask(long j, long j2);

    private native void nativeReleaseSegmentation(long j, long j2);

    public ArImage acquirePersonMask() {
        MethodCollector.m26663i(9119);
        ArImage arImage = new ArImage(this.session, nativeAcquirePersonMask(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(9119);
        return arImage;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(8963);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseSegmentation(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(8963);
    }

    Segmentation(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
