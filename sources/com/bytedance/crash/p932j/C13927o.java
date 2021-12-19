package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.j.o */
public final class C13927o extends GZIPOutputStream {
    static {
        Covode.recordClassIndex(15987);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.util.zip.DeflaterOutputStream, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public final void finish() {
    }

    /* renamed from: a */
    public final void mo22411a() {
        super.close();
    }

    /* renamed from: b */
    public final void mo22412b() {
        super.finish();
    }

    public C13927o(OutputStream outputStream) {
        super(outputStream);
        MethodCollector.m26663i(577);
        MethodCollector.m26664o(577);
    }
}
