package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.an */
public final class C85318an {

    /* renamed from: a */
    private volatile long f190976a;

    static {
        Covode.recordClassIndex(99429);
    }

    /* renamed from: a */
    public final synchronized void mo130628a() {
        MethodCollector.m26663i(3622);
        TEVideoUtils.releaseGetFrameHandler(this.f190976a);
        this.f190976a = 0;
        MethodCollector.m26664o(3622);
    }

    /* renamed from: a */
    public final synchronized void mo130629a(String str) {
        MethodCollector.m26663i(3619);
        this.f190976a = TEVideoUtils.createGetFrameHandler(str);
        MethodCollector.m26664o(3619);
    }

    /* renamed from: a */
    public final synchronized Bitmap mo130627a(int i, int i2, boolean z) {
        MethodCollector.m26663i(3620);
        if (this.f190976a == 0) {
            MethodCollector.m26664o(3620);
            return null;
        }
        Bitmap frameWithHandler = TEVideoUtils.getFrameWithHandler(this.f190976a, i, -1, i2, z);
        MethodCollector.m26664o(3620);
        return frameWithHandler;
    }
}
