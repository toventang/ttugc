package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;

/* renamed from: h.a.al */
public final class C89046al<T> extends AbstractC89059e<T> {

    /* renamed from: a */
    private final List<T> f202771a;

    static {
        Covode.recordClassIndex(105130);
    }

    @Override // p4600h.p4601a.AbstractC89059e
    /* renamed from: a */
    public final int mo143432a() {
        return this.f202771a.size();
    }

    public final void clear() {
        this.f202771a.clear();
    }

    public C89046al(List<T> list) {
        C89219l.m154721d(list, "");
        this.f202771a = list;
    }

    @Override // p4600h.p4601a.AbstractC89059e
    /* renamed from: a */
    public final T mo143433a(int i) {
        return this.f202771a.remove(C89079v.m154542a((List<?>) this, i));
    }

    @Override // java.util.List, java.util.AbstractList
    public final T get(int i) {
        return this.f202771a.get(C89079v.m154542a((List<?>) this, i));
    }

    @Override // java.util.List, java.util.AbstractList
    public final T set(int i, T t) {
        return this.f202771a.set(C89079v.m154542a((List<?>) this, i), t);
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i, T t) {
        List<T> list = this.f202771a;
        int size = size();
        if (i < 0 || size < i) {
            throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C89269g(0, size()) + "].");
        }
        list.add(size() - i, t);
    }
}
