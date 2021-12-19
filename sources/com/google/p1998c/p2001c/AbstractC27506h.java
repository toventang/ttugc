package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.C27440av;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.c.c.h */
public abstract class AbstractC27506h<E> extends AbstractCollection<E> implements AbstractC27438au<E> {

    /* renamed from: a */
    private transient Set<E> f64847a;

    /* renamed from: b */
    private transient Set<AbstractC27438au.AbstractC27439a<E>> f64848b;

    static {
        Covode.recordClassIndex(33086);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Iterator<E> mo45773a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Iterator<AbstractC27438au.AbstractC27439a<E>> mo45774b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo45775c();

    public abstract void clear();

    /* renamed from: com.google.c.c.h$a */
    class C27507a extends C27440av.AbstractC27442b<E> {
        static {
            Covode.recordClassIndex(33087);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.C27440av.AbstractC27442b
        /* renamed from: a */
        public final AbstractC27438au<E> mo45785a() {
            return AbstractC27506h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<E> iterator() {
            return AbstractC27506h.this.mo45773a();
        }

        C27507a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.h$b */
    public class C27508b extends C27440av.AbstractC27443c<E> {
        static {
            Covode.recordClassIndex(33088);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.C27440av.AbstractC27443c
        /* renamed from: a */
        public final AbstractC27438au<E> mo45792a() {
            return AbstractC27506h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<AbstractC27438au.AbstractC27439a<E>> iterator() {
            return AbstractC27506h.this.mo45774b();
        }

        public final int size() {
            return AbstractC27506h.this.mo45775c();
        }

        C27508b() {
        }
    }

    AbstractC27506h() {
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public Set<E> elementSet() {
        Set<E> set = this.f64847a;
        if (set != null) {
            return set;
        }
        C27507a aVar = new C27507a();
        this.f64847a = aVar;
        return aVar;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public Set<AbstractC27438au.AbstractC27439a<E>> entrySet() {
        Set<AbstractC27438au.AbstractC27439a<E>> set = this.f64848b;
        if (set != null) {
            return set;
        }
        C27508b bVar = new C27508b();
        this.f64848b = bVar;
        return bVar;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final String toString() {
        return entrySet().toString();
    }

    public final boolean equals(Object obj) {
        return C27440av.m54853a(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final boolean remove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof AbstractC27438au) {
            collection = ((AbstractC27438au) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        C27245k.m54229a(collection);
        if (collection instanceof AbstractC27438au) {
            collection = ((AbstractC27438au) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        C27245k.m54229a(this);
        C27245k.m54229a(collection);
        if (collection instanceof AbstractC27438au) {
            AbstractC27438au auVar = (AbstractC27438au) collection;
            if (auVar instanceof AbstractC27500e) {
                AbstractC27500e eVar = (AbstractC27500e) auVar;
                if (eVar.isEmpty()) {
                    return false;
                }
                C27245k.m54229a(this);
                for (int a = eVar.f64837a.mo45802a(); a >= 0; a = eVar.f64837a.mo45803a(a)) {
                    add(eVar.f64837a.mo45809b(a), eVar.f64837a.mo45810c(a));
                }
                return true;
            } else if (auVar.isEmpty()) {
                return false;
            } else {
                for (AbstractC27438au.AbstractC27439a<E> aVar : auVar.entrySet()) {
                    add(aVar.mo45778a(), aVar.mo45779b());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return C27397an.m54801a(this, collection.iterator());
        }
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public int setCount(E e, int i) {
        C27511k.m54993a(i, "count");
        int count = count(e);
        int i2 = i - count;
        if (i2 > 0) {
            add(e, i2);
        } else if (i2 < 0) {
            remove(e, -i2);
        }
        return count;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public boolean setCount(E e, int i, int i2) {
        C27511k.m54993a(i, "oldCount");
        C27511k.m54993a(i2, "newCount");
        if (count(e) != i) {
            return false;
        }
        setCount(e, i2);
        return true;
    }
}
