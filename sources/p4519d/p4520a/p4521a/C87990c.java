package p4519d.p4520a.p4521a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4601a.AbstractC89060f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.a.c */
public final class C87990c<E> extends AbstractC89060f<E> {

    /* renamed from: a */
    private final C87989b<E, Boolean> f199869a;

    static {
        Covode.recordClassIndex(104016);
    }

    private /* synthetic */ C87990c() {
        this(false);
    }

    public final void clear() {
        this.f199869a.clear();
    }

    @Override // p4600h.p4601a.AbstractC89060f
    /* renamed from: a */
    public final int mo142580a() {
        return this.f199869a.keySet().size();
    }

    public final boolean isEmpty() {
        return this.f199869a.keySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f199869a.keySet().iterator();
    }

    public C87990c(boolean z) {
        this.f199869a = new C87989b<>(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        return C89219l.m154714a((Object) this.f199869a.put(e, true), (Object) true);
    }

    public final boolean contains(Object obj) {
        return this.f199869a.keySet().contains(obj);
    }

    public final boolean remove(Object obj) {
        return C89219l.m154714a((Object) this.f199869a.remove(obj), (Object) true);
    }
}
