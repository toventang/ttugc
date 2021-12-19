package com.bytedance.push.p1589b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.push.b.b */
final class C21763b extends InputStream {

    /* renamed from: a */
    private final InputStream f51572a;

    /* renamed from: b */
    private long f51573b;

    /* renamed from: c */
    private long f51574c;

    /* renamed from: d */
    private long f51575d;

    /* renamed from: e */
    private long f51576e;

    static {
        Covode.recordClassIndex(25412);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f51572a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        this.f51572a.close();
    }

    public final boolean markSupported() {
        return this.f51572a.markSupported();
    }

    @Override // java.io.InputStream
    public final void reset() {
        mo35401a(this.f51576e);
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(3021);
        int read = this.f51572a.read();
        if (read != -1) {
            this.f51573b++;
        }
        MethodCollector.m26664o(3021);
        return read;
    }

    public C21763b(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    public final void mark(int i) {
        this.f51576e = mo35400a(i);
    }

    /* renamed from: a */
    public final long mo35400a(int i) {
        long j = this.f51573b + ((long) i);
        if (this.f51575d < j) {
            m40735b(j);
        }
        return this.f51573b;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long skip = this.f51572a.skip(j);
        this.f51573b += skip;
        return skip;
    }

    /* renamed from: a */
    public final void mo35401a(long j) {
        if (this.f51573b > this.f51575d || j < this.f51574c) {
            throw new IOException("reset failed");
        }
        this.f51572a.reset();
        m40734a(this.f51574c, j);
        this.f51573b = j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.m26663i(3022);
        int read = this.f51572a.read(bArr);
        if (read != -1) {
            this.f51573b += (long) read;
        }
        MethodCollector.m26664o(3022);
        return read;
    }

    /* renamed from: b */
    private void m40735b(long j) {
        try {
            long j2 = this.f51574c;
            long j3 = this.f51573b;
            if (j2 >= j3 || j3 > this.f51575d) {
                this.f51574c = j3;
                this.f51572a.mark((int) (j - j3));
            } else {
                this.f51572a.reset();
                this.f51572a.mark((int) (j - this.f51574c));
                m40734a(this.f51574c, this.f51573b);
            }
            this.f51575d = j;
        } catch (Throwable th) {
            throw new IllegalStateException("set index failed: ".concat(String.valueOf(th)));
        }
    }

    private C21763b(InputStream inputStream, byte b) {
        MethodCollector.m26663i(3004);
        this.f51576e = -1;
        this.f51572a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        MethodCollector.m26664o(3004);
    }

    /* renamed from: a */
    private void m40734a(long j, long j2) {
        while (j < j2) {
            long skip = this.f51572a.skip(j2 - j);
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
        MethodCollector.m26663i(3023);
        int read = this.f51572a.read(bArr, i, i2);
        if (read != -1) {
            this.f51573b += (long) read;
        }
        MethodCollector.m26664o(3023);
        return read;
    }
}
