package androidx.p025c;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.c.h */
public class C0498h<E> implements Cloneable {

    /* renamed from: d */
    private static final Object f1886d = new Object();

    /* renamed from: a */
    public boolean f1887a;

    /* renamed from: b */
    public Object[] f1888b;

    /* renamed from: c */
    public int f1889c;

    /* renamed from: e */
    private int[] f1890e;

    public C0498h() {
        this(10);
    }

    static {
        Covode.recordClassIndex(564);
    }

    /* renamed from: b */
    public final int mo2184b() {
        if (this.f1887a) {
            m1803c();
        }
        return this.f1889c;
    }

    /* renamed from: c */
    private void m1803c() {
        int i = this.f1889c;
        int[] iArr = this.f1890e;
        Object[] objArr = this.f1888b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1886d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1887a = false;
        this.f1889c = i2;
    }

    /* renamed from: a */
    public final C0498h<E> clone() {
        try {
            C0498h<E> hVar = (C0498h) super.clone();
            hVar.f1890e = (int[]) this.f1890e.clone();
            hVar.f1888b = (Object[]) this.f1888b.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (mo2184b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1889c * 28);
        sb.append('{');
        for (int i = 0; i < this.f1889c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2187c(i));
            sb.append('=');
            E d = mo2190d(i);
            if (d != this) {
                sb.append((Object) d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final E mo2182a(int i) {
        return mo2183a(i, null);
    }

    /* renamed from: c */
    public final int mo2187c(int i) {
        if (this.f1887a) {
            m1803c();
        }
        return this.f1890e[i];
    }

    /* renamed from: d */
    public final E mo2190d(int i) {
        if (this.f1887a) {
            m1803c();
        }
        return (E) this.f1888b[i];
    }

    /* renamed from: e */
    public final int mo2191e(int i) {
        if (this.f1887a) {
            m1803c();
        }
        return C0488c.m1749a(this.f1890e, this.f1889c, i);
    }

    public C0498h(int i) {
        if (i == 0) {
            this.f1890e = C0488c.f1849a;
            this.f1888b = C0488c.f1851c;
            return;
        }
        int a = C0488c.m1748a(i);
        this.f1890e = new int[a];
        this.f1888b = new Object[a];
    }

    /* renamed from: b */
    public final void mo2185b(int i) {
        Object[] objArr;
        Object obj;
        int a = C0488c.m1749a(this.f1890e, this.f1889c, i);
        if (a >= 0 && (objArr = this.f1888b)[a] != (obj = f1886d)) {
            objArr[a] = obj;
            this.f1887a = true;
        }
    }

    /* renamed from: a */
    public final E mo2183a(int i, E e) {
        int a = C0488c.m1749a(this.f1890e, this.f1889c, i);
        if (a >= 0) {
            Object[] objArr = this.f1888b;
            if (objArr[a] != f1886d) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public final void mo2188c(int i, E e) {
        int i2 = this.f1889c;
        if (i2 == 0 || i > this.f1890e[i2 - 1]) {
            if (this.f1887a && i2 >= this.f1890e.length) {
                m1803c();
            }
            int i3 = this.f1889c;
            if (i3 >= this.f1890e.length) {
                int a = C0488c.m1748a(i3 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                int[] iArr2 = this.f1890e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1888b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1890e = iArr;
                this.f1888b = objArr;
            }
            this.f1890e[i3] = i;
            this.f1888b[i3] = e;
            this.f1889c = i3 + 1;
            return;
        }
        mo2186b(i, e);
    }

    /* renamed from: b */
    public final void mo2186b(int i, E e) {
        int a = C0488c.m1749a(this.f1890e, this.f1889c, i);
        if (a >= 0) {
            this.f1888b[a] = e;
            return;
        }
        int i2 = a ^ -1;
        int i3 = this.f1889c;
        if (i2 < i3) {
            Object[] objArr = this.f1888b;
            if (objArr[i2] == f1886d) {
                this.f1890e[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f1887a && i3 >= this.f1890e.length) {
            m1803c();
            i2 = C0488c.m1749a(this.f1890e, this.f1889c, i) ^ -1;
        }
        int i4 = this.f1889c;
        if (i4 >= this.f1890e.length) {
            int a2 = C0488c.m1748a(i4 + 1);
            int[] iArr = new int[a2];
            Object[] objArr2 = new Object[a2];
            int[] iArr2 = this.f1890e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1888b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1890e = iArr;
            this.f1888b = objArr2;
        }
        int i5 = this.f1889c;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f1890e;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1888b;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1889c - i2);
        }
        this.f1890e[i2] = i;
        this.f1888b[i2] = e;
        this.f1889c++;
    }
}
