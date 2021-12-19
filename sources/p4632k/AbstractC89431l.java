package p4632k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.l */
public abstract class AbstractC89431l implements AbstractC89408aa {
    public final AbstractC89408aa delegate;

    static {
        Covode.recordClassIndex(105515);
    }

    @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // p4632k.AbstractC89408aa
    public C89409ab timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public AbstractC89431l(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        this.delegate = aaVar;
    }

    @Override // p4632k.AbstractC89408aa
    public long read(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        return this.delegate.read(fVar, j);
    }
}
