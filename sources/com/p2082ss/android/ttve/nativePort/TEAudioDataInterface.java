package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.audio.AbstractC85340h;
import com.p2082ss.android.vesdk.audio.C85342j;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.nativePort.TEAudioDataInterface */
public class TEAudioDataInterface implements AbstractC85340h {
    private long handle = nativeCreate();

    private native long nativeCreate();

    private native int nativeInit(long j, int i, int i2, int i3);

    private native void nativeRelease(long j);

    private native int nativeSendData(long j, ByteBuffer byteBuffer, int i, long j2, long j3);

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
    public void onError(int i, int i2, String str) {
    }

    public long getHandle() {
        return this.handle;
    }

    static {
        Covode.recordClassIndex(37289);
        C30731d.m63118c();
    }

    public TEAudioDataInterface() {
        MethodCollector.m26663i(8138);
        MethodCollector.m26664o(8138);
    }

    public synchronized void release() {
        MethodCollector.m26663i(8436);
        long j = this.handle;
        if (j != 0) {
            nativeRelease(j);
            this.handle = 0;
        }
        MethodCollector.m26664o(8436);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
    public synchronized void onReceive(C85342j jVar) {
        MethodCollector.m26663i(8140);
        long j = this.handle;
        if (j != 0) {
            nativeSendData(j, ((C85342j.C85344b) jVar.f191054a).f191058a, jVar.f191055b, jVar.f191056c, (System.nanoTime() / 1000) - jVar.f191056c);
        }
        MethodCollector.m26664o(8140);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
    public void onInfo(int i, int i2, double d, Object obj) {
        MethodCollector.m26663i(8286);
        if (i == C85310ah.f190925M) {
            C85521l lVar = (C85521l) obj;
            long j = this.handle;
            if (j != 0) {
                nativeInit(j, lVar.f191576b, lVar.f191575a, lVar.f191577c);
            }
        }
        MethodCollector.m26664o(8286);
    }
}
