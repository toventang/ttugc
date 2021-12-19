package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89207b;
import p4600h.p4611f.p4613b.C89213f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.g */
final class C89061g<T> implements AbstractC89196a, Collection<T> {

    /* renamed from: a */
    public final T[] f202787a;

    /* renamed from: b */
    public final boolean f202788b;

    static {
        Covode.recordClassIndex(105145);
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C89213f.m154699a(this, tArr);
    }

    public final /* bridge */ int size() {
        return this.f202787a.length;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return C89207b.m154693a(this.f202787a);
    }

    public final boolean isEmpty() {
        if (this.f202787a.length == 0) {
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        T[] tArr = this.f202787a;
        boolean z = this.f202788b;
        C89219l.m154721d(tArr, "");
        if (z && C89219l.m154714a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C89219l.m154716b(copyOf, "");
        return copyOf;
    }

    public final boolean contains(Object obj) {
        return C89064i.m154489a(this.f202787a, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C89219l.m154721d(collection, "");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public C89061g(T[] tArr, boolean z) {
        C89219l.m154721d(tArr, "");
        this.f202787a = tArr;
        this.f202788b = z;
    }
}
