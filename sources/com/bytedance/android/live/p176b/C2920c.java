package com.bytedance.android.live.p176b;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89213f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89298d;
import p4600h.p4621l.C89304g;
import p4600h.p4621l.C89309k;
import p4600h.p4621l.C89319p;
import p4600h.p4621l.C89329r;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.b.c */
public final class C2920c implements AbstractC89196a, List<Object> {

    /* renamed from: a */
    public final C27919i f8669a;

    static {
        Covode.recordClassIndex(3359);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Object> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Object> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return C89213f.m154698a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C89213f.m154699a(this, tArr);
    }

    /* renamed from: com.bytedance.android.live.b.c$a */
    final class C2921a implements AbstractC89196a, ListIterator<Object> {

        /* renamed from: b */
        private int f8671b;

        /* renamed from: c */
        private int f8672c;

        static {
            Covode.recordClassIndex(3360);
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int nextIndex() {
            return this.f8672c;
        }

        public final boolean hasPrevious() {
            if (this.f8672c > 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f8672c - 1;
        }

        public final boolean hasNext() {
            if (this.f8672c < C2920c.this.f8669a.mo46684a()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, java.util.ListIterator
        public final Object next() {
            C27919i iVar = C2920c.this.f8669a;
            int i = this.f8672c;
            this.f8672c = i + 1;
            this.f8671b = i;
            AbstractC28019l a = iVar.mo46685a(i);
            if (a != null) {
                return C2940n.m8270b(a);
            }
            return null;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            C27919i iVar = C2920c.this.f8669a;
            int i = this.f8672c - 1;
            this.f8672c = i;
            this.f8671b = i;
            AbstractC28019l a = iVar.mo46685a(i);
            if (a != null) {
                return C2940n.m8270b(a);
            }
            return null;
        }

        public /* synthetic */ C2921a(C2920c cVar) {
            this(0);
        }

        public C2921a(int i) {
            this.f8672c = i;
            this.f8671b = -1;
        }
    }

    /* renamed from: com.bytedance.android.live.b.c$b */
    public static final class C2922b implements AbstractC89196a, Iterator<Object> {

        /* renamed from: a */
        final /* synthetic */ C2920c f8673a;

        /* renamed from: b */
        private final Iterator<AbstractC28019l> f8674b;

        static {
            Covode.recordClassIndex(3361);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f8674b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            AbstractC28019l next = this.f8674b.next();
            if (next != null) {
                return C2940n.m8270b(next);
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2922b(C2920c cVar) {
            this.f8673a = cVar;
            Iterator<AbstractC28019l> it = cVar.f8669a.iterator();
            C89219l.m154716b(it, "");
            this.f8674b = it;
        }
    }

    /* renamed from: a */
    private static <T> T m8216a() {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C2922b(this);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return new C2921a(this);
    }

    public final int size() {
        return this.f8669a.mo46684a();
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.b.c$d */
    static final class C2924d extends AbstractC89220m implements AbstractC89172b<AbstractC28019l, Object> {

        /* renamed from: a */
        public static final C2924d f8677a = new C2924d();

        static {
            Covode.recordClassIndex(3363);
        }

        C2924d() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(AbstractC28019l lVar) {
            AbstractC28019l lVar2 = lVar;
            if (lVar2 != null) {
                return C2940n.m8270b(lVar2);
            }
            return null;
        }
    }

    public C2920c(C27919i iVar) {
        C89219l.m154721d(iVar, "");
        this.f8669a = iVar;
    }

    public final boolean contains(Object obj) {
        return ((Boolean) m8216a()).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C89219l.m154721d(collection, "");
        return ((Boolean) m8216a()).booleanValue();
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC28019l a = this.f8669a.mo46685a(i);
        if (a != null) {
            return C2940n.m8270b(a);
        }
        return null;
    }

    public final int indexOf(Object obj) {
        return ((Number) m8216a()).intValue();
    }

    public final int lastIndexOf(Object obj) {
        return ((Number) m8216a()).intValue();
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return new C2921a(i);
    }

    /* renamed from: com.bytedance.android.live.b.c$c */
    static final class C2923c extends AbstractC89220m implements AbstractC89183m<Integer, AbstractC28019l, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f8675a;

        /* renamed from: b */
        final /* synthetic */ int f8676b;

        static {
            Covode.recordClassIndex(3362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2923c(int i, int i2) {
            super(2);
            this.f8675a = i;
            this.f8676b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(Integer num, AbstractC28019l lVar) {
            boolean z;
            int intValue = num.intValue();
            int i = this.f8676b;
            if (this.f8675a <= intValue && i > intValue) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // java.util.List
    public final List<Object> subList(int i, int i2) {
        Iterator<AbstractC28019l> it = this.f8669a.iterator();
        C89219l.m154716b(it, "");
        AbstractC89306h a = C89309k.m154795a(it);
        C2923c cVar = new C2923c(i, i2);
        C89219l.m154721d(a, "");
        C89219l.m154721d(cVar, "");
        return C89309k.m154813g(C89309k.m154810e(new C89329r(new C89298d(new C89304g(a), true, new C89319p.C89321b(cVar)), C89319p.C89322c.f202972a), C2924d.f8677a));
    }
}
