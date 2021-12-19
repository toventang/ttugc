package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.c.c.m */
public class C27515m<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    transient long[] f64858a;

    /* renamed from: b */
    transient Object[] f64859b;

    /* renamed from: c */
    transient Object[] f64860c;

    /* renamed from: d */
    transient float f64861d;

    /* renamed from: e */
    transient int f64862e;

    /* renamed from: f */
    public transient int f64863f;

    /* renamed from: g */
    private transient int[] f64864g;

    /* renamed from: h */
    private transient int f64865h;

    /* renamed from: i */
    private transient Set<K> f64866i;

    /* renamed from: j */
    private transient Set<Map.Entry<K, V>> f64867j;

    /* renamed from: k */
    private transient Collection<V> f64868k;

    static {
        Covode.recordClassIndex(33095);
    }

    /* renamed from: a */
    private static long m54999a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo46007a(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46009a(int i) {
    }

    /* renamed from: com.google.c.c.m$d */
    final class C27522d extends AbstractC27501f<K, V> {

        /* renamed from: b */
        private final K f64879b;

        /* renamed from: c */
        private int f64880c;

        static {
            Covode.recordClassIndex(33102);
        }

        @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
        public final K getKey() {
            return this.f64879b;
        }

        @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
        public final V getValue() {
            m55018a();
            if (this.f64880c == -1) {
                return null;
            }
            return (V) C27515m.this.f64860c[this.f64880c];
        }

        /* renamed from: a */
        private void m55018a() {
            int i = this.f64880c;
            if (i == -1 || i >= C27515m.this.size() || !C27241i.m54222a(this.f64879b, C27515m.this.f64859b[this.f64880c])) {
                this.f64880c = C27515m.this.mo46008a(this.f64879b);
            }
        }

        @Override // java.util.Map.Entry, com.google.p1998c.p2001c.AbstractC27501f
        public final V setValue(V v) {
            m55018a();
            if (this.f64880c == -1) {
                C27515m.this.put(this.f64879b, v);
                return null;
            }
            V v2 = (V) C27515m.this.f64860c[this.f64880c];
            C27515m.this.f64860c[this.f64880c] = v;
            return v2;
        }

        C27522d(int i) {
            this.f64879b = (K) C27515m.this.f64859b[i];
            this.f64880c = i;
        }
    }

    public int size() {
        return this.f64863f;
    }

    /* renamed from: com.google.c.c.m$a */
    class C27519a extends AbstractSet<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33099);
        }

        public final void clear() {
            C27515m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C27515m<K, V>.AbstractC27520b() {
                /* class com.google.p1998c.p2001c.C27515m.C275172 */

                static {
                    Covode.recordClassIndex(33097);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.C27515m.AbstractC27520b
                /* renamed from: a */
                public final /* synthetic */ Object mo46027a(int i) {
                    return new C27522d(i);
                }
            };
        }

        public final int size() {
            return C27515m.this.f64863f;
        }

        C27519a() {
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int a = C27515m.this.mo46008a(entry.getKey());
                if (a == -1 || !C27241i.m54222a(C27515m.this.f64860c[a], entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C27515m.this.mo46008a(entry.getKey());
            if (a == -1 || !C27241i.m54222a(C27515m.this.f64860c[a], entry.getValue())) {
                return false;
            }
            C27515m.this.mo46013c(a);
            return true;
        }
    }

    /* renamed from: com.google.c.c.m$b */
    abstract class AbstractC27520b<T> implements Iterator<T> {

        /* renamed from: b */
        int f64873b;

        /* renamed from: c */
        int f64874c;

        /* renamed from: d */
        int f64875d;

        static {
            Covode.recordClassIndex(33100);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo46027a(int i);

        public boolean hasNext() {
            if (this.f64874c >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private void m55016a() {
            if (C27515m.this.f64862e != this.f64873b) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public T next() {
            m55016a();
            if (hasNext()) {
                int i = this.f64874c;
                this.f64875d = i;
                T a = mo46027a(i);
                this.f64874c = C27515m.this.mo46018e(this.f64874c);
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            m55016a();
            if (this.f64875d >= 0) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54244b(z, "no calls to next() since the last call to remove()");
            this.f64873b++;
            C27515m.this.mo46013c(this.f64875d);
            this.f64874c = C27515m.this.mo46007a(this.f64874c, this.f64875d);
            this.f64875d = -1;
        }

        private AbstractC27520b() {
            this.f64873b = C27515m.this.f64862e;
            this.f64874c = C27515m.this.mo46006a();
            this.f64875d = -1;
        }

        /* synthetic */ AbstractC27520b(C27515m mVar, byte b) {
            this();
        }
    }

    /* renamed from: com.google.c.c.m$c */
    class C27521c extends AbstractSet<K> {
        static {
            Covode.recordClassIndex(33101);
        }

        public final void clear() {
            C27515m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C27515m<K, V>.AbstractC27520b() {
                /* class com.google.p1998c.p2001c.C27515m.C275161 */

                static {
                    Covode.recordClassIndex(33096);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.C27515m.AbstractC27520b
                /* renamed from: a */
                public final K mo46027a(int i) {
                    return (K) C27515m.this.f64859b[i];
                }
            };
        }

        public final int size() {
            return C27515m.this.f64863f;
        }

        C27521c() {
        }

        public final boolean contains(Object obj) {
            return C27515m.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            int a = C27515m.this.mo46008a(obj);
            if (a == -1) {
                return false;
            }
            C27515m.this.mo46013c(a);
            return true;
        }
    }

    /* renamed from: com.google.c.c.m$e */
    class C27523e extends AbstractCollection<V> {
        static {
            Covode.recordClassIndex(33103);
        }

        public final void clear() {
            C27515m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C27515m<K, V>.AbstractC27520b() {
                /* class com.google.p1998c.p2001c.C27515m.C275183 */

                static {
                    Covode.recordClassIndex(33098);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.C27515m.AbstractC27520b
                /* renamed from: a */
                public final V mo46027a(int i) {
                    return (V) C27515m.this.f64860c[i];
                }
            };
        }

        public final int size() {
            return C27515m.this.f64863f;
        }

        C27523e() {
        }
    }

    public boolean isEmpty() {
        if (this.f64863f == 0) {
            return true;
        }
        return false;
    }

    C27515m() {
        mo46010a(3, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f64867j;
        if (set != null) {
            return set;
        }
        C27519a aVar = new C27519a();
        this.f64867j = aVar;
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f64866i;
        if (set != null) {
            return set;
        }
        C27521c cVar = new C27521c();
        this.f64866i = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f64868k;
        if (collection != null) {
            return collection;
        }
        C27523e eVar = new C27523e();
        this.f64868k = eVar;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo46006a() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public void clear() {
        this.f64862e++;
        Arrays.fill(this.f64859b, 0, this.f64863f, (Object) null);
        Arrays.fill(this.f64860c, 0, this.f64863f, (Object) null);
        Arrays.fill(this.f64864g, -1);
        Arrays.fill(this.f64858a, -1L);
        this.f64863f = 0;
    }

    C27515m(int i) {
        this(i, (byte) 0);
    }

    /* renamed from: f */
    private static int[] m55001f(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public boolean containsKey(Object obj) {
        if (mo46008a(obj) != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo46018e(int i) {
        int i2 = i + 1;
        if (i2 < this.f64863f) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return m55000a(obj, C27535w.m55048a(obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.m<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        mo46010a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f64863f);
        for (int i = 0; i < this.f64863f; i++) {
            objectOutputStream.writeObject(this.f64859b[i]);
            objectOutputStream.writeObject(this.f64860c[i]);
        }
    }

    /* renamed from: c */
    public final V mo46013c(int i) {
        return m55000a(this.f64859b[i], (int) (this.f64858a[i] >>> 32));
    }

    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.f64863f; i++) {
            if (C27241i.m54222a(obj, this.f64860c[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int a = mo46008a(obj);
        mo46009a(a);
        if (a == -1) {
            return null;
        }
        return (V) this.f64860c[a];
    }

    /* renamed from: a */
    public final int mo46008a(Object obj) {
        int a = C27535w.m55048a(obj);
        int[] iArr = this.f64864g;
        int i = iArr[(iArr.length - 1) & a];
        while (i != -1) {
            long j = this.f64858a[i];
            if (((int) (j >>> 32)) == a && C27241i.m54222a(obj, this.f64859b[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo46012b(int i) {
        this.f64859b = Arrays.copyOf(this.f64859b, i);
        this.f64860c = Arrays.copyOf(this.f64860c, i);
        long[] jArr = this.f64858a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f64858a = copyOf;
    }

    /* renamed from: g */
    private void m55002g(int i) {
        if (this.f64864g.length >= 1073741824) {
            this.f64865h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f64861d)) + 1;
        int[] f = m55001f(i);
        long[] jArr = this.f64858a;
        int length = f.length - 1;
        for (int i3 = 0; i3 < this.f64863f; i3++) {
            int i4 = (int) (jArr[i3] >>> 32);
            int i5 = i4 & length;
            int i6 = f[i5];
            f[i5] = i3;
            jArr[i3] = (((long) i4) << 32) | (((long) i6) & 4294967295L);
        }
        this.f64865h = i2;
        this.f64864g = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo46017d(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f64859b;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f64860c;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f64858a;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int[] iArr = this.f64864g;
            int length = ((int) (j >>> 32)) & (iArr.length - 1);
            int i2 = iArr[length];
            if (i2 == size) {
                iArr[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.f64858a;
                long j2 = jArr2[i2];
                int i3 = (int) j2;
                if (i3 == size) {
                    jArr2[i2] = m54999a(j2, i);
                    return;
                }
                i2 = i3;
            }
        } else {
            this.f64859b[i] = null;
            this.f64860c[i] = null;
            this.f64858a[i] = -1;
        }
    }

    C27515m(int i, byte b) {
        mo46010a(i, 1.0f);
    }

    /* renamed from: a */
    private V m55000a(Object obj, int i) {
        int[] iArr = this.f64864g;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f64858a[i2] >>> 32)) != i || !C27241i.m54222a(obj, this.f64859b[i2])) {
                int i4 = (int) this.f64858a[i2];
                if (i4 == -1) {
                    return null;
                }
                i3 = i2;
                i2 = i4;
            } else {
                V v = (V) this.f64860c[i2];
                if (i3 == -1) {
                    this.f64864g[length] = (int) this.f64858a[i2];
                } else {
                    long[] jArr = this.f64858a;
                    jArr[i3] = m54999a(jArr[i3], (int) jArr[i2]);
                }
                mo46017d(i2);
                this.f64863f--;
                this.f64862e++;
                return v;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        long[] jArr = this.f64858a;
        Object[] objArr = this.f64859b;
        Object[] objArr2 = this.f64860c;
        int a = C27535w.m55048a(k);
        int[] iArr = this.f64864g;
        int length = (iArr.length - 1) & a;
        int i = this.f64863f;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) != a || !C27241i.m54222a(k, objArr[i2])) {
                    int i3 = (int) j;
                    if (i3 == -1) {
                        jArr[i2] = m54999a(j, i);
                        break;
                    }
                    i2 = i3;
                } else {
                    V v2 = (V) objArr2[i2];
                    objArr2[i2] = v;
                    mo46009a(i2);
                    return v2;
                }
            }
        }
        int i4 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            int i5 = i + 1;
            int length2 = this.f64858a.length;
            if (i5 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i4 = max;
                }
                if (i4 != length2) {
                    mo46012b(i4);
                }
            }
            mo46011a(i, k, v, a);
            this.f64863f = i5;
            if (i >= this.f64865h) {
                m55002g(this.f64864g.length * 2);
            }
            this.f64862e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46010a(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54236a(z, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        C27245k.m54236a(z2, "Illegal load factor");
        int a = C27535w.m55047a(i, (double) f);
        this.f64864g = m55001f(a);
        this.f64861d = f;
        this.f64859b = new Object[i];
        this.f64860c = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f64858a = jArr;
        this.f64865h = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo46011a(int i, K k, V v, int i2) {
        this.f64858a[i] = (((long) i2) << 32) | 4294967295L;
        this.f64859b[i] = k;
        this.f64860c[i] = v;
    }
}
