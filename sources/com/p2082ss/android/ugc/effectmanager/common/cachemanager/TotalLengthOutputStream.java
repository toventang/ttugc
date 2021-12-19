package com.p2082ss.android.ugc.effectmanager.common.cachemanager;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.TotalLengthOutputStream */
public final class TotalLengthOutputStream extends FilterOutputStream {
    private long length;

    static {
        Covode.recordClassIndex(95451);
    }

    public final long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        this.out.close();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TotalLengthOutputStream(OutputStream outputStream) {
        super(outputStream);
        C89219l.m154719c(outputStream, "");
        MethodCollector.m26663i(4693);
        MethodCollector.m26664o(4693);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i) {
        MethodCollector.m26663i(4684);
        this.out.write(i);
        this.length++;
        MethodCollector.m26664o(4684);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(4687);
        this.out.write(bArr, i, i2);
        this.length += (long) i2;
        MethodCollector.m26664o(4687);
    }
}
