package com.p2082ss.android.ugc.aweme.commerce.p2515d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33856v;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.d.a */
public final class C37493a {

    /* renamed from: a */
    public static final C37493a f88503a = new C37493a();

    private C37493a() {
    }

    static {
        Covode.recordClassIndex(44880);
    }

    /* renamed from: a */
    public static Long m75594a(Integer num) {
        if (num == null || num.intValue() != 0) {
            return null;
        }
        C33856v vVar = C33856v.C33858a.f80147a;
        C89219l.m154716b(vVar, "");
        return Long.valueOf(vVar.mo60114a());
    }

    /* renamed from: a */
    public static String m75595a(Aweme aweme, Integer num) {
        if (num != null && num.intValue() == 0) {
            return C59208ac.m108764b(aweme, num.intValue());
        }
        return null;
    }
}
