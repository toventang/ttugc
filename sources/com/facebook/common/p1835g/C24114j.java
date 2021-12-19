package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.io.InputStream;

/* renamed from: com.facebook.common.g.j */
public final class C24114j extends InputStream {

    /* renamed from: a */
    final AbstractC24111h f57042a;

    /* renamed from: b */
    int f57043b = 0;

    /* renamed from: c */
    int f57044c = 0;

    static {
        Covode.recordClassIndex(28242);
    }

    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f57043b = this.f57044c;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f57042a.mo39673a() - this.f57043b;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        AbstractC24111h hVar = this.f57042a;
        int i = this.f57043b;
        this.f57043b = i + 1;
        return hVar.mo39672a(i) & 255;
    }

    public final void mark(int i) {
        this.f57044c = this.f57043b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        int min = Math.min((int) j, available());
        this.f57043b += min;
        return (long) min;
    }

    public C24114j(AbstractC24111h hVar) {
        MethodCollector.m26663i(10942);
        C24091i.m45620a(!hVar.mo39677d());
        this.f57042a = (AbstractC24111h) C24091i.m45617a(hVar);
        MethodCollector.m26664o(10942);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f57042a.mo39674a(this.f57043b, bArr, i, min);
        this.f57043b += min;
        return min;
    }
}
