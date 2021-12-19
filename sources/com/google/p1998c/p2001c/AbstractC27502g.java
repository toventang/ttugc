package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.C27432at;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.c.c.g */
public abstract class AbstractC27502g<K, V> implements AbstractC27422ar<K, V> {

    /* renamed from: a */
    private transient Collection<Map.Entry<K, V>> f64839a;

    /* renamed from: b */
    private transient Set<K> f64840b;

    /* renamed from: c */
    private transient AbstractC27438au<K> f64841c;

    /* renamed from: d */
    private transient Collection<V> f64842d;

    /* renamed from: e */
    private transient Map<K, Collection<V>> f64843e;

    static {
        Covode.recordClassIndex(33082);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo45602d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Collection<V> mo45603e();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract AbstractC27438au<K> mo45607g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection<Map.Entry<K, V>> mo45608h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Iterator<Map.Entry<K, V>> mo45610i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract Map<K, Collection<V>> mo45612j();

    /* renamed from: com.google.c.c.g$a */
    class C27503a extends C27432at.AbstractC27434b<K, V> {
        static {
            Covode.recordClassIndex(33083);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.C27432at.AbstractC27434b
        /* renamed from: a */
        public final AbstractC27422ar<K, V> mo45768a() {
            return AbstractC27502g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC27502g.this.mo45610i();
        }

        C27503a() {
        }
    }

    AbstractC27502g() {
    }

    /* renamed from: com.google.c.c.g$b */
    class C27504b extends AbstractC27502g<K, V>.C27503a implements Set<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33084);
        }

        public final int hashCode() {
            return C27471bk.m54928a(this);
        }

        C27504b() {
            super();
        }

        public final boolean equals(Object obj) {
            return C27471bk.m54930a(this, obj);
        }
    }

    /* renamed from: com.google.c.c.g$c */
    class C27505c extends AbstractCollection<V> {
        static {
            Covode.recordClassIndex(33085);
        }

        public final void clear() {
            AbstractC27502g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return AbstractC27502g.this.mo45606f();
        }

        public final int size() {
            return AbstractC27502g.this.size();
        }

        C27505c() {
        }

        public final boolean contains(Object obj) {
            return AbstractC27502g.this.containsValue(obj);
        }
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f64843e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> j = mo45612j();
        this.f64843e = j;
        return j;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f64839a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> h = mo45608h();
        this.f64839a = h;
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Iterator<V> mo45606f() {
        return C27412aq.m54819b(entries().iterator());
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public Set<K> keySet() {
        Set<K> set = this.f64840b;
        if (set != null) {
            return set;
        }
        Set<K> d = mo45602d();
        this.f64840b = d;
        return d;
    }

    public AbstractC27438au<K> keys() {
        AbstractC27438au<K> auVar = this.f64841c;
        if (auVar != null) {
            return auVar;
        }
        AbstractC27438au<K> g = mo45607g();
        this.f64841c = g;
        return g;
    }

    public String toString() {
        return asMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f64842d;
        if (collection != null) {
            return collection;
        }
        Collection<V> e = mo45603e();
        this.f64842d = e;
        return e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27422ar) {
            return asMap().equals(((AbstractC27422ar) obj).asMap());
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        for (Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.g<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean putAll(AbstractC27422ar<? extends K, ? extends V> arVar) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : arVar.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        C27245k.m54229a(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        C27245k.m54229a(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !C27397an.m54801a(get(k), it)) {
            return false;
        }
        return true;
    }
}
