package com.facebook.common.p1838j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.j.b */
public final class C24126b extends FilterInputStream {

    /* renamed from: a */
    private final byte[] f57070a;

    /* renamed from: b */
    private int f57071b;

    /* renamed from: c */
    private int f57072c;

    static {
        Covode.recordClassIndex(28254);
    }

    /* renamed from: a */
    private int m45729a() {
        int i = this.f57071b;
        byte[] bArr = this.f57070a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f57071b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(10343);
        int read = this.in.read();
        if (read != -1) {
            MethodCollector.m26664o(10343);
            return read;
        }
        int a = m45729a();
        MethodCollector.m26664o(10343);
        return a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f57071b = this.f57072c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f57072c = this.f57071b;
        }
    }

    public C24126b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        MethodCollector.m26663i(10184);
        if (inputStream == null) {
            NullPointerException nullPointerException = new NullPointerException();
            MethodCollector.m26664o(10184);
            throw nullPointerException;
        } else if (bArr != null) {
            this.f57070a = bArr;
            MethodCollector.m26664o(10184);
        } else {
            NullPointerException nullPointerException2 = new NullPointerException();
            MethodCollector.m26664o(10184);
            throw nullPointerException2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(10484);
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            MethodCollector.m26664o(10484);
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            MethodCollector.m26664o(10484);
            return 0;
        }
        while (i3 < i2) {
            int a = m45729a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        MethodCollector.m26664o(10484);
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
