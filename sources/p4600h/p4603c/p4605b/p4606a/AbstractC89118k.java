package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.AbstractC89215h;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.b.a.k */
public abstract class AbstractC89118k extends AbstractC89110d implements AbstractC89215h<Object> {
    private final int arity;

    static {
        Covode.recordClassIndex(105202);
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89215h
    public int getArity() {
        return this.arity;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a = C89204ab.m154671a(this);
        C89219l.m154716b(a, "");
        return a;
    }

    public AbstractC89118k(int i) {
        this(i, null);
    }

    public AbstractC89118k(int i, AbstractC89124d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }
}
