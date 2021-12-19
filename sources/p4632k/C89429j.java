package p4632k;

import com.bytedance.covode.number.Covode;
import java.util.zip.Deflater;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.j */
public final class C89429j implements AbstractC89447y {

    /* renamed from: a */
    private boolean f203104a;

    /* renamed from: b */
    private final AbstractC89425g f203105b;

    /* renamed from: c */
    private final Deflater f203106c;

    static {
        Covode.recordClassIndex(105513);
    }

    @Override // p4632k.AbstractC89447y
    public final C89409ab timeout() {
        return this.f203105b.timeout();
    }

    /* renamed from: a */
    private void m155141a() {
        this.f203106c.finish();
        m155142a(false);
    }

    @Override // p4632k.AbstractC89447y, java.io.Flushable
    public final void flush() {
        m155142a(true);
        this.f203105b.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f203105b + ')';
    }

    @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f203104a) {
            Throwable th = null;
            try {
                m155141a();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f203106c.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f203105b.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f203104a = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final void m155142a(boolean z) {
        C89443v j;
        int deflate;
        C89420f a = this.f203105b.mo68846a();
        while (true) {
            j = a.mo143834j(1);
            if (z) {
                deflate = this.f203106c.deflate(j.f203131a, j.f203133c, 8192 - j.f203133c, 2);
            } else {
                deflate = this.f203106c.deflate(j.f203131a, j.f203133c, 8192 - j.f203133c);
            }
            if (deflate > 0) {
                j.f203133c += deflate;
                a.f203091b += (long) deflate;
                this.f203105b.mo68853b();
            } else if (this.f203106c.needsInput()) {
                break;
            }
        }
        if (j.f203132b == j.f203133c) {
            a.f203090a = j.mo143952c();
            C89445w.m155223a(j);
        }
    }

    private C89429j(AbstractC89425g gVar, Deflater deflater) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(deflater, "");
        this.f203105b = gVar;
        this.f203106c = deflater;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C89429j(AbstractC89447y yVar, Deflater deflater) {
        this(C89436q.m155159a(yVar), deflater);
        C89219l.m154719c(yVar, "");
        C89219l.m154719c(deflater, "");
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        long j2 = j;
        C89219l.m154719c(fVar, "");
        C89413c.m155000a(fVar.f203091b, 0, j2);
        while (j2 > 0) {
            C89443v vVar = fVar.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            int min = (int) Math.min(j2, (long) (vVar.f203133c - vVar.f203132b));
            this.f203106c.setInput(vVar.f203131a, vVar.f203132b, min);
            m155142a(false);
            long j3 = (long) min;
            fVar.f203091b -= j3;
            vVar.f203132b += min;
            if (vVar.f203132b == vVar.f203133c) {
                fVar.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            }
            j2 -= j3;
        }
    }
}
