package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.gson.internal.g */
public final class C27998g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f */
    static final /* synthetic */ boolean f65768f = true;

    /* renamed from: g */
    private static final Comparator<Comparable> f65769g = new Comparator<Comparable>() {
        /* class com.google.gson.internal.C27998g.C279991 */

        static {
            Covode.recordClassIndex(33612);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: a */
    Comparator<? super K> f65770a;

    /* renamed from: b */
    C28005d<K, V> f65771b;

    /* renamed from: c */
    int f65772c;

    /* renamed from: d */
    int f65773d;

    /* renamed from: e */
    final C28005d<K, V> f65774e;

    /* renamed from: h */
    private C27998g<K, V>.C28000a f65775h;

    /* renamed from: i */
    private C27998g<K, V>.C28002b f65776i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.g$d */
    public static final class C28005d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C28005d<K, V> f65785a;

        /* renamed from: b */
        C28005d<K, V> f65786b;

        /* renamed from: c */
        C28005d<K, V> f65787c;

        /* renamed from: d */
        C28005d<K, V> f65788d;

        /* renamed from: e */
        C28005d<K, V> f65789e;

        /* renamed from: f */
        final K f65790f;

        /* renamed from: g */
        V f65791g;

        /* renamed from: h */
        int f65792h;

        static {
            Covode.recordClassIndex(33618);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f65790f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f65791g;
        }

        C28005d() {
            this.f65789e = this;
            this.f65788d = this;
        }

        public final int hashCode() {
            int hashCode;
            K k = this.f65790f;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.f65791g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            return ((Object) this.f65790f) + "=" + ((Object) this.f65791g);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f65791g;
            this.f65791g = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f65790f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f65791g;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        C28005d(C28005d<K, V> dVar, K k, C28005d<K, V> dVar2, C28005d<K, V> dVar3) {
            this.f65785a = dVar;
            this.f65790f = k;
            this.f65792h = 1;
            this.f65788d = dVar2;
            this.f65789e = dVar3;
            dVar3.f65788d = this;
            dVar2.f65789e = this;
        }
    }

    public final int size() {
        return this.f65772c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.g$a */
    public class C28000a extends AbstractSet<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33613);
        }

        public final void clear() {
            C27998g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C27998g<K, V>.AbstractC28004c() {
                /* class com.google.gson.internal.C27998g.C28000a.C280011 */

                static {
                    Covode.recordClassIndex(33614);
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return mo46772a();
                }

                {
                    C27998g gVar = C27998g.this;
                }
            };
        }

        public final int size() {
            return C27998g.this.f65772c;
        }

        C28000a() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || C27998g.this.mo46749a((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            C28005d<K, V> a;
            if (!(obj instanceof Map.Entry) || (a = C27998g.this.mo46749a((Map.Entry) obj)) == null) {
                return false;
            }
            C27998g.this.mo46750a((C28005d) a, true);
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.g$b */
    final class C28002b extends AbstractSet<K> {
        static {
            Covode.recordClassIndex(33615);
        }

        public final void clear() {
            C27998g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C27998g<K, V>.AbstractC28004c() {
                /* class com.google.gson.internal.C27998g.C28002b.C280031 */

                static {
                    Covode.recordClassIndex(33616);
                }

                @Override // java.util.Iterator
                public final K next() {
                    return mo46772a().f65790f;
                }

                {
                    C27998g gVar = C27998g.this;
                }
            };
        }

        public final int size() {
            return C27998g.this.f65772c;
        }

        C28002b() {
        }

        public final boolean contains(Object obj) {
            return C27998g.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (C27998g.this.mo46748a(obj) != null) {
                return true;
            }
            return false;
        }
    }

    public C27998g() {
        this(f65769g);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* renamed from: com.google.gson.internal.g$c */
    abstract class AbstractC28004c<T> implements Iterator<T> {

        /* renamed from: b */
        C28005d<K, V> f65781b;

        /* renamed from: c */
        C28005d<K, V> f65782c;

        /* renamed from: d */
        int f65783d;

        static {
            Covode.recordClassIndex(33617);
        }

        public final boolean hasNext() {
            if (this.f65781b != C27998g.this.f65774e) {
                return true;
            }
            return false;
        }

        public final void remove() {
            C28005d<K, V> dVar = this.f65782c;
            if (dVar != null) {
                C27998g.this.mo46750a((C28005d) dVar, true);
                this.f65782c = null;
                this.f65783d = C27998g.this.f65773d;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C28005d<K, V> mo46772a() {
            C28005d<K, V> dVar = this.f65781b;
            if (dVar == C27998g.this.f65774e) {
                throw new NoSuchElementException();
            } else if (C27998g.this.f65773d == this.f65783d) {
                this.f65781b = dVar.f65788d;
                this.f65782c = dVar;
                return dVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        AbstractC28004c() {
            this.f65781b = C27998g.this.f65774e.f65788d;
            this.f65783d = C27998g.this.f65773d;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C27998g<K, V>.C28000a aVar = this.f65775h;
        if (aVar != null) {
            return aVar;
        }
        C27998g<K, V>.C28000a aVar2 = new C28000a();
        this.f65775h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C27998g<K, V>.C28002b bVar = this.f65776i;
        if (bVar != null) {
            return bVar;
        }
        C27998g<K, V>.C28002b bVar2 = new C28002b();
        this.f65776i = bVar2;
        return bVar2;
    }

    static {
        Covode.recordClassIndex(33611);
    }

    public final void clear() {
        this.f65771b = null;
        this.f65772c = 0;
        this.f65773d++;
        C28005d<K, V> dVar = this.f65774e;
        dVar.f65789e = dVar;
        dVar.f65788d = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private C28005d<K, V> m56086b(Object obj) {
        if (obj != 0) {
            try {
                return m56083a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C28005d<K, V> mo46748a(Object obj) {
        C28005d<K, V> b = m56086b(obj);
        if (b != null) {
            mo46750a((C28005d) b, true);
        }
        return b;
    }

    public final boolean containsKey(Object obj) {
        if (m56086b(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        C28005d<K, V> b = m56086b(obj);
        if (b != null) {
            return b.f65791g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        C28005d<K, V> a = mo46748a(obj);
        if (a != null) {
            return a.f65791g;
        }
        return null;
    }

    public C27998g(Comparator<? super K> comparator) {
        this.f65774e = new C28005d<>();
        this.f65770a = comparator == null ? f65769g : comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C28005d<K, V> mo46749a(Map.Entry<?, ?> entry) {
        C28005d<K, V> b = m56086b(entry.getKey());
        if (b == null) {
            return null;
        }
        V v = b.f65791g;
        Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private void m56084a(C28005d<K, V> dVar) {
        int i;
        int i2;
        C28005d<K, V> dVar2 = dVar.f65786b;
        C28005d<K, V> dVar3 = dVar.f65787c;
        C28005d<K, V> dVar4 = dVar3.f65786b;
        C28005d<K, V> dVar5 = dVar3.f65787c;
        dVar.f65787c = dVar4;
        if (dVar4 != null) {
            dVar4.f65785a = dVar;
        }
        m56085a(dVar, dVar3);
        dVar3.f65786b = dVar;
        dVar.f65785a = dVar3;
        int i3 = 0;
        if (dVar2 != null) {
            i = dVar2.f65792h;
        } else {
            i = 0;
        }
        if (dVar4 != null) {
            i2 = dVar4.f65792h;
        } else {
            i2 = 0;
        }
        dVar.f65792h = Math.max(i, i2) + 1;
        int i4 = dVar.f65792h;
        if (dVar5 != null) {
            i3 = dVar5.f65792h;
        }
        dVar3.f65792h = Math.max(i4, i3) + 1;
    }

    /* renamed from: b */
    private void m56087b(C28005d<K, V> dVar) {
        int i;
        int i2;
        C28005d<K, V> dVar2 = dVar.f65786b;
        C28005d<K, V> dVar3 = dVar.f65787c;
        C28005d<K, V> dVar4 = dVar2.f65786b;
        C28005d<K, V> dVar5 = dVar2.f65787c;
        dVar.f65786b = dVar5;
        if (dVar5 != null) {
            dVar5.f65785a = dVar;
        }
        m56085a(dVar, dVar2);
        dVar2.f65787c = dVar;
        dVar.f65785a = dVar2;
        int i3 = 0;
        if (dVar3 != null) {
            i = dVar3.f65792h;
        } else {
            i = 0;
        }
        if (dVar5 != null) {
            i2 = dVar5.f65792h;
        } else {
            i2 = 0;
        }
        dVar.f65792h = Math.max(i, i2) + 1;
        int i4 = dVar.f65792h;
        if (dVar4 != null) {
            i3 = dVar4.f65792h;
        }
        dVar2.f65792h = Math.max(i4, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C28005d<K, V> a = m56083a((Object) k, true);
        V v2 = a.f65791g;
        a.f65791g = v;
        return v2;
    }

    /* renamed from: a */
    private void m56085a(C28005d<K, V> dVar, C28005d<K, V> dVar2) {
        C28005d<K, V> dVar3 = dVar.f65785a;
        dVar.f65785a = null;
        if (dVar2 != null) {
            dVar2.f65785a = dVar3;
        }
        if (dVar3 == null) {
            this.f65771b = dVar2;
        } else if (dVar3.f65786b == dVar) {
            dVar3.f65786b = dVar2;
        } else if (f65768f || dVar3.f65787c == dVar) {
            dVar3.f65787c = dVar2;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.gson.internal.C27998g.C28005d<K, V> m56083a(K r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C27998g.m56083a(java.lang.Object, boolean):com.google.gson.internal.g$d");
    }

    /* renamed from: b */
    private void m56088b(C28005d<K, V> dVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (dVar != null) {
            C28005d<K, V> dVar2 = dVar.f65786b;
            C28005d<K, V> dVar3 = dVar.f65787c;
            int i5 = 0;
            if (dVar2 != null) {
                i = dVar2.f65792h;
            } else {
                i = 0;
            }
            if (dVar3 != null) {
                i2 = dVar3.f65792h;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C28005d<K, V> dVar4 = dVar3.f65786b;
                C28005d<K, V> dVar5 = dVar3.f65787c;
                if (dVar5 != null) {
                    i4 = dVar5.f65792h;
                } else {
                    i4 = 0;
                }
                if (dVar4 != null) {
                    i5 = dVar4.f65792h;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    m56084a((C28005d) dVar);
                } else if (f65768f || i7 == 1) {
                    m56087b((C28005d) dVar3);
                    m56084a((C28005d) dVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C28005d<K, V> dVar6 = dVar2.f65786b;
                C28005d<K, V> dVar7 = dVar2.f65787c;
                if (dVar7 != null) {
                    i3 = dVar7.f65792h;
                } else {
                    i3 = 0;
                }
                if (dVar6 != null) {
                    i5 = dVar6.f65792h;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m56087b((C28005d) dVar);
                } else if (f65768f || i8 == -1) {
                    m56084a((C28005d) dVar2);
                    m56087b((C28005d) dVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                dVar.f65792h = i + 1;
                if (z) {
                    return;
                }
            } else if (f65768f || i6 == -1 || i6 == 1) {
                dVar.f65792h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            dVar = dVar.f65785a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46750a(C28005d<K, V> dVar, boolean z) {
        int i;
        if (z) {
            dVar.f65789e.f65788d = dVar.f65788d;
            dVar.f65788d.f65789e = dVar.f65789e;
        }
        C28005d<K, V> dVar2 = dVar.f65786b;
        C28005d<K, V> dVar3 = dVar.f65787c;
        C28005d<K, V> dVar4 = dVar.f65785a;
        int i2 = 0;
        if (dVar2 != null) {
            if (dVar3 != null) {
                if (dVar2.f65792h > dVar3.f65792h) {
                    C28005d<K, V> dVar5 = dVar2.f65787c;
                    while (true) {
                        dVar3 = dVar2;
                        dVar2 = dVar5;
                        if (dVar2 == null) {
                            break;
                        }
                        dVar5 = dVar2.f65787c;
                    }
                } else {
                    while (true) {
                        C28005d<K, V> dVar6 = dVar3.f65786b;
                        if (dVar6 == null) {
                            break;
                        }
                        dVar3 = dVar6;
                    }
                }
                mo46750a((C28005d) dVar3, false);
                C28005d<K, V> dVar7 = dVar.f65786b;
                if (dVar7 != null) {
                    i = dVar7.f65792h;
                    dVar3.f65786b = dVar7;
                    dVar7.f65785a = dVar3;
                    dVar.f65786b = null;
                } else {
                    i = 0;
                }
                C28005d<K, V> dVar8 = dVar.f65787c;
                if (dVar8 != null) {
                    i2 = dVar8.f65792h;
                    dVar3.f65787c = dVar8;
                    dVar8.f65785a = dVar3;
                    dVar.f65787c = null;
                }
                dVar3.f65792h = Math.max(i, i2) + 1;
                m56085a(dVar, dVar3);
                return;
            }
            m56085a(dVar, dVar2);
            dVar.f65786b = null;
        } else if (dVar3 != null) {
            m56085a(dVar, dVar3);
            dVar.f65787c = null;
        } else {
            m56085a(dVar, (C28005d) null);
        }
        m56088b(dVar4, false);
        this.f65772c--;
        this.f65773d++;
    }
}
