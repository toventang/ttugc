package androidx.p025c;

import com.bytedance.covode.number.Covode;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: androidx.c.g */
public class C0497g<K, V> {

    /* renamed from: b */
    static Object[] f1879b;

    /* renamed from: c */
    static int f1880c;

    /* renamed from: d */
    static Object[] f1881d;

    /* renamed from: e */
    static int f1882e;

    /* renamed from: f */
    int[] f1883f;

    /* renamed from: g */
    Object[] f1884g;

    /* renamed from: h */
    int f1885h;

    static {
        Covode.recordClassIndex(563);
    }

    public int size() {
        return this.f1885h;
    }

    public boolean isEmpty() {
        if (this.f1885h <= 0) {
            return true;
        }
        return false;
    }

    public C0497g() {
        this.f1883f = C0488c.f1849a;
        this.f1884g = C0488c.f1851c;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f1883f;
        Object[] objArr = this.f1884g;
        int i = this.f1885h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public void clear() {
        int i = this.f1885h;
        if (i > 0) {
            int[] iArr = this.f1883f;
            Object[] objArr = this.f1884g;
            this.f1883f = C0488c.f1849a;
            this.f1884g = C0488c.f1851c;
            this.f1885h = 0;
            m1794a(iArr, objArr, i);
        }
        if (this.f1885h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private int m1791a() {
        int i = this.f1885h;
        if (i == 0) {
            return -1;
        }
        int a = m1793a(this.f1883f, i, 0);
        if (a < 0 || this.f1884g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1883f[i2] == 0) {
            if (this.f1884g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1883f[i3] == 0) {
            if (this.f1884g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1885h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1885h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b = mo2162b(i);
            if (b != this) {
                sb.append((Object) b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V c = mo2163c(i);
            if (c != this) {
                sb.append((Object) c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final K mo2162b(int i) {
        return (K) this.f1884g[i << 1];
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    /* renamed from: c */
    public final V mo2163c(int i) {
        return (V) this.f1884g[(i << 1) + 1];
    }

    public boolean containsKey(Object obj) {
        if (mo2158a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (mo2161b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public V remove(Object obj) {
        int a = mo2158a(obj);
        if (a >= 0) {
            return mo2167d(a);
        }
        return null;
    }

    public C0497g(int i) {
        if (i == 0) {
            this.f1883f = C0488c.f1849a;
            this.f1884g = C0488c.f1851c;
        } else {
            m1795e(i);
        }
        this.f1885h = 0;
    }

    /* renamed from: a */
    public final int mo2158a(Object obj) {
        if (obj == null) {
            return m1791a();
        }
        return m1792a(obj, obj.hashCode());
    }

    public C0497g(C0497g<K, V> gVar) {
        this();
        if (gVar != null) {
            int i = gVar.f1885h;
            mo2160a(this.f1885h + i);
            if (this.f1885h != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(gVar.mo2162b(i2), gVar.mo2163c(i2));
                }
            } else if (i > 0) {
                System.arraycopy(gVar.f1883f, 0, this.f1883f, 0, i);
                System.arraycopy(gVar.f1884g, 0, this.f1884g, 0, i << 1);
                this.f1885h = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo2161b(Object obj) {
        int i = this.f1885h * 2;
        Object[] objArr = this.f1884g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: e */
    private void m1795e(int i) {
        if (i == 8) {
            synchronized (C0497g.class) {
                Object[] objArr = f1881d;
                if (objArr != null) {
                    this.f1884g = objArr;
                    f1881d = (Object[]) objArr[0];
                    this.f1883f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1882e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0497g.class) {
                Object[] objArr2 = f1879b;
                if (objArr2 != null) {
                    this.f1884g = objArr2;
                    f1879b = (Object[]) objArr2[0];
                    this.f1883f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1880c--;
                    return;
                }
            }
        }
        this.f1883f = new int[i];
        this.f1884g = new Object[(i << 1)];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0497g) {
            C0497g gVar = (C0497g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f1885h; i++) {
                try {
                    K b = mo2162b(i);
                    V c = mo2163c(i);
                    Object obj2 = gVar.get(b);
                    if (c == null) {
                        if (obj2 == null) {
                            if (!gVar.containsKey(b)) {
                            }
                        }
                        return false;
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1885h; i2++) {
                try {
                    K b2 = mo2162b(i2);
                    V c2 = mo2163c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 == null) {
                            if (!map.containsKey(b2)) {
                            }
                        }
                        return false;
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final V mo2167d(int i) {
        Object[] objArr = this.f1884g;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f1885h;
        int i4 = 0;
        if (i3 <= 1) {
            m1794a(this.f1883f, objArr, i3);
            this.f1883f = C0488c.f1849a;
            this.f1884g = C0488c.f1851c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f1883f;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f1884g;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f1884g;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m1795e(i6);
                if (i3 == this.f1885h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f1883f, 0, i);
                        System.arraycopy(objArr, 0, this.f1884g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f1883f, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f1884g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f1885h) {
            this.f1885h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    public final void mo2160a(int i) {
        int i2 = this.f1885h;
        int[] iArr = this.f1883f;
        if (iArr.length < i) {
            Object[] objArr = this.f1884g;
            m1795e(i);
            if (this.f1885h > 0) {
                System.arraycopy(iArr, 0, this.f1883f, 0, i2);
                System.arraycopy(objArr, 0, this.f1884g, 0, i2 << 1);
            }
            m1794a(iArr, objArr, i2);
        }
        if (this.f1885h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public V getOrDefault(Object obj, V v) {
        int a = mo2158a(obj);
        return a >= 0 ? (V) this.f1884g[(a << 1) + 1] : v;
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V replace(K k, V v) {
        int a = mo2158a(k);
        if (a >= 0) {
            return mo2159a(a, v);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a = mo2158a(obj);
        if (a < 0) {
            return false;
        }
        V c = mo2163c(a);
        if (obj2 != c && (obj2 == null || !obj2.equals(c))) {
            return false;
        }
        mo2167d(a);
        return true;
    }

    /* renamed from: a */
    public final V mo2159a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1884g;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    private int m1792a(Object obj, int i) {
        int i2 = this.f1885h;
        if (i2 == 0) {
            return -1;
        }
        int a = m1793a(this.f1883f, i2, i);
        if (a < 0 || obj.equals(this.f1884g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1883f[i3] == i) {
            if (obj.equals(this.f1884g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1883f[i4] == i) {
            if (obj.equals(this.f1884g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public V put(K k, V v) {
        int hashCode;
        int a;
        int i = this.f1885h;
        if (k == null) {
            a = m1791a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            a = m1792a(k, hashCode);
        }
        if (a >= 0) {
            int i2 = (a << 1) + 1;
            Object[] objArr = this.f1884g;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = a ^ -1;
        int[] iArr = this.f1883f;
        if (i >= iArr.length) {
            int i4 = 4;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i >= 4) {
                i4 = 8;
            }
            Object[] objArr2 = this.f1884g;
            m1795e(i4);
            if (i == this.f1885h) {
                int[] iArr2 = this.f1883f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f1884g, 0, objArr2.length);
                }
                m1794a(iArr, objArr2, i);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr3 = this.f1883f;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.f1884g;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.f1885h - i3) << 1);
        }
        int i6 = this.f1885h;
        if (i == i6) {
            int[] iArr4 = this.f1883f;
            if (i3 < iArr4.length) {
                iArr4[i3] = hashCode;
                Object[] objArr4 = this.f1884g;
                int i7 = i3 << 1;
                objArr4[i7] = k;
                objArr4[i7 + 1] = v;
                this.f1885h = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    private static int m1793a(int[] iArr, int i, int i2) {
        try {
            return C0488c.m1749a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean replace(K k, V v, V v2) {
        int a = mo2158a(k);
        if (a < 0) {
            return false;
        }
        V c = mo2163c(a);
        if (c != v && (v == null || !v.equals(c))) {
            return false;
        }
        mo2159a(a, v2);
        return true;
    }

    /* renamed from: a */
    private static void m1794a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0497g.class) {
                if (f1882e < 10) {
                    objArr[0] = f1881d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1881d = objArr;
                    f1882e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0497g.class) {
                if (f1880c < 10) {
                    objArr[0] = f1879b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1879b = objArr;
                    f1880c++;
                }
            }
        }
    }
}
