package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.AbstractC22029d;
import java.io.InputStream;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d */
public final class C14666d extends InputStream {

    /* renamed from: a */
    private InputStream f35599a;

    /* renamed from: b */
    private AbstractC22029d f35600b;

    static {
        Covode.recordClassIndex(16763);
    }

    public C14666d() {
        MethodCollector.m26663i(10818);
        MethodCollector.m26664o(10818);
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return super.available();
    }

    public final boolean markSupported() {
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return super.markSupported();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            InputStream inputStream = this.f35599a;
            if (inputStream != null) {
                inputStream.close();
            }
            AbstractC22029d dVar = this.f35600b;
            if (dVar != null) {
                dVar.mo11600b();
            }
        } catch (Throwable unused) {
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(11414);
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            int read = inputStream.read();
            MethodCollector.m26664o(11414);
            return read;
        }
        MethodCollector.m26664o(11414);
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        MethodCollector.m26663i(11259);
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            inputStream.reset();
            MethodCollector.m26664o(11259);
            return;
        }
        super.reset();
        MethodCollector.m26664o(11259);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return super.skip(j);
    }

    public final synchronized void mark(int i) {
        MethodCollector.m26663i(11258);
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            inputStream.mark(i);
            MethodCollector.m26664o(11258);
            return;
        }
        super.mark(i);
        MethodCollector.m26664o(11258);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.m26663i(10963);
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            int read = inputStream.read(bArr);
            MethodCollector.m26664o(10963);
            return read;
        }
        int read2 = super.read(bArr);
        MethodCollector.m26664o(10963);
        return read2;
    }

    public C14666d(InputStream inputStream, AbstractC22029d dVar) {
        MethodCollector.m26663i(10681);
        this.f35599a = inputStream;
        this.f35600b = dVar;
        MethodCollector.m26664o(10681);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(11106);
        InputStream inputStream = this.f35599a;
        if (inputStream != null) {
            int read = inputStream.read(bArr, i, i2);
            MethodCollector.m26664o(11106);
            return read;
        }
        int read2 = super.read(bArr, i, i2);
        MethodCollector.m26664o(11106);
        return read2;
    }
}
