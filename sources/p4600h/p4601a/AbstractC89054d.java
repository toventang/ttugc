package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.d */
public abstract class AbstractC89054d<E> extends AbstractC89033a<E> implements List<E> {

    /* renamed from: a */
    public static final C89055a f202780a = new C89055a((byte) 0);

    static {
        Covode.recordClassIndex(105138);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: h.a.d$a */
    public static final class C89055a {
        static {
            Covode.recordClassIndex(105139);
        }

        private C89055a() {
        }

        public /* synthetic */ C89055a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m154445a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public static void m154446b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }
    }

    /* renamed from: h.a.d$c */
    class C89057c extends AbstractC89054d<E>.C89056b implements ListIterator<E> {
        static {
            Covode.recordClassIndex(105141);
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int nextIndex() {
            return this.f202781a;
        }

        public final boolean hasPrevious() {
            if (this.f202781a > 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f202781a - 1;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                this.f202781a--;
                return (E) AbstractC89054d.this.get(this.f202781a);
            }
            throw new NoSuchElementException();
        }

        public C89057c(int i) {
            super();
            C89055a.m154446b(i, AbstractC89054d.this.size());
            this.f202781a = i;
        }
    }

    /* renamed from: h.a.d$d */
    static final class C89058d<E> extends AbstractC89054d<E> implements RandomAccess {

        /* renamed from: b */
        private int f202784b;

        /* renamed from: c */
        private final AbstractC89054d<E> f202785c;

        /* renamed from: d */
        private final int f202786d;

        static {
            Covode.recordClassIndex(105142);
        }

        @Override // p4600h.p4601a.AbstractC89033a
        /* renamed from: a */
        public final int mo143374a() {
            return this.f202784b;
        }

        @Override // java.util.List, p4600h.p4601a.AbstractC89054d
        public final E get(int i) {
            C89055a.m154445a(i, this.f202784b);
            return this.f202785c.get(this.f202786d + i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.a.d<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public C89058d(AbstractC89054d<? extends E> dVar, int i, int i2) {
            C89219l.m154721d(dVar, "");
            this.f202785c = dVar;
            this.f202786d = i;
            int size = dVar.size();
            if (i < 0 || i2 > size) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + size);
            } else if (i <= i2) {
                this.f202784b = i2 - i;
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C89056b();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C89057c(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.a.d$b */
    public class C89056b implements AbstractC89196a, Iterator<E> {

        /* renamed from: a */
        public int f202781a;

        static {
            Covode.recordClassIndex(105140);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f202781a < AbstractC89054d.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractC89054d dVar = AbstractC89054d.this;
                int i = this.f202781a;
                this.f202781a = i + 1;
                return (E) dVar.get(i);
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C89056b() {
        }
    }

    public int hashCode() {
        int i;
        C89219l.m154721d(this, "");
        int i2 = 1;
        for (E e : this) {
            int i3 = i2 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C89057c(i);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (E e : this) {
            if (C89219l.m154714a((Object) e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C89219l.m154714a((Object) listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C89219l.m154721d(this, "");
        C89219l.m154721d(collection, "");
        if (size() != collection.size()) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        for (E e : this) {
            if (!C89219l.m154714a((Object) e, (Object) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new C89058d(this, i, i2);
    }
}
