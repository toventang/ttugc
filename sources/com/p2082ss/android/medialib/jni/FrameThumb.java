package com.p2082ss.android.medialib.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.jni.FrameThumb */
public class FrameThumb {
    private long handle = nativeCreate();

    private native long nativeCreate();

    private native int[] nativeGetOldFrameThumbnail(long j, int i, int i2);

    private native int[] nativeInitVideoToGraph(long j, String str, int i, int i2, boolean z);

    private native int nativeStart(long j);

    private native void nativeStop(long j);

    private native void nativeStopGetFrameThumbnail(long j);

    private native int nativeUninitVideoToGraph(long j);

    static {
        Covode.recordClassIndex(36466);
        C30731d.m63118c();
    }

    public void stopGetFrameThumbnail() {
        MethodCollector.m26663i(1623);
        nativeStopGetFrameThumbnail(this.handle);
        MethodCollector.m26664o(1623);
    }

    public FrameThumb() {
        MethodCollector.m26663i(1580);
        MethodCollector.m26664o(1580);
    }

    public synchronized int start() {
        MethodCollector.m26663i(1629);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(1629);
            return -1;
        }
        int nativeStart = nativeStart(j);
        MethodCollector.m26664o(1629);
        return nativeStart;
    }

    public synchronized void stop() {
        MethodCollector.m26663i(1633);
        long j = this.handle;
        if (j != 0) {
            nativeStop(j);
        }
        MethodCollector.m26664o(1633);
    }

    public int unInitVideoToGraph() {
        int nativeUninitVideoToGraph;
        MethodCollector.m26663i(1612);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(1612);
            return -1;
        }
        nativeStopGetFrameThumbnail(j);
        synchronized (this) {
            try {
                nativeUninitVideoToGraph = nativeUninitVideoToGraph(this.handle);
                this.handle = 0;
            } finally {
                MethodCollector.m26664o(1612);
            }
        }
        return nativeUninitVideoToGraph;
    }

    public int[] getFrameThumbnail(int i) {
        return getFrameThumbnail(i, 1);
    }

    public int[] initVideoToGraph(String str) {
        return initVideoToGraph(str, -1, -1);
    }

    public synchronized int[] getFrameThumbnail(int i, int i2) {
        MethodCollector.m26663i(1618);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(1618);
            return null;
        }
        int[] nativeGetOldFrameThumbnail = nativeGetOldFrameThumbnail(j, i, i2);
        MethodCollector.m26664o(1618);
        return nativeGetOldFrameThumbnail;
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2) {
        int[] initVideoToGraph;
        MethodCollector.m26663i(1583);
        initVideoToGraph = initVideoToGraph(str, i, i2, false);
        MethodCollector.m26664o(1583);
        return initVideoToGraph;
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2, boolean z) {
        MethodCollector.m26663i(1587);
        long j = this.handle;
        if (j == 0) {
            int[] iArr = new int[9];
            iArr[0] = -10000;
            MethodCollector.m26664o(1587);
            return iArr;
        }
        int[] nativeInitVideoToGraph = nativeInitVideoToGraph(j, str, i, i2, z);
        MethodCollector.m26664o(1587);
        return nativeInitVideoToGraph;
    }
}
