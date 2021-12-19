package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.j.g */
public final class C13910g extends DataOutputStream {
    static {
        Covode.recordClassIndex(15970);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: a */
    public final void mo22392a() {
        super.close();
    }

    public C13910g(OutputStream outputStream) {
        super(outputStream);
        MethodCollector.m26663i(1437);
        MethodCollector.m26664o(1437);
    }
}
