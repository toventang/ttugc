package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import p4600h.p4619j.C89269g;

/* renamed from: h.m.b */
public class C89336b {
    static {
        Covode.recordClassIndex(105420);
    }

    /* renamed from: a */
    public static final boolean m154830a(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m154829a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C89269g(2, 36));
    }
}
