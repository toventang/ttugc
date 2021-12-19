package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.as */
public class C85327as {

    /* renamed from: a */
    private long f191019a;

    /* renamed from: b */
    private final int f191020b;

    /* renamed from: c */
    private final int f191021c;

    static {
        Covode.recordClassIndex(99438);
    }

    C85327as(int i, int i2, int i3, float f, int i4) {
        this.f191019a = TEVideoUtils.createRTAudioWaveformMgr(i2, i3, f, i4);
        this.f191020b = i2;
        this.f191021c = i;
    }
}
