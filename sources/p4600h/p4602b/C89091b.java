package p4600h.p4602b;

import com.bytedance.covode.number.Covode;

/* renamed from: h.b.b */
public class C89091b {
    static {
        Covode.recordClassIndex(105175);
    }

    /* renamed from: a */
    public static final <T extends Comparable<?>> int m154604a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
