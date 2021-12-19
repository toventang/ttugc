package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.g.h */
public final class C25747h extends FilterInputStream {

    /* renamed from: a */
    private long f60866a;

    /* renamed from: b */
    private long f60867b = -1;

    static {
        Covode.recordClassIndex(31162);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f60866a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(10954);
        if (this.f60866a == 0) {
            MethodCollector.m26664o(10954);
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f60866a--;
        }
        MethodCollector.m26664o(10954);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        MethodCollector.m26663i(10956);
        if (!this.in.markSupported()) {
            IOException iOException = new IOException("Mark not supported");
            MethodCollector.m26664o(10956);
            throw iOException;
        } else if (this.f60867b != -1) {
            this.in.reset();
            this.f60866a = this.f60867b;
            MethodCollector.m26664o(10956);
        } else {
            IOException iOException2 = new IOException("Mark not set");
            MethodCollector.m26664o(10956);
            throw iOException2;
        }
    }

    public C25747h(InputStream inputStream) {
        super(inputStream);
        MethodCollector.m26663i(10952);
        C25743d.m49692a(inputStream);
        this.f60866a = 1048577;
        MethodCollector.m26664o(10952);
    }

    public final synchronized void mark(int i) {
        MethodCollector.m26663i(10953);
        this.in.mark(i);
        this.f60867b = this.f60866a;
        MethodCollector.m26664o(10953);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f60866a));
        this.f60866a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(10955);
        long j = this.f60866a;
        if (j == 0) {
            MethodCollector.m26664o(10955);
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f60866a -= (long) read;
        }
        MethodCollector.m26664o(10955);
        return read;
    }
}
