package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.y */
public final class C89085y implements AbstractC89196a, ListIterator {

    /* renamed from: a */
    public static final C89085y f202799a = new C89085y();

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C89085y() {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }

    static {
        Covode.recordClassIndex(105169);
    }
}
