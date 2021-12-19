package p4632k;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.o */
public final class C89434o implements AbstractC89408aa {

    /* renamed from: a */
    private int f203114a;

    /* renamed from: b */
    private boolean f203115b;

    /* renamed from: c */
    private final AbstractC89426h f203116c;

    /* renamed from: d */
    private final Inflater f203117d;

    static {
        Covode.recordClassIndex(105518);
    }

    @Override // p4632k.AbstractC89408aa
    public final C89409ab timeout() {
        return this.f203116c.timeout();
    }

    /* renamed from: b */
    private final void m155156b() {
        int i = this.f203114a;
        if (i != 0) {
            int remaining = i - this.f203117d.getRemaining();
            this.f203114a -= remaining;
            this.f203116c.mo143838l((long) remaining);
        }
    }

    @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f203115b) {
            this.f203117d.end();
            this.f203115b = true;
            this.f203116c.close();
        }
    }

    /* renamed from: a */
    public final boolean mo143927a() {
        if (!this.f203117d.needsInput()) {
            return false;
        }
        m155156b();
        if (this.f203117d.getRemaining() != 0) {
            throw new IllegalStateException("?".toString());
        } else if (this.f203116c.mo143815e()) {
            return true;
        } else {
            C89443v vVar = this.f203116c.mo68846a().f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            this.f203114a = vVar.f203133c - vVar.f203132b;
            this.f203117d.setInput(vVar.f203131a, vVar.f203132b, this.f203114a);
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C89434o(AbstractC89408aa aaVar, Inflater inflater) {
        this(C89436q.m155160a(aaVar), inflater);
        C89219l.m154719c(aaVar, "");
        C89219l.m154719c(inflater, "");
    }

    public C89434o(AbstractC89426h hVar, Inflater inflater) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(inflater, "");
        this.f203116c = hVar;
        this.f203117d = inflater;
    }

    @Override // p4632k.AbstractC89408aa
    public final long read(C89420f fVar, long j) {
        C89443v j2;
        C89219l.m154719c(fVar, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        } else if (!(!this.f203115b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo143927a();
                try {
                    j2 = fVar.mo143834j(1);
                    int inflate = this.f203117d.inflate(j2.f203131a, j2.f203133c, (int) Math.min(j, (long) (8192 - j2.f203133c)));
                    if (inflate > 0) {
                        j2.f203133c += inflate;
                        long j3 = (long) inflate;
                        fVar.f203091b += j3;
                        return j3;
                    } else if (this.f203117d.finished() || this.f203117d.needsDictionary()) {
                        m155156b();
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m155156b();
            if (j2.f203132b != j2.f203133c) {
                return -1;
            }
            fVar.f203090a = j2.mo143952c();
            C89445w.m155223a(j2);
            return -1;
        }
    }
}
