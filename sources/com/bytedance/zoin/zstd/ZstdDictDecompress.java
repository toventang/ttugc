package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.zoin.zstd.p1792a.C23756a;

public class ZstdDictDecompress extends AbstractC23757b {

    /* renamed from: c */
    private long f56209c;

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    @Override // java.io.Closeable, com.bytedance.zoin.zstd.AbstractC23755a, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    static {
        Covode.recordClassIndex(27861);
        C23756a.m44905a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.zoin.zstd.AbstractC23755a
    /* renamed from: b */
    public final void mo39201b() {
        MethodCollector.m26663i(1364);
        if (this.f56209c != 0) {
            free();
            this.f56209c = 0;
        }
        MethodCollector.m26664o(1364);
    }
}
