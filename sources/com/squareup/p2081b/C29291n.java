package com.squareup.p2081b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.n */
public final class C29291n extends InputStream {

    /* renamed from: a */
    private final InputStream f69494a;

    /* renamed from: b */
    private long f69495b;

    /* renamed from: c */
    private long f69496c;

    /* renamed from: d */
    private long f69497d;

    /* renamed from: e */
    private long f69498e;

    static {
        Covode.recordClassIndex(35640);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f69494a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        this.f69494a.close();
    }

    public final boolean markSupported() {
        return this.f69494a.markSupported();
    }

    @Override // java.io.InputStream
    public final void reset() {
        mo51094a(this.f69498e);
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(9539);
        int read = this.f69494a.read();
        if (read != -1) {
            this.f69495b++;
        }
        MethodCollector.m26664o(9539);
        return read;
    }

    public C29291n(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    public final void mark(int i) {
        this.f69498e = mo51093a(i);
    }

    /* renamed from: a */
    public final long mo51093a(int i) {
        long j = this.f69495b + ((long) i);
        if (this.f69497d < j) {
            m58677b(j);
        }
        return this.f69495b;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long skip = this.f69494a.skip(j);
        this.f69495b += skip;
        return skip;
    }

    /* renamed from: a */
    public final void mo51094a(long j) {
        if (this.f69495b > this.f69497d || j < this.f69496c) {
            throw new IOException("Cannot reset");
        }
        this.f69494a.reset();
        m58676a(this.f69496c, j);
        this.f69495b = j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.m26663i(9838);
        int read = this.f69494a.read(bArr);
        if (read != -1) {
            this.f69495b += (long) read;
        }
        MethodCollector.m26664o(9838);
        return read;
    }

    /* renamed from: b */
    private void m58677b(long j) {
        try {
            long j2 = this.f69496c;
            long j3 = this.f69495b;
            if (j2 >= j3 || j3 > this.f69497d) {
                this.f69496c = j3;
                this.f69494a.mark((int) (j - j3));
            } else {
                this.f69494a.reset();
                this.f69494a.mark((int) (j - this.f69496c));
                m58676a(this.f69496c, this.f69495b);
            }
            this.f69497d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: ".concat(String.valueOf(e)));
        }
    }

    private C29291n(InputStream inputStream, byte b) {
        MethodCollector.m26663i(9533);
        this.f69498e = -1;
        this.f69494a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        MethodCollector.m26664o(9533);
    }

    /* renamed from: a */
    private void m58676a(long j, long j2) {
        while (j < j2) {
            long skip = this.f69494a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(9984);
        int read = this.f69494a.read(bArr, i, i2);
        if (read != -1) {
            this.f69495b += (long) read;
        }
        MethodCollector.m26664o(9984);
        return read;
    }
}
