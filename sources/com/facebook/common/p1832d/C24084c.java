package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.d.c */
public final class C24084c extends FilterOutputStream {

    /* renamed from: a */
    public long f57014a;

    static {
        Covode.recordClassIndex(28211);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        this.out.close();
    }

    public C24084c(OutputStream outputStream) {
        super(outputStream);
        MethodCollector.m26663i(13193);
        MethodCollector.m26664o(13193);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i) {
        MethodCollector.m26663i(13317);
        this.out.write(i);
        this.f57014a++;
        MethodCollector.m26664o(13317);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(13258);
        this.out.write(bArr, i, i2);
        this.f57014a += (long) i2;
        MethodCollector.m26664o(13258);
    }
}
