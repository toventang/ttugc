package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;

/* renamed from: f.a.e.j.l */
public final class C88914l<T> {

    /* renamed from: a */
    final float f201918a;

    /* renamed from: b */
    int f201919b;

    /* renamed from: c */
    public int f201920c;

    /* renamed from: d */
    int f201921d;

    /* renamed from: e */
    public T[] f201922e;

    static {
        Covode.recordClassIndex(104956);
    }

    /* renamed from: a */
    private static int m154115a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public C88914l() {
        this(16);
    }

    /* renamed from: a */
    private void m154116a() {
        T[] tArr = this.f201922e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f201920c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m154115a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f201919b = i2;
                this.f201921d = (int) (((float) i) * this.f201918a);
                this.f201922e = tArr2;
                return;
            }
        }
    }

    public C88914l(byte b) {
        this(32);
    }

    private C88914l(int i) {
        this.f201918a = 0.75f;
        int a = C88915m.m154120a(i);
        this.f201919b = a - 1;
        this.f201921d = (int) (((float) a) * 0.75f);
        this.f201922e = (T[]) new Object[a];
    }

    /* renamed from: b */
    public final boolean mo143187b(T t) {
        T t2;
        T[] tArr = this.f201922e;
        int i = this.f201919b;
        int a = m154115a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m154117a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m154117a(a, tArr, i);
    }

    /* renamed from: a */
    public final boolean mo143186a(T t) {
        T t2;
        T[] tArr = this.f201922e;
        int i = this.f201919b;
        int a = m154115a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 != null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f201920c + 1;
        this.f201920c = i2;
        if (i2 >= this.f201921d) {
            m154116a();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m154117a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f201920c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m154115a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
