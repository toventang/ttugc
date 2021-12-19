package com.bytedance.falconx.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.falconx.statistic.c */
public class C14574c extends InputStream {

    /* renamed from: a */
    private InputStream f35239a;

    static {
        Covode.recordClassIndex(16664);
    }

    /* renamed from: a */
    public void mo23435a(IOException iOException) {
    }

    public boolean markSupported() {
        return this.f35239a.markSupported();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f35239a.available();
        } catch (IOException e) {
            mo23435a(e);
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        try {
            this.f35239a.close();
        } catch (IOException e) {
            mo23435a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        MethodCollector.m26663i(2852);
        try {
            int read = this.f35239a.read();
            MethodCollector.m26664o(2852);
            return read;
        } catch (IOException e) {
            mo23435a(e);
            MethodCollector.m26664o(2852);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        MethodCollector.m26663i(2759);
        try {
            this.f35239a.reset();
            MethodCollector.m26664o(2759);
        } catch (IOException e) {
            mo23435a(e);
            MethodCollector.m26664o(2759);
            throw e;
        }
    }

    public C14574c(InputStream inputStream) {
        MethodCollector.m26663i(2161);
        this.f35239a = inputStream;
        MethodCollector.m26664o(2161);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f35239a.skip(j);
        } catch (IOException e) {
            mo23435a(e);
            throw e;
        }
    }

    public synchronized void mark(int i) {
        MethodCollector.m26663i(2700);
        this.f35239a.mark(i);
        MethodCollector.m26664o(2700);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        MethodCollector.m26663i(2163);
        try {
            int read = this.f35239a.read(bArr);
            MethodCollector.m26664o(2163);
            return read;
        } catch (IOException e) {
            mo23435a(e);
            MethodCollector.m26664o(2163);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(2164);
        try {
            int read = this.f35239a.read(bArr, i, i2);
            MethodCollector.m26664o(2164);
            return read;
        } catch (IOException e) {
            mo23435a(e);
            MethodCollector.m26664o(2164);
            throw e;
        }
    }
}
