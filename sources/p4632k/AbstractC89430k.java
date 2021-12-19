package p4632k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.k */
public abstract class AbstractC89430k implements AbstractC89447y {

    /* renamed from: d */
    public final AbstractC89447y f203107d;

    static {
        Covode.recordClassIndex(105514);
    }

    @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f203107d.close();
    }

    @Override // p4632k.AbstractC89447y, java.io.Flushable
    public void flush() {
        this.f203107d.flush();
    }

    @Override // p4632k.AbstractC89447y
    public C89409ab timeout() {
        return this.f203107d.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f203107d + ')';
    }

    public AbstractC89430k(AbstractC89447y yVar) {
        C89219l.m154719c(yVar, "");
        this.f203107d = yVar;
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public void mo22060a(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        this.f203107d.mo22060a(fVar, j);
    }
}
