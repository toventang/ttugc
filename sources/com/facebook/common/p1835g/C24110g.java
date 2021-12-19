package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.AbstractC24120c;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.g.g */
public final class C24110g extends InputStream {

    /* renamed from: a */
    private final InputStream f57036a;

    /* renamed from: b */
    private final byte[] f57037b;

    /* renamed from: c */
    private final AbstractC24120c<byte[]> f57038c;

    /* renamed from: d */
    private int f57039d = 0;

    /* renamed from: e */
    private int f57040e = 0;

    /* renamed from: f */
    private boolean f57041f = false;

    static {
        Covode.recordClassIndex(28238);
    }

    /* renamed from: b */
    private void m45691b() {
        if (this.f57041f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        boolean z;
        if (this.f57040e <= this.f57039d) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        m45691b();
        return (this.f57039d - this.f57040e) + this.f57036a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        if (!this.f57041f) {
            this.f57041f = true;
            this.f57038c.mo39665a(this.f57037b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        if (!this.f57041f) {
            C24099a.m45657c("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    /* renamed from: a */
    private boolean m45690a() {
        MethodCollector.m26663i(11716);
        if (this.f57040e < this.f57039d) {
            MethodCollector.m26664o(11716);
            return true;
        }
        int read = this.f57036a.read(this.f57037b);
        if (read <= 0) {
            MethodCollector.m26664o(11716);
            return false;
        }
        this.f57039d = read;
        this.f57040e = 0;
        MethodCollector.m26664o(11716);
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        boolean z;
        if (this.f57040e <= this.f57039d) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        m45691b();
        if (!m45690a()) {
            return -1;
        }
        byte[] bArr = this.f57037b;
        int i = this.f57040e;
        this.f57040e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        boolean z;
        if (this.f57040e <= this.f57039d) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        m45691b();
        int i = this.f57039d;
        int i2 = this.f57040e;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.f57040e = (int) (((long) i2) + j);
            return j;
        }
        this.f57040e = i;
        return j2 + this.f57036a.skip(j - j2);
    }

    public C24110g(InputStream inputStream, byte[] bArr, AbstractC24120c<byte[]> cVar) {
        MethodCollector.m26663i(11390);
        this.f57036a = (InputStream) C24091i.m45617a(inputStream);
        this.f57037b = (byte[]) C24091i.m45617a(bArr);
        this.f57038c = (AbstractC24120c) C24091i.m45617a(cVar);
        MethodCollector.m26664o(11390);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.f57040e <= this.f57039d) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        m45691b();
        if (!m45690a()) {
            return -1;
        }
        int min = Math.min(this.f57039d - this.f57040e, i2);
        System.arraycopy(this.f57037b, this.f57040e, bArr, i, min);
        this.f57040e += min;
        return min;
    }
}
