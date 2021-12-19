package com.p2082ss.android.medialib.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.model.CoverInfo;
import com.p2082ss.android.medialib.player.EffectConfig;
import com.p2082ss.android.ttve.nativePort.C30731d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.jni.EffectThumb */
public class EffectThumb {
    private long handle = nativeCreate();
    private List<CoverInfo> mCovers = new ArrayList();
    private int mMaxSize;
    private float mSpeed;
    private long mTrimIn;
    private long mTrimOut;
    boolean stopped;
    private AbstractC30010a thumbListener;

    /* renamed from: com.ss.android.medialib.jni.EffectThumb$a */
    public interface AbstractC30010a {
        static {
            Covode.recordClassIndex(36465);
        }
    }

    private native long nativeCreate();

    private native long nativeGetDuration(long j);

    private native int nativeInit(long j, String str);

    private native int nativeRenderVideo(long j, long[] jArr, EffectConfig effectConfig, int i, int i2);

    private native void nativeStop(long j);

    public CoverInfo getThumb() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        stopRender();
        super.finalize();
    }

    static {
        Covode.recordClassIndex(36464);
        C30731d.m63119d();
    }

    public long getDuration() {
        return (long) (((float) (this.mTrimOut - this.mTrimIn)) / this.mSpeed);
    }

    public EffectThumb() {
        MethodCollector.m26663i(1774);
        MethodCollector.m26664o(1774);
    }

    public long getSourceVideoDuration() {
        MethodCollector.m26663i(1785);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(1785);
            return -1;
        }
        long nativeGetDuration = nativeGetDuration(j);
        MethodCollector.m26664o(1785);
        return nativeGetDuration;
    }

    public synchronized void stopRender() {
        MethodCollector.m26663i(1790);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(1790);
            return;
        }
        this.stopped = true;
        nativeStop(j);
        this.handle = 0;
        MethodCollector.m26664o(1790);
    }

    public void setThumbListener(AbstractC30010a aVar) {
        this.thumbListener = aVar;
    }

    public int init(String str) {
        MethodCollector.m26663i(1781);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(1781);
            return -1;
        }
        int nativeInit = nativeInit(j, str);
        if (nativeInit >= 0) {
            this.mTrimIn = 0;
            this.mTrimOut = getSourceVideoDuration();
            this.mSpeed = 1.0f;
        }
        MethodCollector.m26664o(1781);
        return nativeInit;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r2 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.android.medialib.model.CoverInfo getThumb(int r5) {
        /*
            r4 = this;
            r3 = 1881(0x759, float:2.636E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            r2 = 0
            if (r5 < 0) goto L_0x0010
            int r0 = r4.mMaxSize
            if (r5 >= r0) goto L_0x0010
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            if (r0 != 0) goto L_0x0014
        L_0x0010:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x0014:
            boolean r0 = r4.stopped
            if (r0 != 0) goto L_0x004b
            monitor-enter(r4)
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers     // Catch:{ all -> 0x0044 }
            int r0 = r0.size()     // Catch:{ all -> 0x0044 }
            if (r0 > r5) goto L_0x002b
            r0 = 10
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002b:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0035
            monitor-exit(r4)
            goto L_0x0014
        L_0x0035:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            java.lang.Object r1 = r0.get(r5)
            com.ss.android.medialib.model.CoverInfo r1 = (com.p2082ss.android.medialib.model.CoverInfo) r1
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            r0.set(r5, r2)
            monitor-exit(r4)
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x004a:
            r2 = r1
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.jni.EffectThumb.getThumb(int):com.ss.android.medialib.model.CoverInfo");
    }

    public void onThumb(int[] iArr, int i, int i2) {
        MethodCollector.m26663i(1889);
        CoverInfo coverInfo = new CoverInfo(i, i2, iArr);
        synchronized (this) {
            try {
                if (!this.stopped) {
                    this.mCovers.add(coverInfo);
                    notify();
                }
            } finally {
                MethodCollector.m26664o(1889);
            }
        }
    }

    public int renderVideo(long j, EffectConfig effectConfig, int i, int i2) {
        MethodCollector.m26663i(1788);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.m26664o(1788);
            return -1;
        }
        this.mMaxSize = 1;
        int nativeRenderVideo = nativeRenderVideo(j2, new long[]{((long) (((float) j) * this.mSpeed)) + this.mTrimIn}, effectConfig, i, i2);
        MethodCollector.m26664o(1788);
        return nativeRenderVideo;
    }

    public int init(String str, long j, long j2, float f) {
        MethodCollector.m26663i(1784);
        long j3 = this.handle;
        if (j3 == 0) {
            MethodCollector.m26664o(1784);
            return -1;
        }
        int nativeInit = nativeInit(j3, str);
        if (nativeInit >= 0) {
            this.mTrimIn = j;
            this.mTrimOut = j2;
            this.mSpeed = f;
        }
        MethodCollector.m26664o(1784);
        return nativeInit;
    }

    public int renderVideo(long[] jArr, EffectConfig effectConfig, int i, int i2) {
        MethodCollector.m26663i(1786);
        if (this.handle == 0) {
            MethodCollector.m26664o(1786);
            return -1;
        }
        this.mMaxSize = jArr.length;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = ((long) (((float) jArr[i3]) * this.mSpeed)) + this.mTrimIn;
        }
        int nativeRenderVideo = nativeRenderVideo(this.handle, jArr, effectConfig, i, i2);
        MethodCollector.m26664o(1786);
        return nativeRenderVideo;
    }
}
