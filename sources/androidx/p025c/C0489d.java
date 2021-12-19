package androidx.p025c;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.c.d */
public class C0489d<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1852a = new Object();

    /* renamed from: b */
    private boolean f1853b;

    /* renamed from: c */
    private long[] f1854c;

    /* renamed from: d */
    private Object[] f1855d;

    /* renamed from: e */
    private int f1856e;

    public C0489d() {
        this(10);
    }

    static {
        Covode.recordClassIndex(555);
    }

    /* renamed from: b */
    public final int mo2080b() {
        if (this.f1853b) {
            m1754d();
        }
        return this.f1856e;
    }

    /* renamed from: d */
    private void m1754d() {
        int i = this.f1856e;
        long[] jArr = this.f1854c;
        Object[] objArr = this.f1855d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1852a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1853b = false;
        this.f1856e = i2;
    }

    /* renamed from: a */
    public final C0489d<E> clone() {
        try {
            C0489d<E> dVar = (C0489d) super.clone();
            dVar.f1854c = (long[]) this.f1854c.clone();
            dVar.f1855d = (Object[]) this.f1855d.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final void mo2086c() {
        int i = this.f1856e;
        Object[] objArr = this.f1855d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1856e = 0;
        this.f1853b = false;
    }

    public String toString() {
        if (mo2080b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1856e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1856e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2081b(i));
            sb.append('=');
            E c = mo2085c(i);
            if (c != this) {
                sb.append((Object) c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final E mo2077a(long j) {
        return mo2078a(j, null);
    }

    /* renamed from: a */
    public final void mo2079a(int i) {
        Object[] objArr = this.f1855d;
        Object obj = objArr[i];
        Object obj2 = f1852a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f1853b = true;
        }
    }

    /* renamed from: c */
    public final int mo2084c(long j) {
        if (this.f1853b) {
            m1754d();
        }
        return C0488c.m1750a(this.f1854c, this.f1856e, j);
    }

    /* renamed from: d */
    public final boolean mo2089d(long j) {
        if (mo2084c(j) >= 0) {
            return true;
        }
        return false;
    }

    public C0489d(int i) {
        if (i == 0) {
            this.f1854c = C0488c.f1850b;
            this.f1855d = C0488c.f1851c;
            return;
        }
        int b = C0488c.m1752b(i);
        this.f1854c = new long[b];
        this.f1855d = new Object[b];
    }

    /* renamed from: b */
    public final long mo2081b(int i) {
        if (this.f1853b) {
            m1754d();
        }
        return this.f1854c[i];
    }

    /* renamed from: c */
    public final E mo2085c(int i) {
        if (this.f1853b) {
            m1754d();
        }
        return (E) this.f1855d[i];
    }

    /* renamed from: b */
    public final void mo2082b(long j) {
        Object[] objArr;
        Object obj;
        int a = C0488c.m1750a(this.f1854c, this.f1856e, j);
        if (a >= 0 && (objArr = this.f1855d)[a] != (obj = f1852a)) {
            objArr[a] = obj;
            this.f1853b = true;
        }
    }

    /* renamed from: a */
    public final E mo2078a(long j, E e) {
        int a = C0488c.m1750a(this.f1854c, this.f1856e, j);
        if (a >= 0) {
            Object[] objArr = this.f1855d;
            if (objArr[a] != f1852a) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public final void mo2087c(long j, E e) {
        int i = this.f1856e;
        if (i == 0 || j > this.f1854c[i - 1]) {
            if (this.f1853b && i >= this.f1854c.length) {
                m1754d();
            }
            int i2 = this.f1856e;
            if (i2 >= this.f1854c.length) {
                int b = C0488c.m1752b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                long[] jArr2 = this.f1854c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1855d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1854c = jArr;
                this.f1855d = objArr;
            }
            this.f1854c[i2] = j;
            this.f1855d[i2] = e;
            this.f1856e = i2 + 1;
            return;
        }
        mo2083b(j, e);
    }

    /* renamed from: b */
    public final void mo2083b(long j, E e) {
        int a = C0488c.m1750a(this.f1854c, this.f1856e, j);
        if (a >= 0) {
            this.f1855d[a] = e;
            return;
        }
        int i = a ^ -1;
        int i2 = this.f1856e;
        if (i < i2) {
            Object[] objArr = this.f1855d;
            if (objArr[i] == f1852a) {
                this.f1854c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1853b && i2 >= this.f1854c.length) {
            m1754d();
            i = C0488c.m1750a(this.f1854c, this.f1856e, j) ^ -1;
        }
        int i3 = this.f1856e;
        if (i3 >= this.f1854c.length) {
            int b = C0488c.m1752b(i3 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.f1854c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1855d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1854c = jArr;
            this.f1855d = objArr2;
        }
        int i4 = this.f1856e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f1854c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f1855d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f1856e - i);
        }
        this.f1854c[i] = j;
        this.f1855d[i] = e;
        this.f1856e++;
    }
}
