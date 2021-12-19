package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.ae */
final class C26771ae extends InputStream {

    /* renamed from: a */
    private final InputStream f63433a;

    /* renamed from: b */
    private long f63434b;

    static {
        Covode.recordClassIndex(32246);
    }

    C26771ae(InputStream inputStream, long j) {
        MethodCollector.m26663i(14255);
        this.f63433a = inputStream;
        this.f63434b = j;
        MethodCollector.m26664o(14255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        super.close();
        this.f63433a.close();
        this.f63434b = 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read;
        MethodCollector.m26663i(14256);
        long j = this.f63434b;
        if (j <= 0) {
            read = -1;
        } else {
            this.f63434b = j - 1;
            read = this.f63433a.read();
        }
        MethodCollector.m26664o(14256);
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(14257);
        long j = this.f63434b;
        if (j <= 0) {
            MethodCollector.m26664o(14257);
            return -1;
        }
        int read = this.f63433a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f63434b -= (long) read;
        }
        MethodCollector.m26664o(14257);
        return read;
    }
}
