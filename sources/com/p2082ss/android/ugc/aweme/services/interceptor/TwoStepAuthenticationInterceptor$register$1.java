package com.p2082ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.p2248g.AbstractC31671a;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$register$1 */
public final class TwoStepAuthenticationInterceptor$register$1 implements AbstractC31671a {
    final /* synthetic */ C1743j $tcs;

    static {
        Covode.recordClassIndex(79900);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$register$1_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m120128xd537c66f(String str, String str2) {
        return 0;
    }

    TwoStepAuthenticationInterceptor$register$1(C1743j jVar) {
        this.$tcs = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2248g.AbstractC31671a
    public final void onComplete(C31672b bVar) {
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            m120128xd537c66f("I18n.TwoStepInterceptor", "startTwoStepAuthentication, onComplete: ".concat(String.valueOf(bVar)));
        }
        this.$tcs.mo5557b(bVar);
    }
}
