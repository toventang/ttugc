package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.C27397an;
import com.google.p1998c.p2001c.C27412aq;
import com.google.p1998c.p2001c.C27440av;
import com.google.p1998c.p2001c.C27468bi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.c.c.af */
public abstract class AbstractC27366af<K, V> extends AbstractC27502g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final transient AbstractC27349ab<K, ? extends AbstractC27536x<V>> f64650b;

    /* renamed from: c */
    final transient int f64651c;

    static {
        Covode.recordClassIndex(32946);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public abstract AbstractC27536x<V> get(K k);

    public abstract AbstractC27366af<V, K> inverse();

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.google.c.c.ab<K, ? extends com.google.c.c.x<V>>, com.google.c.c.ab<K, java.util.Collection<V>> */
    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27349ab<K, Collection<V>> asMap() {
        return (AbstractC27349ab<K, ? extends AbstractC27536x<V>>) this.f64650b;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public int size() {
        return this.f64651c;
    }

    /* renamed from: com.google.c.c.af$a */
    public static class C27369a<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f64659a = new C27515m();

        /* renamed from: b */
        Comparator<? super K> f64660b;

        /* renamed from: c */
        Comparator<? super V> f64661c;

        static {
            Covode.recordClassIndex(32949);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo45626c() {
            return new ArrayList();
        }

        /* renamed from: b */
        public AbstractC27366af<K, V> mo45541b() {
            Collection entrySet = this.f64659a.entrySet();
            Comparator<? super K> comparator = this.f64660b;
            if (comparator != null) {
                entrySet = AbstractC27540z.sortedCopyOf(AbstractC27450az.m54883a(comparator).mo45813a(C27412aq.EnumC27415a.KEY), entrySet);
            }
            return C27347aa.m54624a(entrySet, this.f64661c);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.af$a<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public C27369a<K, V> mo45538a(Map.Entry<? extends K, ? extends V> entry) {
            return mo45540b(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        public C27369a<K, V> mo45539b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                mo45538a(entry);
            }
            return this;
        }

        /* renamed from: b */
        public C27369a<K, V> mo45540b(K k, V v) {
            C27511k.m54994a(k, v);
            Collection<V> collection = this.f64659a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f64659a;
                collection = mo45626c();
                map.put(k, collection);
            }
            collection.add(v);
            return this;
        }
    }

    /* renamed from: com.google.c.c.af$b */
    static class C27370b<K, V> extends AbstractC27536x<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final AbstractC27366af<K, V> f64662a;

        static {
            Covode.recordClassIndex(32950);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final AbstractC27479br<Map.Entry<K, V>> iterator() {
            return this.f64662a.mo45610i();
        }

        public final int size() {
            return this.f64662a.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return this.f64662a.f64650b.mo45549d();
        }

        C27370b(AbstractC27366af<K, V> afVar) {
            this.f64662a = afVar;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f64662a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.c.c.af$d */
    class C27372d extends AbstractC27375ag<K> {
        static {
            Covode.recordClassIndex(32952);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27438au
        public final AbstractC27381ai<K> elementSet() {
            return AbstractC27366af.this.keySet();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au
        public final int size() {
            return AbstractC27366af.this.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27536x
        public final Object writeReplace() {
            return new C27373e(AbstractC27366af.this);
        }

        C27372d() {
        }

        @Override // com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            return AbstractC27366af.this.containsKey(obj);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27438au
        public final int count(Object obj) {
            Collection collection = (Collection) AbstractC27366af.this.f64650b.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27375ag
        /* renamed from: a */
        public final AbstractC27438au.AbstractC27439a<K> mo45628a(int i) {
            Map.Entry<K, ? extends AbstractC27536x<V>> entry = AbstractC27366af.this.f64650b.entrySet().asList().get(i);
            return new C27440av.C27444d(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    /* renamed from: com.google.c.c.af$e */
    static final class C27373e implements Serializable {

        /* renamed from: a */
        final AbstractC27366af<?, ?> f64666a;

        static {
            Covode.recordClassIndex(32953);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.f64666a.keys();
        }

        C27373e(AbstractC27366af<?, ?> afVar) {
            this.f64666a = afVar;
        }
    }

    /* renamed from: com.google.c.c.af$f */
    static final class C27374f<K, V> extends AbstractC27536x<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final transient AbstractC27366af<K, V> f64667a;

        static {
            Covode.recordClassIndex(32954);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final AbstractC27479br<V> iterator() {
            return this.f64667a.mo45606f();
        }

        public final int size() {
            return this.f64667a.size();
        }

        C27374f(AbstractC27366af<K, V> afVar) {
            this.f64667a = afVar;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            return this.f64667a.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final int mo45633a(Object[] objArr, int i) {
            AbstractC27479br<? extends AbstractC27536x<V>> it = this.f64667a.f64650b.values().iterator();
            while (it.hasNext()) {
                i = ((AbstractC27536x) it.next()).mo45633a(objArr, i);
            }
            return i;
        }
    }

    public static <K, V> C27369a<K, V> builder() {
        return new C27369a<>();
    }

    /* renamed from: of */
    public static <K, V> AbstractC27366af<K, V> m54671of() {
        return C27347aa.m54625of();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC27479br<Map.Entry<K, V>> mo45610i() {
        return new AbstractC27479br<Map.Entry<K, V>>() {
            /* class com.google.p1998c.p2001c.AbstractC27366af.C273671 */

            /* renamed from: a */
            final Iterator<? extends Map.Entry<K, ? extends AbstractC27536x<V>>> f64652a;

            /* renamed from: b */
            K f64653b = null;

            /* renamed from: c */
            Iterator<V> f64654c = C27397an.C27401a.f64702a;

            static {
                Covode.recordClassIndex(32947);
            }

            public final boolean hasNext() {
                if (this.f64654c.hasNext() || this.f64652a.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                if (!this.f64654c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f64652a.next();
                    this.f64653b = (K) entry.getKey();
                    this.f64654c = ((AbstractC27536x) entry.getValue()).iterator();
                }
                return C27412aq.m54818a((Object) this.f64653b, (Object) this.f64654c.next());
            }

            {
                this.f64652a = AbstractC27366af.this.f64650b.entrySet().iterator();
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC27479br<V> mo45606f() {
        return new AbstractC27479br<V>() {
            /* class com.google.p1998c.p2001c.AbstractC27366af.C273682 */

            /* renamed from: a */
            Iterator<? extends AbstractC27536x<V>> f64656a;

            /* renamed from: b */
            Iterator<V> f64657b = C27397an.C27401a.f64702a;

            static {
                Covode.recordClassIndex(32948);
            }

            public final boolean hasNext() {
                if (this.f64657b.hasNext() || this.f64656a.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public final V next() {
                if (!this.f64657b.hasNext()) {
                    this.f64657b = ((AbstractC27536x) this.f64656a.next()).iterator();
                }
                return this.f64657b.next();
            }

            {
                this.f64656a = AbstractC27366af.this.f64650b.values().iterator();
            }
        };
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: d */
    public final Set<K> mo45602d() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: e */
    public final /* synthetic */ Collection mo45603e() {
        return new C27374f(this);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27536x<Map.Entry<K, V>> entries() {
        return (AbstractC27536x) super.entries();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: g */
    public final /* synthetic */ AbstractC27438au mo45607g() {
        return new C27372d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: h */
    public final /* synthetic */ Collection mo45608h() {
        return new C27370b(this);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27502g
    /* renamed from: j */
    public final Map<K, Collection<V>> mo45612j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27381ai<K> keySet() {
        return this.f64650b.keySet();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27375ag<K> keys() {
        return (AbstractC27375ag) super.keys();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27536x<V> values() {
        return (AbstractC27536x) super.values();
    }

    /* renamed from: com.google.c.c.af$c */
    static class C27371c {

        /* renamed from: a */
        static final C27468bi.C27469a<AbstractC27366af> f64663a = C27468bi.m54924a(AbstractC27366af.class, "map");

        /* renamed from: b */
        static final C27468bi.C27469a<AbstractC27366af> f64664b = C27468bi.m54924a(AbstractC27366af.class, "size");

        static {
            Covode.recordClassIndex(32951);
        }
    }

    public static <K, V> AbstractC27366af<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return C27347aa.copyOf((Iterable) iterable);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public boolean containsKey(Object obj) {
        return this.f64650b.containsKey(obj);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public boolean putAll(AbstractC27422ar<? extends K, ? extends V> arVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar
    public AbstractC27536x<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public static <K, V> AbstractC27366af<K, V> copyOf(AbstractC27422ar<? extends K, ? extends V> arVar) {
        if (arVar instanceof AbstractC27366af) {
            AbstractC27366af<K, V> afVar = (AbstractC27366af) arVar;
            if (!afVar.f64650b.mo45549d()) {
                return afVar;
            }
        }
        return C27347aa.copyOf((AbstractC27422ar) arVar);
    }

    AbstractC27366af(AbstractC27349ab<K, ? extends AbstractC27536x<V>> abVar, int i) {
        this.f64650b = abVar;
        this.f64651c = i;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27422ar, com.google.p1998c.p2001c.AbstractC27502g
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public AbstractC27536x<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> AbstractC27366af<K, V> m54672of(K k, V v) {
        return C27347aa.m54626of((Object) k, (Object) v);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27502g
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> AbstractC27366af<K, V> m54673of(K k, V v, K k2, V v2) {
        return C27347aa.m54627of((Object) k, (Object) v, (Object) k2, (Object) v2);
    }

    /* renamed from: of */
    public static <K, V> AbstractC27366af<K, V> m54674of(K k, V v, K k2, V v2, K k3, V v3) {
        return C27347aa.m54628of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    /* renamed from: of */
    public static <K, V> AbstractC27366af<K, V> m54675of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return C27347aa.m54629of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    /* renamed from: of */
    public static <K, V> AbstractC27366af<K, V> m54676of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return C27347aa.m54630of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }
}
