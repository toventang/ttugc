package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46728bc;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.m */
public final class C75083m {

    /* renamed from: a */
    public static final C75083m f168744a = new C75083m();

    private C75083m() {
    }

    static {
        Covode.recordClassIndex(87955);
    }

    /* renamed from: a */
    public static boolean m131849a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.isLogin();
    }

    /* renamed from: b */
    private static String m131850b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.getCurUserId();
    }

    /* renamed from: a */
    public static String m131848a(String str) {
        C89219l.m154721d(str, "");
        String b = m131850b();
        if (C46728bc.m90110b()) {
            if (b != null) {
                return str + "_" + b;
            }
            return str;
        } else if (b != null) {
            return str + "_" + m131850b();
        } else {
            return str;
        }
    }
}
