package com.bytedance.geckox.buffer.p1014a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.AbstractC14888a;
import java.io.InputStream;

/* renamed from: com.bytedance.geckox.buffer.a.a */
public final class C14889a extends InputStream {

    /* renamed from: a */
    private AbstractC14888a f36364a;

    /* renamed from: b */
    private long f36365b;

    static {
        Covode.recordClassIndex(17000);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
    }

    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f36364a.mo23978d();
    }

    @Override // java.io.InputStream
    public final int available() {
        long b = this.f36364a.mo23975b() - this.f36364a.mo23977c();
        if (b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        MethodCollector.m26663i(2224);
        this.f36364a.mo23976b(this.f36365b);
        MethodCollector.m26664o(2224);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f36364a.mo23969a(j);
    }

    public C14889a(AbstractC14888a aVar) {
        MethodCollector.m26663i(5779);
        this.f36364a = aVar;
        MethodCollector.m26664o(5779);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f36364a.mo23973b(bArr);
    }

    public final synchronized void mark(int i) {
        MethodCollector.m26663i(2220);
        this.f36365b = (long) i;
        MethodCollector.m26664o(2220);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f36364a.mo23974b(bArr, i, i2);
    }
}
