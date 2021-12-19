package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.t */
public final class C89439t implements AbstractC89425g {

    /* renamed from: a */
    public final C89420f f203122a = new C89420f();

    /* renamed from: b */
    public boolean f203123b;

    /* renamed from: c */
    public final AbstractC89447y f203124c;

    static {
        Covode.recordClassIndex(105523);
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final C89420f mo68846a() {
        return this.f203122a;
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        if (!this.f203123b) {
            this.f203122a.mo22060a(fVar, j);
            mo68853b();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: k.t$a */
    public static final class C89440a extends OutputStream {

        /* renamed from: a */
        final /* synthetic */ C89439t f203125a;

        static {
            Covode.recordClassIndex(105524);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f203125a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            if (!this.f203125a.f203123b) {
                this.f203125a.flush();
            }
        }

        public final String toString() {
            return this.f203125a + ".outputStream()";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89440a(C89439t tVar) {
            this.f203125a = tVar;
            MethodCollector.m26663i(3531);
            MethodCollector.m26664o(3531);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            if (!this.f203125a.f203123b) {
                this.f203125a.f203122a.mo68847a((int) ((byte) i));
                this.f203125a.mo68853b();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            C89219l.m154719c(bArr, "");
            if (!this.f203125a.f203123b) {
                this.f203125a.f203122a.mo68852a(bArr, i, i2);
                this.f203125a.mo68853b();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: d */
    public final OutputStream mo68859d() {
        return new C89440a(this);
    }

    public final boolean isOpen() {
        if (!this.f203123b) {
            return true;
        }
        return false;
    }

    @Override // p4632k.AbstractC89447y
    public final C89409ab timeout() {
        return this.f203124c.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f203124c + ')';
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final AbstractC89425g mo68853b() {
        if (!this.f203123b) {
            long g = this.f203122a.mo143821g();
            if (g > 0) {
                this.f203124c.mo22060a(this.f203122a, g);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final AbstractC89425g mo68856c() {
        if (!this.f203123b) {
            long j = this.f203122a.f203091b;
            if (j > 0) {
                this.f203124c.mo22060a(this.f203122a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, p4632k.AbstractC89447y, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f203123b) {
            Throwable th = null;
            try {
                if (this.f203122a.f203091b > 0) {
                    AbstractC89447y yVar = this.f203124c;
                    C89420f fVar = this.f203122a;
                    yVar.mo22060a(fVar, fVar.f203091b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f203124c.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f203123b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // p4632k.AbstractC89425g, p4632k.AbstractC89447y, java.io.Flushable
    public final void flush() {
        if (!this.f203123b) {
            if (this.f203122a.f203091b > 0) {
                AbstractC89447y yVar = this.f203124c;
                C89420f fVar = this.f203122a;
                yVar.mo22060a(fVar, fVar.f203091b);
            }
            this.f203124c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C89439t(AbstractC89447y yVar) {
        C89219l.m154719c(yVar, "");
        this.f203124c = yVar;
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final long mo68845a(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        long j = 0;
        while (true) {
            long read = aaVar.read(this.f203122a, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo68853b();
        }
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final AbstractC89425g mo68854b(int i) {
        if (!this.f203123b) {
            this.f203122a.mo68854b(i);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final AbstractC89425g mo68857c(int i) {
        if (!this.f203123b) {
            this.f203122a.mo68857c(i);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: d */
    public final AbstractC89425g mo68860d(int i) {
        if (!this.f203123b) {
            this.f203122a.mo68860d(i);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68847a(int i) {
        if (!this.f203123b) {
            this.f203122a.mo68847a(i);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        C89219l.m154719c(byteBuffer, "");
        if (!this.f203123b) {
            int write = this.f203122a.write(byteBuffer);
            mo68853b();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68848a(long j) {
        if (!this.f203123b) {
            this.f203122a.mo68848a(j);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final AbstractC89425g mo68855b(long j) {
        if (!this.f203123b) {
            this.f203122a.mo68855b(j);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final AbstractC89425g mo68858c(long j) {
        if (!this.f203123b) {
            this.f203122a.mo68858c(j);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68849a(String str) {
        C89219l.m154719c(str, "");
        if (!this.f203123b) {
            this.f203122a.mo68849a(str);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68850a(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        if (!this.f203123b) {
            this.f203122a.mo68850a(iVar);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68851a(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        if (!this.f203123b) {
            this.f203122a.mo68851a(bArr);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68852a(byte[] bArr, int i, int i2) {
        C89219l.m154719c(bArr, "");
        if (!this.f203123b) {
            this.f203122a.mo68852a(bArr, i, i2);
            return mo68853b();
        }
        throw new IllegalStateException("closed".toString());
    }
}
