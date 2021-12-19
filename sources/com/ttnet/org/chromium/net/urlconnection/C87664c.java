package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87528aa;
import com.ttnet.org.chromium.net.AbstractC87678z;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.net.urlconnection.c */
public final class C87664c extends AbstractC87667e {

    /* renamed from: f */
    private static int f199142f = 16384;

    /* renamed from: a */
    public final ExecutorC87668f f199143a;

    /* renamed from: b */
    public final long f199144b;

    /* renamed from: c */
    public final ByteBuffer f199145c;

    /* renamed from: d */
    public boolean f199146d;

    /* renamed from: e */
    public boolean f199147e;

    /* renamed from: g */
    private final CronetHttpURLConnection f199148g;

    /* renamed from: h */
    private final AbstractC87678z f199149h = new C87665a(this, (byte) 0);

    /* renamed from: i */
    private long f199150i;

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: a */
    public final void mo142072a() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: c */
    public final AbstractC87678z mo142074c() {
        return this.f199149h;
    }

    /* renamed from: com.ttnet.org.chromium.net.urlconnection.c$a */
    class C87665a extends AbstractC87678z {
        static {
            Covode.recordClassIndex(103648);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final long mo141927a() {
            return C87664c.this.f199144b;
        }

        private C87665a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141928a(AbstractC87528aa aaVar) {
            if (C87664c.this.f199146d) {
                C87664c.this.f199147e = true;
                C87664c.this.f199145c.rewind();
                aaVar.mo141683a();
                return;
            }
            aaVar.mo141684a(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        /* synthetic */ C87665a(C87664c cVar, byte b) {
            this();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141929a(AbstractC87528aa aaVar, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= C87664c.this.f199145c.remaining()) {
                byteBuffer.put(C87664c.this.f199145c);
                C87664c.this.f199145c.clear();
                aaVar.mo141685a(false);
                if (!C87664c.this.f199147e) {
                    C87664c.this.f199143a.mo142091b();
                    return;
                }
                return;
            }
            int limit = C87664c.this.f199145c.limit();
            C87664c.this.f199145c.limit(C87664c.this.f199145c.position() + byteBuffer.remaining());
            byteBuffer.put(C87664c.this.f199145c);
            C87664c.this.f199145c.limit(limit);
            aaVar.mo141685a(false);
        }
    }

    static {
        Covode.recordClassIndex(103647);
    }

    /* renamed from: f */
    private void m152514f() {
        if (!this.f199145c.hasRemaining()) {
            this.f199146d = false;
            m152516h();
        }
    }

    /* renamed from: g */
    private void m152515g() {
        if (this.f199150i == this.f199144b) {
            m152516h();
        }
    }

    /* renamed from: h */
    private void m152516h() {
        mo142087d();
        this.f199145c.flip();
        m152512a(this.f199148g.getReadTimeout());
        mo142088e();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: b */
    public final void mo142073b() {
        if (this.f199150i < this.f199144b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        mo142087d();
        m152513b(1);
        m152514f();
        this.f199145c.put((byte) i);
        this.f199150i++;
        m152515g();
    }

    /* renamed from: a */
    private void m152512a(int i) {
        try {
            this.f199143a.mo142090a(i);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.f199148g;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.mo142040a();
                this.f199143a.mo142089a();
                this.f199143a.mo142090a(i / 2);
            }
        } catch (Exception e) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.f199148g;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.setException(new IOException("Unexpected request usage, caught in CronetFixedModeOutputStream, caused by ".concat(String.valueOf(e))));
                this.f199143a.mo142089a();
                this.f199143a.mo142090a(i / 2);
            }
        }
    }

    /* renamed from: b */
    private void m152513b(int i) {
        if (this.f199150i + ((long) i) > this.f199144b) {
            throw new ProtocolException("expected " + (this.f199144b - this.f199150i) + " bytes but received " + i);
        }
    }

    C87664c(CronetHttpURLConnection cronetHttpURLConnection, long j, ExecutorC87668f fVar) {
        if (j >= 0) {
            this.f199144b = j;
            this.f199145c = ByteBuffer.allocate((int) Math.min(j, (long) f199142f));
            this.f199148g = cronetHttpURLConnection;
            this.f199143a = fVar;
            this.f199150i = 0;
            this.f199146d = true;
            this.f199147e = false;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        mo142087d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        m152513b(i2);
        int i3 = i2;
        while (i3 > 0) {
            m152514f();
            int min = Math.min(i3, this.f199145c.remaining());
            this.f199145c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.f199150i += (long) i2;
        m152515g();
    }
}
