package com.p2082ss.android.ugc.aweme.account.p2274n;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.n.d */
public final class C32852d {

    /* renamed from: a */
    public static final C32852d f78226a = new C32852d();

    private C32852d() {
    }

    static {
        Covode.recordClassIndex(39637);
    }

    /* renamed from: a */
    public static final String m67445a(Exception exc) {
        C89219l.m154721d(exc, "");
        StringBuilder append = new StringBuilder().append(exc.getMessage());
        StackTraceElement[] stackTrace = exc.getStackTrace();
        int i = 0;
        if (!(stackTrace == null || stackTrace.length == 0)) {
            append.append(" | ");
            int length = stackTrace.length;
            int length2 = stackTrace.length;
            int i2 = 0;
            while (i < length2) {
                int i3 = i2 + 1;
                append.append(stackTrace[i]);
                if (i2 != length - 1) {
                    append.append("\n");
                }
                i++;
                i2 = i3;
            }
        }
        String sb = append.toString();
        C89219l.m154716b(sb, "");
        return sb;
    }
}
