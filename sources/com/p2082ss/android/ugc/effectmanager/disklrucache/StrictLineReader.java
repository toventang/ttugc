package com.p2082ss.android.ugc.effectmanager.disklrucache;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.disklrucache.StrictLineReader */
public class StrictLineReader implements Closeable {
    private byte[] buf;
    public final Charset charset;
    private int end;

    /* renamed from: in */
    private final InputStream f183431in;
    private int pos;

    static {
        Covode.recordClassIndex(95537);
    }

    public boolean hasUnterminatedLine() {
        if (this.end == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MethodCollector.m26663i(1220);
        synchronized (this.f183431in) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.f183431in.close();
                }
            } finally {
                MethodCollector.m26664o(1220);
            }
        }
    }

    private void fillBuf() {
        MethodCollector.m26663i(1347);
        InputStream inputStream = this.f183431in;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.pos = 0;
            this.end = read;
            MethodCollector.m26664o(1347);
            return;
        }
        EOFException eOFException = new EOFException();
        MethodCollector.m26664o(1347);
        throw eOFException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1[r5] == 13) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String readLine() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.disklrucache.StrictLineReader.readLine():java.lang.String");
    }

    public StrictLineReader(InputStream inputStream, Charset charset2) {
        this(inputStream, 8192, charset2);
    }

    public StrictLineReader(InputStream inputStream, int i, Charset charset2) {
        if (inputStream == null || charset2 == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset2.equals(Util.US_ASCII)) {
            this.f183431in = inputStream;
            this.charset = charset2;
            this.buf = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
