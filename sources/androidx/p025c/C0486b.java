package androidx.p025c;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.c.b */
public final class C0486b<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f1838c = new int[0];

    /* renamed from: d */
    private static final Object[] f1839d = new Object[0];

    /* renamed from: e */
    private static Object[] f1840e;

    /* renamed from: f */
    private static int f1841f;

    /* renamed from: g */
    private static Object[] f1842g;

    /* renamed from: h */
    private static int f1843h;

    /* renamed from: a */
    public Object[] f1844a;

    /* renamed from: b */
    int f1845b;

    /* renamed from: i */
    private int[] f1846i;

    /* renamed from: j */
    private AbstractC0491f<E, E> f1847j;

    public final int size() {
        return this.f1845b;
    }

    public C0486b() {
        this(0);
    }

    public final boolean isEmpty() {
        if (this.f1845b <= 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(552);
    }

    public final int hashCode() {
        int[] iArr = this.f1846i;
        int i = this.f1845b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final Object[] toArray() {
        int i = this.f1845b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1844a, 0, objArr, 0, i);
        return objArr;
    }

    public final void clear() {
        int i = this.f1845b;
        if (i != 0) {
            m1735a(this.f1846i, this.f1844a, i);
            this.f1846i = f1838c;
            this.f1844a = f1839d;
            this.f1845b = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<E> iterator() {
        if (this.f1847j == null) {
            this.f1847j = new AbstractC0491f<E, E>() {
                /* class androidx.p025c.C0486b.C04871 */

                static {
                    Covode.recordClassIndex(553);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final int mo2049a() {
                    return C0486b.this.f1845b;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: c */
                public final void mo2057c() {
                    C0486b.this.clear();
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: b */
                public final Map<E, E> mo2056b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: b */
                public final int mo2055b(Object obj) {
                    return C0486b.this.mo2058a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final int mo2050a(Object obj) {
                    return C0486b.this.mo2058a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final void mo2053a(int i) {
                    C0486b.this.mo2059a(i);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final Object mo2051a(int i, int i2) {
                    return C0486b.this.f1844a[i];
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final E mo2052a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                @Override // androidx.p025c.AbstractC0491f
                /* renamed from: a */
                public final void mo2054a(E e, E e2) {
                    C0486b.this.add(e);
                }
            };
        }
        return this.f1847j.mo2102d().iterator();
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1845b * 14);
        sb.append('{');
        for (int i = 0; i < this.f1845b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1844a[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private int m1733a() {
        int i = this.f1845b;
        if (i == 0) {
            return -1;
        }
        int a = C0488c.m1749a(this.f1846i, i, 0);
        if (a < 0 || this.f1844a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1846i[i2] == 0) {
            if (this.f1844a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1846i[i3] == 0) {
            if (this.f1844a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public C0486b(Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: a */
    public final int mo2058a(Object obj) {
        if (obj == null) {
            return m1733a();
        }
        return m1734a(obj, obj.hashCode());
    }

    public final boolean contains(Object obj) {
        if (mo2058a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int a = mo2058a(obj);
        if (a < 0) {
            return false;
        }
        mo2059a(a);
        return true;
    }

    public C0486b(int i) {
        if (i == 0) {
            this.f1846i = f1838c;
            this.f1844a = f1839d;
        } else {
            m1736b(i);
        }
        this.f1845b = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1845b - 1; i >= 0; i--) {
            if (!collection.contains(this.f1844a[i])) {
                mo2059a(i);
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.c.b<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f1845b + collection.size();
        int[] iArr = this.f1846i;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1844a;
            m1736b(size);
            int i = this.f1845b;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1846i, 0, i);
                System.arraycopy(objArr, 0, this.f1844a, 0, this.f1845b);
            }
            m1735a(iArr, objArr, this.f1845b);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1845b; i++) {
                try {
                    if (!set.contains(this.f1844a[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1845b) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1845b));
        }
        System.arraycopy(this.f1844a, 0, tArr, 0, this.f1845b);
        int length = tArr.length;
        int i = this.f1845b;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    private void m1736b(int i) {
        if (i == 8) {
            synchronized (C0486b.class) {
                Object[] objArr = f1842g;
                if (objArr != null) {
                    this.f1844a = objArr;
                    f1842g = (Object[]) objArr[0];
                    this.f1846i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1843h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0486b.class) {
                Object[] objArr2 = f1840e;
                if (objArr2 != null) {
                    this.f1844a = objArr2;
                    f1840e = (Object[]) objArr2[0];
                    this.f1846i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1841f--;
                    return;
                }
            }
        }
        this.f1846i = new int[i];
        this.f1844a = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int hashCode;
        int a;
        if (e == null) {
            a = m1733a();
            hashCode = 0;
        } else {
            hashCode = e.hashCode();
            a = m1734a(e, hashCode);
        }
        if (a >= 0) {
            return false;
        }
        int i = a ^ -1;
        int i2 = this.f1845b;
        int[] iArr = this.f1846i;
        if (i2 >= iArr.length) {
            int i3 = 4;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i3 = 8;
            }
            Object[] objArr = this.f1844a;
            m1736b(i3);
            int[] iArr2 = this.f1846i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1844a, 0, objArr.length);
            }
            m1735a(iArr, objArr, this.f1845b);
        }
        int i4 = this.f1845b;
        if (i < i4) {
            int[] iArr3 = this.f1846i;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.f1844a;
            System.arraycopy(objArr2, i, objArr2, i5, this.f1845b - i);
        }
        this.f1846i[i] = hashCode;
        this.f1844a[i] = e;
        this.f1845b++;
        return true;
    }

    /* renamed from: a */
    public final E mo2059a(int i) {
        Object[] objArr = this.f1844a;
        E e = (E) objArr[i];
        int i2 = this.f1845b;
        if (i2 <= 1) {
            m1735a(this.f1846i, objArr, i2);
            this.f1846i = f1838c;
            this.f1844a = f1839d;
            this.f1845b = 0;
        } else {
            int[] iArr = this.f1846i;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f1845b = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr2 = this.f1844a;
                    System.arraycopy(objArr2, i5, objArr2, i, this.f1845b - i);
                }
                this.f1844a[this.f1845b] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m1736b(i3);
                this.f1845b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1846i, 0, i);
                    System.arraycopy(objArr, 0, this.f1844a, 0, i);
                }
                int i6 = this.f1845b;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f1846i, i, i6 - i);
                    System.arraycopy(objArr, i7, this.f1844a, i, this.f1845b - i);
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private int m1734a(Object obj, int i) {
        int i2 = this.f1845b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0488c.m1749a(this.f1846i, i2, i);
        if (a < 0 || obj.equals(this.f1844a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1846i[i3] == i) {
            if (obj.equals(this.f1844a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1846i[i4] == i) {
            if (obj.equals(this.f1844a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m1735a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0486b.class) {
                if (f1843h < 10) {
                    objArr[0] = f1842g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1842g = objArr;
                    f1843h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0486b.class) {
                if (f1841f < 10) {
                    objArr[0] = f1840e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1840e = objArr;
                    f1841f++;
                }
            }
        }
    }
}
