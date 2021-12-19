package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.cx */
public final class C25881cx<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    static final Object f61007a = new Object();

    /* renamed from: b */
    transient Object f61008b;

    /* renamed from: c */
    transient int[] f61009c;

    /* renamed from: d */
    transient Object[] f61010d;

    /* renamed from: e */
    transient Object[] f61011e;

    /* renamed from: f */
    transient int f61012f = C25922ek.m50163a(3, 1);

    /* renamed from: g */
    transient int f61013g;

    /* renamed from: h */
    private transient Set<K> f61014h;

    /* renamed from: i */
    private transient Set<Map.Entry<K, V>> f61015i;

    /* renamed from: j */
    private transient Collection<V> f61016j;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo42243a() {
        if (this.f61008b == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo42250d() {
        this.f61012f += 32;
    }

    static {
        Covode.recordClassIndex(31296);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, V> mo42245b() {
        Object obj = this.f61008b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo42246c() {
        return (1 << (this.f61012f & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo42251e() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f61015i;
        if (set != null) {
            return set;
        }
        C25886db dbVar = new C25886db(this);
        this.f61015i = dbVar;
        return dbVar;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f61014h;
        if (set != null) {
            return set;
        }
        C25888dd ddVar = new C25888dd(this);
        this.f61014h = ddVar;
        return ddVar;
    }

    public final int size() {
        Map<K, V> b = mo42245b();
        if (b != null) {
            return b.size();
        }
        return this.f61013g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f61016j;
        if (collection != null) {
            return collection;
        }
        C25890df dfVar = new C25890df(this);
        this.f61016j = dfVar;
        return dfVar;
    }

    C25881cx() {
        C25866ci.m50069a(true, (Object) "Expected size must be >= 0");
    }

    public final void clear() {
        if (!mo42243a()) {
            mo42250d();
            Map<K, V> b = mo42245b();
            if (b != null) {
                this.f61012f = C25922ek.m50163a(size(), 3);
                b.clear();
                this.f61008b = null;
                this.f61013g = 0;
                return;
            }
            Arrays.fill(this.f61010d, 0, this.f61013g, (Object) null);
            Arrays.fill(this.f61011e, 0, this.f61013g, (Object) null);
            Object obj = this.f61008b;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f61009c, 0, this.f61013g, 0);
            this.f61013g = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo42240a(int i) {
        int i2 = i + 1;
        if (i2 < this.f61013g) {
            return i2;
        }
        return -1;
    }

    /* renamed from: b */
    private final void m50085b(int i) {
        this.f61012f = C25889de.m50102a(this.f61012f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public final boolean containsKey(Object obj) {
        Map<K, V> b = mo42245b();
        if (b != null) {
            return b.containsKey(obj);
        }
        if (mo42241a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> b = mo42245b();
        if (b != null) {
            return b.get(obj);
        }
        int a = mo42241a(obj);
        if (a == -1) {
            return null;
        }
        return (V) this.f61011e[a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> b = mo42245b();
        if (b != null) {
            return b.remove(obj);
        }
        V v = (V) mo42244b(obj);
        if (v == f61007a) {
            return null;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo42244b(Object obj) {
        if (mo42243a()) {
            return f61007a;
        }
        int c = mo42246c();
        int a = C25889de.m50104a(obj, null, c, this.f61008b, this.f61009c, this.f61010d, null);
        if (a == -1) {
            return f61007a;
        }
        Object obj2 = this.f61011e[a];
        mo42242a(a, c);
        this.f61013g--;
        mo42250d();
        return obj2;
    }

    public final boolean containsValue(Object obj) {
        Map<K, V> b = mo42245b();
        if (b != null) {
            return b.containsValue(obj);
        }
        for (int i = 0; i < this.f61013g; i++) {
            if (C25865ch.m50063a(obj, this.f61011e[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo42241a(Object obj) {
        if (mo42243a()) {
            return -1;
        }
        int a = C25891dg.m50109a(obj);
        int c = mo42246c();
        int a2 = C25889de.m50103a(this.f61008b, a & c);
        if (a2 == 0) {
            return -1;
        }
        int i = c ^ -1;
        int i2 = a & i;
        do {
            int i3 = a2 - 1;
            int i4 = this.f61009c[i3];
            if ((i4 & i) == i2 && C25865ch.m50063a(obj, this.f61010d[i3])) {
                return i3;
            }
            a2 = i4 & c;
        } while (a2 != 0);
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42242a(int i, int i2) {
        int i3;
        int[] iArr;
        int i4;
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f61010d;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f61011e;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr2 = this.f61009c;
            iArr2[i] = iArr2[size];
            iArr2[size] = 0;
            int a = C25891dg.m50109a(obj) & i2;
            int a2 = C25889de.m50103a(this.f61008b, a);
            int i5 = size + 1;
            if (a2 == i5) {
                C25889de.m50106a(this.f61008b, a, i + 1);
                return;
            }
            do {
                i3 = a2 - 1;
                iArr = this.f61009c;
                i4 = iArr[i3];
                a2 = i4 & i2;
            } while (a2 != i5);
            iArr[i3] = C25889de.m50102a(i4, i + 1, i2);
            return;
        }
        this.f61010d[i] = null;
        this.f61011e[i] = null;
        this.f61009c[i] = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int min;
        if (mo42243a()) {
            C25866ci.m50071b(mo42243a(), "Arrays already allocated");
            int i = this.f61012f;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            double d = (double) highestOneBit;
            Double.isNaN(d);
            if (max > ((int) (d * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f61008b = C25889de.m50105a(max2);
            m50085b(max2 - 1);
            this.f61009c = new int[i];
            this.f61010d = new Object[i];
            this.f61011e = new Object[i];
        }
        Map<K, V> b = mo42245b();
        if (b != null) {
            return b.put(k, v);
        }
        int[] iArr = this.f61009c;
        Object[] objArr = this.f61010d;
        Object[] objArr2 = this.f61011e;
        int i2 = this.f61013g;
        int i3 = i2 + 1;
        int a = C25891dg.m50109a(k);
        int c = mo42246c();
        int i4 = a & c;
        int a2 = C25889de.m50103a(this.f61008b, i4);
        if (a2 != 0) {
            int i5 = c ^ -1;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = a2 - 1;
                int i9 = iArr[i8];
                if ((i9 & i5) != i6 || !C25865ch.m50063a(k, objArr[i8])) {
                    int i10 = i9 & c;
                    i7++;
                    if (i10 != 0) {
                        a2 = i10;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mo42246c() + 1, 1.0f);
                        int e = mo42251e();
                        while (e >= 0) {
                            linkedHashMap.put(this.f61010d[e], this.f61011e[e]);
                            e = mo42240a(e);
                        }
                        this.f61008b = linkedHashMap;
                        this.f61009c = null;
                        this.f61010d = null;
                        this.f61011e = null;
                        mo42250d();
                        return (V) linkedHashMap.put(k, v);
                    } else if (i3 > c) {
                        c = m50084a(c, C25889de.m50107b(c), a, i2);
                    } else {
                        iArr[i8] = C25889de.m50102a(i9, i3, c);
                    }
                } else {
                    V v2 = (V) objArr2[i8];
                    objArr2[i8] = v;
                    return v2;
                }
            }
        } else if (i3 > c) {
            c = m50084a(c, C25889de.m50107b(c), a, i2);
        } else {
            C25889de.m50106a(this.f61008b, i4, i3);
        }
        int length = this.f61009c.length;
        if (i3 > length && (min = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            this.f61009c = Arrays.copyOf(this.f61009c, min);
            this.f61010d = Arrays.copyOf(this.f61010d, min);
            this.f61011e = Arrays.copyOf(this.f61011e, min);
        }
        this.f61009c[i2] = C25889de.m50102a(a, 0, c);
        this.f61010d[i2] = k;
        this.f61011e[i2] = v;
        this.f61013g = i3;
        mo42250d();
        return null;
    }

    /* renamed from: a */
    private final int m50084a(int i, int i2, int i3, int i4) {
        Object a = C25889de.m50105a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C25889de.m50106a(a, i3 & i5, i4 + 1);
        }
        Object obj = this.f61008b;
        int[] iArr = this.f61009c;
        for (int i6 = 0; i6 <= i; i6++) {
            int a2 = C25889de.m50103a(obj, i6);
            while (a2 != 0) {
                int i7 = a2 - 1;
                int i8 = iArr[i7];
                int i9 = ((i ^ -1) & i8) | i6;
                int i10 = i9 & i5;
                int a3 = C25889de.m50103a(a, i10);
                C25889de.m50106a(a, i10, a2);
                iArr[i7] = C25889de.m50102a(i9, a3, i5);
                a2 = i8 & i;
            }
        }
        this.f61008b = a;
        m50085b(i5);
        return i5;
    }
}
