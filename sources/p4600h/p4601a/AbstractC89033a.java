package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89213f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.a */
public abstract class AbstractC89033a<E> implements AbstractC89196a, Collection<E> {
    static {
        Covode.recordClassIndex(105117);
    }

    /* renamed from: a */
    public abstract int mo143374a();

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return mo143374a();
    }

    public Object[] toArray() {
        return C89213f.m154698a(this);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C89070n.m154551a(this, ", ", "[", "]", 0, (CharSequence) null, new C89034a(this), 24);
    }

    /* renamed from: h.a.a$a */
    static final class C89034a extends AbstractC89220m implements AbstractC89172b<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89033a f202764a;

        static {
            Covode.recordClassIndex(105118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89034a(AbstractC89033a aVar) {
            super(1);
            this.f202764a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(Object obj) {
            if (obj == this.f202764a) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C89219l.m154721d(tArr, "");
        T[] tArr2 = (T[]) C89213f.m154699a(this, tArr);
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<T>");
        return tArr2;
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (E e : this) {
            if (C89219l.m154714a((Object) e, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
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
}
