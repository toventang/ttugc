package p4600h.p4607d;

import com.bytedance.covode.number.Covode;

/* renamed from: h.d.c */
public final class C89142c {
    static {
        Covode.recordClassIndex(105226);
    }

    /* renamed from: a */
    private static final int m154632a(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }

    /* renamed from: a */
    public static final int m154633a(int i, int i2, int i3) {
        return m154632a(m154632a(i, i3) - m154632a(i2, i3), i3);
    }
}
