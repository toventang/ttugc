package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: h.f.b.m */
public abstract class AbstractC89220m<R> implements AbstractC89215h<R>, Serializable {
    private final int arity;

    static {
        Covode.recordClassIndex(105304);
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89215h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a = C89204ab.m154671a(this);
        C89219l.m154716b(a, "");
        return a;
    }

    public AbstractC89220m(int i) {
        this.arity = i;
    }
}
