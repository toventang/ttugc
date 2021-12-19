package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.C27471bk;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.c.c.aq */
public final class C27412aq {
    static {
        Covode.recordClassIndex(32992);
    }

    /* renamed from: com.google.c.c.aq$b */
    static abstract class AbstractC27418b<K, V> extends C27471bk.AbstractC27472a<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(32998);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Map<K, V> mo45736a();

        AbstractC27418b() {
        }

        public void clear() {
            mo45736a().clear();
        }

        public boolean isEmpty() {
            return mo45736a().isEmpty();
        }

        public int size() {
            return mo45736a().size();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return mo45736a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, com.google.p1998c.p2001c.C27471bk.AbstractC27472a, java.util.Collection, java.util.AbstractSet, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C27245k.m54229a(collection));
            } catch (UnsupportedOperationException unused) {
                return C27471bk.m54931a((Set<?>) this, collection.iterator());
            }
        }

        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object a = C27412aq.m54816a((Map) mo45736a(), key);
                if (!C27241i.m54222a(a, entry.getValue()) || (a == null && !mo45736a().containsKey(key))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, com.google.p1998c.p2001c.C27471bk.AbstractC27472a, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            int i;
            try {
                return super.retainAll((Collection) C27245k.m54229a(collection));
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    C27511k.m54993a(size, "expectedSize");
                    i = size + 1;
                } else if (size < 1073741824) {
                    i = (int) ((((float) size) / 0.75f) + 1.0f);
                } else {
                    i = Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i);
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo45736a().keySet().retainAll(hashSet);
            }
        }
    }

    /* renamed from: com.google.c.c.aq$e */
    static abstract class AbstractC27421e<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Map.Entry<K, V>> f64722a;

        /* renamed from: b */
        private transient Set<K> f64723b;

        /* renamed from: c */
        private transient Collection<V> f64724c;

        static {
            Covode.recordClassIndex(33001);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo45758a();

        AbstractC27421e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Set<K> mo45759e() {
            return new C27419c(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f64722a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo45758a();
            this.f64722a = a;
            return a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f64723b;
            if (set != null) {
                return set;
            }
            Set<K> e = mo45759e();
            this.f64723b = e;
            return e;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f64724c;
            if (collection != null) {
                return collection;
            }
            C27420d dVar = new C27420d(this);
            this.f64724c = dVar;
            return dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.aq$c */
    public static class C27419c<K, V> extends C27471bk.AbstractC27472a<K> {

        /* renamed from: d */
        final Map<K, V> f64720d;

        static {
            Covode.recordClassIndex(32999);
        }

        public void clear() {
            this.f64720d.clear();
        }

        public boolean isEmpty() {
            return this.f64720d.isEmpty();
        }

        public int size() {
            return this.f64720d.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return C27412aq.m54817a(this.f64720d.entrySet().iterator());
        }

        public boolean contains(Object obj) {
            return this.f64720d.containsKey(obj);
        }

        C27419c(Map<K, V> map) {
            this.f64720d = (Map) C27245k.m54229a(map);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            this.f64720d.remove(obj);
            return true;
        }
    }

    /* renamed from: com.google.c.c.aq$d */
    static class C27420d<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        public final Map<K, V> f64721a;

        static {
            Covode.recordClassIndex(33000);
        }

        public final void clear() {
            this.f64721a.clear();
        }

        public final boolean isEmpty() {
            return this.f64721a.isEmpty();
        }

        public final int size() {
            return this.f64721a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return C27412aq.m54819b(this.f64721a.entrySet().iterator());
        }

        public final boolean contains(Object obj) {
            return this.f64721a.containsValue(obj);
        }

        C27420d(Map<K, V> map) {
            this.f64721a = (Map) C27245k.m54229a(map);
        }

        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f64721a.entrySet()) {
                    if (C27241i.m54222a(obj, entry.getValue())) {
                        this.f64721a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C27245k.m54229a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f64721a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f64721a.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C27245k.m54229a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f64721a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f64721a.keySet().retainAll(hashSet);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.aq$a */
    public enum EnumC27415a implements AbstractC27235f<Map.Entry<?, ?>, Object> {
        KEY {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p1999a.AbstractC27235f
            /* renamed from: a */
            public final /* synthetic */ Object mo45319a(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p1999a.AbstractC27235f
            /* renamed from: a */
            public final /* synthetic */ Object mo45319a(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        static {
            Covode.recordClassIndex(32995);
        }

        /* synthetic */ EnumC27415a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    static <K, V> Iterator<K> m54817a(Iterator<Map.Entry<K, V>> it) {
        return new AbstractC27476bo<Map.Entry<K, V>, K>(it) {
            /* class com.google.p1998c.p2001c.C27412aq.C274131 */

            static {
                Covode.recordClassIndex(32993);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27476bo
            /* renamed from: a */
            public final /* synthetic */ Object mo45700a(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
    }

    /* renamed from: b */
    static <K, V> Iterator<V> m54819b(Iterator<Map.Entry<K, V>> it) {
        return new AbstractC27476bo<Map.Entry<K, V>, V>(it) {
            /* class com.google.p1998c.p2001c.C27412aq.C274142 */

            static {
                Covode.recordClassIndex(32994);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27476bo
            /* renamed from: a */
            public final /* synthetic */ Object mo45700a(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        };
    }

    /* renamed from: a */
    static <V> V m54816a(Map<?, V> map, Object obj) {
        C27245k.m54229a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m54820b(Map<?, ?> map, Object obj) {
        C27245k.m54229a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: c */
    static <V> V m54821c(Map<?, V> map, Object obj) {
        C27245k.m54229a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <K, V> Map.Entry<K, V> m54818a(K k, V v) {
        return new C27539y(k, v);
    }
}
