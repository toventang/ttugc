package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;

/* renamed from: h.f.b.t */
public abstract class AbstractC89227t<T> {

    /* renamed from: a */
    public int f202900a;

    /* renamed from: b */
    private final T[] f202901b = ((T[]) new Object[2]);

    /* renamed from: c */
    private final int f202902c = 2;

    static {
        Covode.recordClassIndex(105311);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo143625a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo143640c() {
        int i;
        int i2 = this.f202902c - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            while (true) {
                T t = this.f202901b[i4];
                if (t != null) {
                    i = mo143625a(t);
                } else {
                    i = 1;
                }
                i3 += i;
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public final void mo143639b(T t) {
        C89219l.m154721d(t, "");
        T[] tArr = this.f202901b;
        int i = this.f202900a;
        this.f202900a = i + 1;
        tArr[i] = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo143638a(T t, T t2) {
        int i;
        C89219l.m154721d(t, "");
        C89219l.m154721d(t2, "");
        int i2 = this.f202902c - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t3 = this.f202901b[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i6);
                        i += i6;
                    }
                    int a = mo143625a(t3);
                    System.arraycopy(t3, 0, t2, i, a);
                    i += a;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.f202902c;
        if (i3 < i7) {
            System.arraycopy(t, i3, t2, i, i7 - i3);
        }
        return t2;
    }
}
