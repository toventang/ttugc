package com.facebook.common.p1838j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.j.a */
public final class C24125a extends FilterInputStream {

    /* renamed from: a */
    private int f57068a;

    /* renamed from: b */
    private int f57069b;

    static {
        Covode.recordClassIndex(28253);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(this.in.available(), this.f57068a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(13054);
        if (this.f57068a == 0) {
            MethodCollector.m26664o(13054);
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f57068a--;
        }
        MethodCollector.m26664o(13054);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f57069b != -1) {
            this.in.reset();
            this.f57068a = this.f57069b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f57069b = this.f57068a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, (long) this.f57068a));
        this.f57068a = (int) (((long) this.f57068a) - skip);
        return skip;
    }

    public C24125a(InputStream inputStream, int i) {
        super(inputStream);
        MethodCollector.m26663i(13053);
        if (inputStream == null) {
            NullPointerException nullPointerException = new NullPointerException();
            MethodCollector.m26664o(13053);
            throw nullPointerException;
        } else if (i >= 0) {
            this.f57068a = i;
            this.f57069b = -1;
            MethodCollector.m26664o(13053);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("limit must be >= 0");
            MethodCollector.m26664o(13053);
            throw illegalArgumentException;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(13055);
        int i3 = this.f57068a;
        if (i3 == 0) {
            MethodCollector.m26664o(13055);
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f57068a -= read;
        }
        MethodCollector.m26664o(13055);
        return read;
    }
}
