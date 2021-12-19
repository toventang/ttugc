package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.AbstractC89215h;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.b.a.j */
public abstract class AbstractC89117j extends AbstractC89116i implements AbstractC89215h<Object> {

    /* renamed from: a */
    private final int f202832a;

    static {
        Covode.recordClassIndex(105201);
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89215h
    public int getArity() {
        return this.f202832a;
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

    public AbstractC89117j(int i) {
        this(i, null);
    }

    public AbstractC89117j(int i, AbstractC89124d<Object> dVar) {
        super(dVar);
        this.f202832a = i;
    }
}
