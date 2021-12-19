package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: com.google.android.play.core.assetpacks.bx */
public final class C26817bx extends InputStream {

    /* renamed from: a */
    private final Enumeration<File> f63605a;

    /* renamed from: b */
    private InputStream f63606b;

    static {
        Covode.recordClassIndex(32292);
    }

    public C26817bx(Enumeration<File> enumeration) {
        MethodCollector.m26663i(13835);
        this.f63605a = enumeration;
        m53272a();
        MethodCollector.m26664o(13835);
    }

    /* renamed from: a */
    private void m53272a() {
        MethodCollector.m26663i(13881);
        InputStream inputStream = this.f63606b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f63606b = this.f63605a.hasMoreElements() ? new FileInputStream(this.f63605a.nextElement()) : null;
        MethodCollector.m26664o(13881);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        super.close();
        InputStream inputStream = this.f63606b;
        if (inputStream != null) {
            inputStream.close();
            this.f63606b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(13836);
        while (true) {
            InputStream inputStream = this.f63606b;
            if (inputStream != null) {
                int read = inputStream.read();
                if (read != -1) {
                    MethodCollector.m26664o(13836);
                    return read;
                }
                m53272a();
            } else {
                MethodCollector.m26664o(13836);
                return -1;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(13837);
        if (this.f63606b == null) {
            MethodCollector.m26664o(13837);
            return -1;
        } else if (bArr == null) {
            MethodCollector.m26664o(13837);
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.m26664o(13837);
            throw indexOutOfBoundsException;
        } else if (i2 != 0) {
            do {
                int read = this.f63606b.read(bArr, i, i2);
                if (read > 0) {
                    MethodCollector.m26664o(13837);
                    return read;
                }
                m53272a();
            } while (this.f63606b != null);
            MethodCollector.m26664o(13837);
            return -1;
        } else {
            MethodCollector.m26664o(13837);
            return 0;
        }
    }
}
