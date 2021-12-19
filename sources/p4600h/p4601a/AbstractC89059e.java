package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.List;
import p4600h.p4611f.p4613b.p4614a.AbstractC89200e;

/* renamed from: h.a.e */
public abstract class AbstractC89059e<E> extends AbstractList<E> implements AbstractC89200e, List<E> {
    static {
        Covode.recordClassIndex(105143);
    }

    /* renamed from: a */
    public abstract int mo143432a();

    /* renamed from: a */
    public abstract E mo143433a(int i);

    protected AbstractC89059e() {
    }

    public final int size() {
        return mo143432a();
    }

    @Override // java.util.List, java.util.AbstractList
    public final E remove(int i) {
        return mo143433a(i);
    }
}
