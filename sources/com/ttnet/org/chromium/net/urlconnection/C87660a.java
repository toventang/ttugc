package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87528aa;
import com.ttnet.org.chromium.net.AbstractC87678z;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.net.urlconnection.a */
public final class C87660a extends AbstractC87667e {

    /* renamed from: a */
    public final int f199130a;

    /* renamed from: b */
    public ByteBuffer f199131b;

    /* renamed from: c */
    public boolean f199132c;

    /* renamed from: d */
    private final CronetHttpURLConnection f199133d;

    /* renamed from: e */
    private final AbstractC87678z f199134e = new C87661a(this, (byte) 0);

    static {
        Covode.recordClassIndex(103643);
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
        return this.f199134e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.AbstractC87667e
    /* renamed from: a */
    public final void mo142072a() {
        this.f199132c = true;
        if (this.f199131b.position() >= this.f199130a) {
            this.f199131b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    /* renamed from: com.ttnet.org.chromium.net.urlconnection.a$a */
    class C87661a extends AbstractC87678z {
        static {
            Covode.recordClassIndex(103644);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final long mo141927a() {
            int i;
            if (C87660a.this.f199130a != -1) {
                i = C87660a.this.f199130a;
            } else if (C87660a.this.f199132c) {
                i = C87660a.this.f199131b.limit();
            } else {
                i = C87660a.this.f199131b.position();
            }
            return (long) i;
        }

        private C87661a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141928a(AbstractC87528aa aaVar) {
            C87660a.this.f199131b.position(0);
            aaVar.mo141683a();
        }

        /* synthetic */ C87661a(C87660a aVar, byte b) {
            this();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87678z
        /* renamed from: a */
        public final void mo141929a(AbstractC87528aa aaVar, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < C87660a.this.f199131b.remaining()) {
                byteBuffer.put(C87660a.this.f199131b.array(), C87660a.this.f199131b.position(), remaining);
                C87660a.this.f199131b.position(C87660a.this.f199131b.position() + remaining);
            } else {
                byteBuffer.put(C87660a.this.f199131b);
            }
            aaVar.mo141685a(false);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        mo142087d();
        m152496a(1);
        this.f199131b.put((byte) i);
    }

    C87660a(CronetHttpURLConnection cronetHttpURLConnection) {
        this.f199133d = cronetHttpURLConnection;
        this.f199130a = -1;
        this.f199131b = ByteBuffer.allocate(16384);
    }

    /* renamed from: a */
    private void m152496a(int i) {
        if (this.f199130a != -1 && this.f199131b.position() + i > this.f199130a) {
            throw new ProtocolException("exceeded content-length limit of " + this.f199130a + " bytes");
        } else if (this.f199132c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.f199130a == -1 && this.f199131b.limit() - this.f199131b.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.f199131b.capacity() * 2, this.f199131b.capacity() + i));
            this.f199131b.flip();
            allocate.put(this.f199131b);
            this.f199131b = allocate;
        }
    }

    C87660a(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            this.f199133d = cronetHttpURLConnection;
            int i = (int) j;
            this.f199130a = i;
            this.f199131b = ByteBuffer.allocate(i);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        mo142087d();
        m152496a(i2);
        this.f199131b.put(bArr, i, i2);
    }
}
