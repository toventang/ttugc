package com.p2082ss.android.ttve.audio;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ttve.audio.TEDubWriter */
public class TEDubWriter implements AbstractC30636b {

    /* renamed from: a */
    long f73230a = nativeCreate();

    /* renamed from: b */
    public long f73231b;

    static {
        Covode.recordClassIndex(37173);
    }

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);

    public TEDubWriter() {
        MethodCollector.m26663i(11985);
        MethodCollector.m26664o(11985);
    }

    @Override // com.p2082ss.android.ttve.audio.AbstractC30636b
    /* renamed from: a */
    public final int mo54908a() {
        MethodCollector.m26663i(11990);
        long j = this.f73230a;
        if (j == 0) {
            MethodCollector.m26664o(11990);
            return -112;
        }
        int nativeCloseWavFile = nativeCloseWavFile(j);
        MethodCollector.m26664o(11990);
        return nativeCloseWavFile;
    }

    @Override // com.p2082ss.android.ttve.audio.AbstractC30636b
    /* renamed from: b */
    public final void mo54911b() {
        MethodCollector.m26663i(11991);
        long j = this.f73230a;
        if (j != 0) {
            nativeDestroy(j);
        }
        MethodCollector.m26664o(11991);
    }

    @Override // com.p2082ss.android.ttve.audio.AbstractC30636b
    /* renamed from: a */
    public final int mo54910a(byte[] bArr, int i) {
        MethodCollector.m26663i(11987);
        long j = this.f73230a;
        if (j == 0) {
            MethodCollector.m26664o(11987);
            return -112;
        }
        int nativeAddPCMData = nativeAddPCMData(j, bArr, i);
        this.f73231b = nativeGetCurrentTime(this.f73230a);
        MethodCollector.m26664o(11987);
        return nativeAddPCMData;
    }

    @Override // com.p2082ss.android.ttve.audio.AbstractC30636b
    /* renamed from: a */
    public final int mo54909a(String str, int i, double d, int i2, int i3) {
        MethodCollector.m26663i(11986);
        long j = this.f73230a;
        if (j == 0) {
            MethodCollector.m26664o(11986);
            return -112;
        }
        int nativeInitWavFile = nativeInitWavFile(j, str, i, 2, d, i2, i3);
        MethodCollector.m26664o(11986);
        return nativeInitWavFile;
    }
}
