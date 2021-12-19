package com.bytedance.android.live.core.p210a.p211a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.android.live.core.a.a.c */
final class C3836c implements Closeable {

    /* renamed from: a */
    public final Charset f10608a;

    /* renamed from: b */
    int f10609b;

    /* renamed from: c */
    private final InputStream f10610c;

    /* renamed from: d */
    private byte[] f10611d;

    /* renamed from: e */
    private int f10612e;

    static {
        Covode.recordClassIndex(4365);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.m26663i(12789);
        synchronized (this.f10610c) {
            try {
                if (this.f10611d != null) {
                    this.f10611d = null;
                    this.f10610c.close();
                }
            } finally {
                MethodCollector.m26664o(12789);
            }
        }
    }

    /* renamed from: b */
    private void m9414b() {
        MethodCollector.m26663i(12964);
        InputStream inputStream = this.f10610c;
        byte[] bArr = this.f10611d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f10612e = 0;
            this.f10609b = read;
            MethodCollector.m26664o(12964);
            return;
        }
        EOFException eOFException = new EOFException();
        MethodCollector.m26664o(12964);
        throw eOFException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1[r5] == 13) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo9197a() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p210a.p211a.C3836c.mo9197a():java.lang.String");
    }

    public C3836c(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private C3836c(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(C3835b.f10606a)) {
            this.f10610c = inputStream;
            this.f10608a = charset;
            this.f10611d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
