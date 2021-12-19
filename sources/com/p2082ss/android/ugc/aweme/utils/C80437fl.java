package com.p2082ss.android.ugc.aweme.utils;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.fl */
public final class C80437fl {

    /* renamed from: a */
    public static final C80437fl f180016a = new C80437fl();

    private C80437fl() {
    }

    static {
        Covode.recordClassIndex(93705);
    }

    /* renamed from: a */
    public static String m139445a(long j) {
        String a = C1764a.m5928a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1048576.0f)}, 1));
        C89219l.m154716b(a, "");
        if (!C89361p.m154876c(a, "0", false) || !C89361p.m154908a((CharSequence) a, (CharSequence) ".", false)) {
            return a;
        }
        int a2 = C89361p.m154888a((CharSequence) a, ".", 0, false, 6);
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String substring = a.substring(0, a2);
        C89219l.m154716b(substring, "");
        return substring;
    }
}
