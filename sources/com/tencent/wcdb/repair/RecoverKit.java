package com.tencent.wcdb.repair;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.support.C87272a;

public class RecoverKit implements C87272a.AbstractC87273a {

    /* renamed from: a */
    private long f197767a;

    static {
        Covode.recordClassIndex(103160);
    }

    private static native void nativeCancel(long j);

    private static native int nativeFailureCount(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, boolean z);

    private static native int nativeSuccessCount(long j);

    @Override // com.tencent.wcdb.support.C87272a.AbstractC87273a
    /* renamed from: b */
    public final void mo141178b() {
        MethodCollector.m26663i(5507);
        long j = this.f197767a;
        if (j != 0) {
            nativeCancel(j);
        }
        MethodCollector.m26664o(5507);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(5612);
        long j = this.f197767a;
        if (j != 0) {
            nativeFinish(j);
            this.f197767a = 0;
        }
        super.finalize();
        MethodCollector.m26664o(5612);
    }
}
