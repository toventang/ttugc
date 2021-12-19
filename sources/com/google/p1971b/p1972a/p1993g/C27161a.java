package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27158a;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.b.a.g.a */
public class C27161a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    int f64300a;

    /* renamed from: b */
    Object[] f64301b;

    static {
        Covode.recordClassIndex(32741);
    }

    public final int size() {
        return this.f64300a;
    }

    /* renamed from: com.google.b.a.g.a$c */
    final class C27164c extends AbstractSet<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(32744);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C27163b();
        }

        public final int size() {
            return C27161a.this.f64300a;
        }

        C27164c() {
        }
    }

    public void clear() {
        this.f64300a = 0;
        this.f64301b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C27164c();
    }

    /* renamed from: com.google.b.a.g.a$a */
    final class C27162a implements Map.Entry<K, V> {

        /* renamed from: b */
        private int f64303b;

        static {
            Covode.recordClassIndex(32742);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return (V) C27161a.this.mo45216a(this.f64303b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            C27161a aVar = C27161a.this;
            int i = this.f64303b;
            if (i < 0 || i >= aVar.f64300a) {
                return null;
            }
            return (K) aVar.f64301b[i << 1];
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            return (V) C27161a.this.mo45217a(this.f64303b, v);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!C27158a.m53979a(getKey(), entry.getKey()) || !C27158a.m53979a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        C27162a(int i) {
            this.f64303b = i;
        }
    }

    /* renamed from: com.google.b.a.g.a$b */
    final class C27163b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private boolean f64305b;

        /* renamed from: c */
        private int f64306c;

        static {
            Covode.recordClassIndex(32743);
        }

        public final boolean hasNext() {
            if (this.f64306c < C27161a.this.f64300a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i = this.f64306c;
            if (i != C27161a.this.f64300a) {
                this.f64306c++;
                return new C27162a(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            int i = this.f64306c - 1;
            if (this.f64305b || i < 0) {
                throw new IllegalArgumentException();
            }
            C27161a.this.mo45218b(i << 1);
            this.f64305b = true;
        }

        C27163b() {
        }
    }

    /* renamed from: a */
    public final C27161a<K, V> clone() {
        try {
            C27161a<K, V> aVar = (C27161a) super.clone();
            Object[] objArr = this.f64301b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f64301b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private V m53990c(int i) {
        if (i < 0) {
            return null;
        }
        return (V) this.f64301b[i];
    }

    public final boolean containsKey(Object obj) {
        if (-2 != m53988a(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return m53990c(m53988a(obj) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return mo45218b(m53988a(obj));
    }

    /* renamed from: a */
    private int m53988a(Object obj) {
        int i = this.f64300a << 1;
        Object[] objArr = this.f64301b;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                }
            } else if (!obj.equals(obj2)) {
            }
            return i2;
        }
        return -2;
    }

    public final boolean containsValue(Object obj) {
        int i = this.f64300a << 1;
        Object[] objArr = this.f64301b;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                }
            } else if (!obj.equals(obj2)) {
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final V mo45218b(int i) {
        int i2 = this.f64300a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V c = m53990c(i + 1);
        Object[] objArr = this.f64301b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f64300a--;
        m53989a(i2 - 2, null, null);
        return c;
    }

    /* renamed from: a */
    public final V mo45216a(int i) {
        if (i < 0 || i >= this.f64300a) {
            return null;
        }
        return m53990c((i << 1) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int length;
        int a = m53988a(k) >> 1;
        if (a == -1) {
            a = this.f64300a;
        }
        if (a >= 0) {
            int i = a + 1;
            if (i >= 0) {
                Object[] objArr = this.f64301b;
                int i2 = i << 1;
                if (objArr == null) {
                    length = 0;
                } else {
                    length = objArr.length;
                }
                if (i2 > length) {
                    int i3 = ((length / 2) * 3) + 1;
                    if (i3 % 2 != 0) {
                        i3++;
                    }
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    if (i2 == 0) {
                        this.f64301b = null;
                    } else {
                        int i4 = this.f64300a;
                        if (i4 == 0 || i2 != objArr.length) {
                            Object[] objArr2 = new Object[i2];
                            this.f64301b = objArr2;
                            if (i4 != 0) {
                                System.arraycopy(objArr, 0, objArr2, 0, i4 << 1);
                            }
                        }
                    }
                }
                int i5 = a << 1;
                V c = m53990c(i5 + 1);
                m53989a(i5, k, v);
                if (i > this.f64300a) {
                    this.f64300a = i;
                }
                return c;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final V mo45217a(int i, V v) {
        int i2 = this.f64300a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V c = m53990c(i3);
        this.f64301b[i3] = v;
        return c;
    }

    /* renamed from: a */
    private void m53989a(int i, K k, V v) {
        Object[] objArr = this.f64301b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }
}
