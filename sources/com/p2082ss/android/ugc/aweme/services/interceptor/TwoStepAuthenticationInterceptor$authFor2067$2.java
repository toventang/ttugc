package com.p2082ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32231m;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32294w;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2067$2 */
public final class TwoStepAuthenticationInterceptor$authFor2067$2<T> implements AbstractC88433f {
    final /* synthetic */ C32294w $twoStepVerificationData;

    static {
        Covode.recordClassIndex(79899);
    }

    TwoStepAuthenticationInterceptor$authFor2067$2(C32294w wVar) {
        this.$twoStepVerificationData = wVar;
    }

    public final void accept(Throwable th) {
        C32231m a = C32231m.m66598a();
        String message = th.getMessage();
        if (message == null) {
            message = "server error";
        }
        a.mo58245a(new C31672b(null, null, 0, message, this.$twoStepVerificationData.getSms_code_key()));
    }
}
