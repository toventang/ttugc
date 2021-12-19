package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.i */
public final class C32646i {
    static {
        Covode.recordClassIndex(39425);
    }

    /* renamed from: a */
    public static final void m67195a(AbstractC32572b bVar, boolean z, int i) {
        C89219l.m154721d(bVar, "");
        C31376a aVar = new C31376a();
        aVar.mo57399a("enter_from", bVar.mo58466w());
        aVar.mo57399a("enter_method", bVar.mo58467x());
        aVar.mo57397a("is_success", z ? 1 : 0);
        aVar.mo57397a("error_code", i);
        C39162r.m79460a("email_code_verification_result", aVar.f75156a);
    }
}
