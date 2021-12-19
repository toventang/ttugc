package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.af */
public abstract class AbstractC89040af implements AbstractC89196a, Iterator<Integer> {
    static {
        Covode.recordClassIndex(105124);
    }

    /* renamed from: a */
    public abstract int mo143429a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(mo143429a());
    }
}
