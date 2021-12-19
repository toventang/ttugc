package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.net.urlconnection.d */
public final class C87666d extends InputStream {

    /* renamed from: a */
    private final CronetHttpURLConnection f199152a;

    /* renamed from: b */
    private boolean f199153b;

    /* renamed from: c */
    private ByteBuffer f199154c;

    /* renamed from: d */
    private IOException f199155d;

    static {
        Covode.recordClassIndex(103649);
    }

    /* renamed from: b */
    private boolean m152524b() {
        ByteBuffer byteBuffer = this.f199154c;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        CronetHttpURLConnection cronetHttpURLConnection = this.f199152a;
        if (cronetHttpURLConnection != null) {
            cronetHttpURLConnection.disconnect();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        m152523a();
        if (m152524b()) {
            return this.f199154c.get() & 255;
        }
        return -1;
    }

    /* renamed from: a */
    private void m152523a() {
        if (this.f199153b) {
            IOException iOException = this.f199155d;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!m152524b()) {
            if (this.f199154c == null) {
                int i = 32768;
                if (this.f199152a.f199113k > 32768) {
                    i = this.f199152a.f199113k;
                }
                this.f199154c = ByteBuffer.allocateDirect(i);
            }
            this.f199154c.clear();
            this.f199152a.mo142041a(this.f199154c);
            IOException iOException2 = this.f199155d;
            if (iOException2 == null) {
                ByteBuffer byteBuffer = this.f199154c;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    public C87666d(CronetHttpURLConnection cronetHttpURLConnection) {
        MethodCollector.m26663i(3320);
        this.f199152a = cronetHttpURLConnection;
        MethodCollector.m26664o(3320);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo142082a(IOException iOException) {
        this.f199155d = iOException;
        this.f199153b = true;
        this.f199154c = null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            m152523a();
            if (!m152524b()) {
                return -1;
            }
            int min = Math.min(this.f199154c.limit() - this.f199154c.position(), i2);
            this.f199154c.get(bArr, i, min);
            return min;
        }
    }
}
