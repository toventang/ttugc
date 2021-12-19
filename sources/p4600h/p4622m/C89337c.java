package p4600h.p4622m;

import com.bytedance.covode.number.Covode;

/* renamed from: h.m.c */
public class C89337c extends C89336b {
    static {
        Covode.recordClassIndex(105421);
    }

    /* renamed from: a */
    public static final boolean m154831a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
