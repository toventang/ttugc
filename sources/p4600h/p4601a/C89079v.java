package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4619j.C89269g;

/* renamed from: h.a.v */
public class C89079v extends C89078u {
    static {
        Covode.recordClassIndex(105163);
    }

    /* renamed from: a */
    public static final int m154542a(List<?> list, int i) {
        int a = C89070n.m154517a((List) list);
        if (i >= 0 && a >= i) {
            return C89070n.m154517a((List) list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C89269g(0, C89070n.m154517a((List) list)) + "].");
    }
}
