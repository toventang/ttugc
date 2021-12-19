package com.bytedance.common.jato.gcblocker;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmGcBlocker extends AbstractC13575a {
    static {
        Covode.recordClassIndex(15592);
    }

    private static native void nativeDalvikStartBlockGc();

    private static native void nativeDalvikStopBlockGc();

    private static native void nativeInit();

    @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
    /* renamed from: a */
    public final void mo21843a(long j) {
    }

    public DvmGcBlocker() {
        MethodCollector.m26663i(9305);
        nativeInit();
        MethodCollector.m26664o(9305);
    }

    @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
    /* renamed from: a */
    public final void mo21844a(String str) {
        MethodCollector.m26663i(9306);
        nativeDalvikStartBlockGc();
        MethodCollector.m26664o(9306);
    }

    @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
    /* renamed from: b */
    public final void mo21845b(String str) {
        MethodCollector.m26663i(9307);
        nativeDalvikStopBlockGc();
        MethodCollector.m26664o(9307);
    }
}
