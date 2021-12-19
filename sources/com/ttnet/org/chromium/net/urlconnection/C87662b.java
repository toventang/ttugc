package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87528aa;
import com.ttnet.org.chromium.net.AbstractC87678z;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.net.urlconnection.b */
public final class C87662b extends AbstractC87667e {

    /* renamed from: a */
    public final ExecutorC87668f f199136a;

    /* renamed from: b */
    public final ByteBuffer f199137b;

    /* renamed from: c */
    public boolean f199138c;

    /* renamed from: d */
    private final CronetHttpURLConnection f199139d;

    /* renamed from: e */
    private final AbstractC87678z f199140e = new C87663a(this, (byte) 0);

    static {
        Covode.recordClassIndex(103645);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: a */
    public final void mo142072a() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: b */
    public final void mo142073b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: c */
    public final AbstractC87678z mo142074c() {
        return this.f199140e;
    }

    /* renamed from: f */
    private void m152504f() {
        if (!this.f199137b.hasRemaining()) {
            m152505g();
        }
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f199138c) {
            this.f199138c = true;
            this.f199137b.flip();
        }
    }

    /* renamed from: g */
    private void m152505g() {
        mo142087d();
        this.f199137b.flip();
        m152503a(this.f199139d.getReadTimeout());
        mo142088e();
    }

    /* renamed from: com.ttnet.org.chromium.net.urlconnection.b$a */
    class C87663a extends AbstractC87678z {
        static {
            Covode.recordClassIndex(103646);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final long mo141927a() {
            return -1;
        }

        private C87663a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141928a(AbstractC87528aa aaVar) {
            aaVar.mo141684a(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        /* synthetic */ C87663a(C87662b bVar, byte b) {
            this();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141929a(AbstractC87528aa aaVar, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= C87662b.this.f199137b.remaining()) {
                byteBuffer.put(C87662b.this.f199137b);
                C87662b.this.f199137b.clear();
                aaVar.mo141685a(C87662b.this.f199138c);
                if (!C87662b.this.f199138c) {
                    C87662b.this.f199136a.mo142091b();
                    return;
                }
                return;
            }
            int limit = C87662b.this.f199137b.limit();
            C87662b.this.f199137b.limit(C87662b.this.f199137b.position() + byteBuffer.remaining());
            byteBuffer.put(C87662b.this.f199137b);
            C87662b.this.f199137b.limit(limit);
            aaVar.mo141685a(false);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        m152504f();
        this.f199137b.put((byte) i);
    }

    /* renamed from: a */
    private void m152503a(int i) {
        try {
            this.f199136a.mo142090a(i);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.f199139d;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.mo142040a();
                this.f199136a.mo142089a();
                this.f199136a.mo142090a(i / 2);
            }
        } catch (Exception e) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.f199139d;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.setException(new IOException("Unexpected request usage, caught in CronetChunkedOutputStream, caused by ".concat(String.valueOf(e))));
                this.f199136a.mo142089a();
                this.f199136a.mo142090a(i / 2);
            }
        }
    }

    C87662b(CronetHttpURLConnection cronetHttpURLConnection, int i, ExecutorC87668f fVar) {
        if (i > 0) {
            this.f199137b = ByteBuffer.allocate(i);
            this.f199139d = cronetHttpURLConnection;
            this.f199136a = fVar;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        mo142087d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.f199137b.remaining());
            this.f199137b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            m152504f();
        }
    }
}
