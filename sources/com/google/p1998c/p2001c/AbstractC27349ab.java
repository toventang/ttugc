package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27536x;
import com.google.p1998c.p2001c.C27412aq;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.c.c.ab */
public abstract class AbstractC27349ab<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a */
    static final Map.Entry<?, ?>[] f64622a = new Map.Entry[0];

    /* renamed from: b */
    private transient AbstractC27381ai<Map.Entry<K, V>> f64623b;

    /* renamed from: c */
    private transient AbstractC27381ai<K> f64624c;

    /* renamed from: d */
    private transient AbstractC27536x<V> f64625d;

    /* renamed from: e */
    private transient C27386aj<K, V> f64626e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.ab$b */
    public static abstract class AbstractC27352b<K, V> extends AbstractC27349ab<K, V> {
        static {
            Covode.recordClassIndex(32932);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract AbstractC27479br<Map.Entry<K, V>> mo45569f();

        /* renamed from: com.google.c.c.ab$b$a */
        class C27353a extends AbstractC27358ac<K, V> {
            static {
                Covode.recordClassIndex(32933);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2001c.AbstractC27358ac
            /* renamed from: b */
            public final AbstractC27349ab<K, V> mo45570b() {
                return AbstractC27352b.this;
            }

            @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
            public final AbstractC27479br<Map.Entry<K, V>> iterator() {
                return AbstractC27352b.this.mo45569f();
            }

            C27353a() {
            }
        }

        AbstractC27352b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        /* renamed from: a */
        public final AbstractC27381ai<Map.Entry<K, V>> mo45542a() {
            return new C27353a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        /* renamed from: b */
        public AbstractC27381ai<K> mo45544b() {
            return new C27360ad(this);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        /* renamed from: c */
        public final AbstractC27536x<V> mo45545c() {
            return new C27362ae(this);
        }

        @Override // java.util.Map, com.google.p1998c.p2001c.AbstractC27349ab, com.google.p1998c.p2001c.AbstractC27349ab
        public /* bridge */ /* synthetic */ Set entrySet() {
            return AbstractC27349ab.super.entrySet();
        }

        @Override // java.util.Map, com.google.p1998c.p2001c.AbstractC27349ab, com.google.p1998c.p2001c.AbstractC27349ab
        public /* bridge */ /* synthetic */ Set keySet() {
            return AbstractC27349ab.super.keySet();
        }

        @Override // java.util.Map, com.google.p1998c.p2001c.AbstractC27349ab, com.google.p1998c.p2001c.AbstractC27349ab
        public /* bridge */ /* synthetic */ Collection values() {
            return AbstractC27349ab.super.values();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC27381ai<Map.Entry<K, V>> mo45542a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract AbstractC27381ai<K> mo45544b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC27536x<V> mo45545c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo45549d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo45550e() {
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    AbstractC27349ab() {
    }

    /* renamed from: of */
    public static <K, V> AbstractC27349ab<K, V> m54638of() {
        return (AbstractC27349ab<K, V>) C27456bc.f64769b;
    }

    /* renamed from: com.google.c.c.ab$a */
    public static class C27351a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f64629a;

        /* renamed from: b */
        Object[] f64630b;

        /* renamed from: c */
        int f64631c;

        /* renamed from: d */
        boolean f64632d;

        static {
            Covode.recordClassIndex(32931);
        }

        public C27351a() {
            this(4);
        }

        /* renamed from: b */
        private void m54651b() {
            int i;
            if (this.f64629a != null) {
                if (this.f64632d) {
                    this.f64630b = Arrays.copyOf(this.f64630b, this.f64631c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f64631c];
                int i2 = 0;
                while (true) {
                    i = this.f64631c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f64630b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, AbstractC27450az.m54883a(this.f64629a).mo45813a(C27412aq.EnumC27415a.VALUE));
                for (int i4 = 0; i4 < this.f64631c; i4++) {
                    int i5 = i4 * 2;
                    this.f64630b[i5] = entryArr[i4].getKey();
                    this.f64630b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        /* renamed from: a */
        public final AbstractC27349ab<K, V> mo45568a() {
            m54651b();
            this.f64632d = true;
            return C27456bc.m54892a(this.f64631c, this.f64630b);
        }

        C27351a(int i) {
            this.f64630b = new Object[(i * 2)];
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.ab$a<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private C27351a<K, V> m54649a(Map.Entry<? extends K, ? extends V> entry) {
            return mo45567a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        private void m54650a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f64630b;
            if (i2 > objArr.length) {
                this.f64630b = Arrays.copyOf(objArr, AbstractC27536x.AbstractC27538b.m55056a(objArr.length, i2));
                this.f64632d = false;
            }
        }

        /* renamed from: a */
        public final C27351a<K, V> mo45566a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m54650a(this.f64631c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                m54649a(entry);
            }
            return this;
        }

        /* renamed from: a */
        public final C27351a<K, V> mo45567a(K k, V v) {
            m54650a(this.f64631c + 1);
            C27511k.m54994a(k, v);
            Object[] objArr = this.f64630b;
            int i = this.f64631c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f64631c = i + 1;
            return this;
        }
    }

    /* renamed from: com.google.c.c.ab$c */
    final class C27354c extends AbstractC27352b<K, AbstractC27381ai<V>> {
        static {
            Covode.recordClassIndex(32934);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab, com.google.p1998c.p2001c.AbstractC27349ab.AbstractC27352b
        /* renamed from: b */
        public final AbstractC27381ai<K> mo45544b() {
            return AbstractC27349ab.this.keySet();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        /* renamed from: d */
        public final boolean mo45549d() {
            return AbstractC27349ab.this.mo45549d();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        /* renamed from: e */
        public final boolean mo45550e() {
            return AbstractC27349ab.this.mo45550e();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        public final int hashCode() {
            return AbstractC27349ab.this.hashCode();
        }

        public final int size() {
            return AbstractC27349ab.this.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27349ab.AbstractC27352b
        /* renamed from: f */
        public final AbstractC27479br<Map.Entry<K, AbstractC27381ai<V>>> mo45569f() {
            final AbstractC27479br<Map.Entry<K, V>> it = AbstractC27349ab.this.entrySet().iterator();
            return new AbstractC27479br<Map.Entry<K, AbstractC27381ai<V>>>() {
                /* class com.google.p1998c.p2001c.AbstractC27349ab.C27354c.C273551 */

                static {
                    Covode.recordClassIndex(32935);
                }

                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractC27501f<K, AbstractC27381ai<V>>() {
                        /* class com.google.p1998c.p2001c.AbstractC27349ab.C27354c.C273551.C273561 */

                        static {
                            Covode.recordClassIndex(32936);
                        }

                        @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
                        public final K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
                        public final /* synthetic */ Object getValue() {
                            return AbstractC27381ai.m54719of(entry.getValue());
                        }
                    };
                }
            };
        }

        private C27354c() {
        }

        @Override // com.google.p1998c.p2001c.AbstractC27349ab
        public final boolean containsKey(Object obj) {
            return AbstractC27349ab.this.containsKey(obj);
        }

        @Override // java.util.Map, com.google.p1998c.p2001c.AbstractC27349ab
        public final /* synthetic */ Object get(Object obj) {
            Object obj2 = AbstractC27349ab.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return AbstractC27381ai.m54719of(obj2);
        }

        /* synthetic */ C27354c(AbstractC27349ab abVar, byte b) {
            this();
        }
    }

    public static <K, V> C27351a<K, V> builder() {
        return new C27351a<>();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C27357d(this);
    }

    static {
        Covode.recordClassIndex(32929);
    }

    @Override // java.util.Map
    public AbstractC27381ai<Map.Entry<K, V>> entrySet() {
        AbstractC27381ai<Map.Entry<K, V>> aiVar = this.f64623b;
        if (aiVar != null) {
            return aiVar;
        }
        AbstractC27381ai<Map.Entry<K, V>> a = mo45542a();
        this.f64623b = a;
        return a;
    }

    public int hashCode() {
        return C27471bk.m54928a(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public AbstractC27381ai<K> keySet() {
        AbstractC27381ai<K> aiVar = this.f64624c;
        if (aiVar != null) {
            return aiVar;
        }
        AbstractC27381ai<K> b = mo45544b();
        this.f64624c = b;
        return b;
    }

    @Override // java.util.Map
    public AbstractC27536x<V> values() {
        AbstractC27536x<V> xVar = this.f64625d;
        if (xVar != null) {
            return xVar;
        }
        AbstractC27536x<V> c = mo45545c();
        this.f64625d = c;
        return c;
    }

    /* renamed from: com.google.c.c.ab$d */
    static class C27357d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object[] f64639a;

        /* renamed from: b */
        private final Object[] f64640b;

        static {
            Covode.recordClassIndex(32937);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.ab$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            C27351a aVar = new C27351a(this.f64639a.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f64639a;
                if (i >= objArr.length) {
                    return aVar.mo45568a();
                }
                aVar.mo45567a(objArr[i], this.f64640b[i]);
                i++;
            }
        }

        C27357d(AbstractC27349ab<?, ?> abVar) {
            this.f64639a = new Object[abVar.size()];
            this.f64640b = new Object[abVar.size()];
            AbstractC27479br<Map.Entry<?, ?>> it = abVar.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                this.f64639a[i] = next.getKey();
                this.f64640b[i] = next.getValue();
                i++;
            }
        }
    }

    public C27386aj<K, V> asMultimap() {
        if (isEmpty()) {
            return C27386aj.m54744of();
        }
        C27386aj<K, V> ajVar = this.f64626e;
        if (ajVar != null) {
            return ajVar;
        }
        C27386aj<K, V> ajVar2 = new C27386aj<>(new C27354c(this, (byte) 0), size(), null);
        this.f64626e = ajVar2;
        return ajVar2;
    }

    public String toString() {
        int size = size();
        C27511k.m54993a(size, "size");
        StringBuilder append = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L)).append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            z = false;
            append.append((Object) entry.getKey()).append('=').append((Object) entry.getValue());
        }
        return append.append('}').toString();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C27351a<K, V> builderWithExpectedSize(int i) {
        C27511k.m54993a(i, "expectedSize");
        return new C27351a<>(i);
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public static <K, V> AbstractC27349ab<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C27351a aVar = new C27351a(i);
        aVar.mo45566a(iterable);
        return aVar.mo45568a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> AbstractC27349ab<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC27349ab) && !(map instanceof SortedMap)) {
            AbstractC27349ab<K, V> abVar = (AbstractC27349ab) map;
            if (!abVar.mo45549d()) {
                return abVar;
            }
        }
        return copyOf(map.entrySet());
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> AbstractC27349ab<K, V> m54639of(K k, V v) {
        C27511k.m54994a(k, v);
        return C27456bc.m54892a(1, new Object[]{k, v});
    }

    /* renamed from: of */
    public static <K, V> AbstractC27349ab<K, V> m54640of(K k, V v, K k2, V v2) {
        C27511k.m54994a(k, v);
        C27511k.m54994a(k2, v2);
        return C27456bc.m54892a(2, new Object[]{k, v, k2, v2});
    }

    /* renamed from: of */
    public static <K, V> AbstractC27349ab<K, V> m54641of(K k, V v, K k2, V v2, K k3, V v3) {
        C27511k.m54994a(k, v);
        C27511k.m54994a(k2, v2);
        C27511k.m54994a(k3, v3);
        return C27456bc.m54892a(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> AbstractC27349ab<K, V> m54642of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C27511k.m54994a(k, v);
        C27511k.m54994a(k2, v2);
        C27511k.m54994a(k3, v3);
        C27511k.m54994a(k4, v4);
        return C27456bc.m54892a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> AbstractC27349ab<K, V> m54643of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C27511k.m54994a(k, v);
        C27511k.m54994a(k2, v2);
        C27511k.m54994a(k3, v3);
        C27511k.m54994a(k4, v4);
        C27511k.m54994a(k5, v5);
        return C27456bc.m54892a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
