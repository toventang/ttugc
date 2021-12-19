package com.p2082ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32358ab;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32231m;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32294w;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2067$1 */
public final class TwoStepAuthenticationInterceptor$authFor2067$1<T> implements AbstractC88433f {
    final /* synthetic */ Context $context;
    final /* synthetic */ Map $postParams;
    final /* synthetic */ C32294w $twoStepVerificationData;
    final /* synthetic */ TwoStepAuthenticationInterceptor this$0;

    static {
        Covode.recordClassIndex(79898);
    }

    TwoStepAuthenticationInterceptor$authFor2067$1(TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor, Context context, C32294w wVar, Map map) {
        this.this$0 = twoStepAuthenticationInterceptor;
        this.$context = context;
        this.$twoStepVerificationData = wVar;
        this.$postParams = map;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m120126xfd2fdabb(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void accept(C32358ab abVar) {
        if (C89219l.m154714a((Object) "ok", (Object) abVar.f77176e)) {
            Intent intent = new Intent(this.$context, TwoStepVerifyPushFor2067Activity.class);
            intent.putExtra("ticket", this.$twoStepVerificationData.getVerify_ticket());
            intent.putExtra("wait_ticket", abVar.f77177f);
            intent.putExtra("sms_code_key", this.$twoStepVerificationData.getSms_code_key());
            intent.putExtra("profile_key", this.$twoStepVerificationData.getProfile_key());
            TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor = this.this$0;
            intent.putExtra("platform", twoStepAuthenticationInterceptor.getPlatForm(twoStepAuthenticationInterceptor.currentUrlPath, this.$postParams, EnumC32594j.PUSH_VERIFY));
            Intent intent2 = ((Activity) this.$context).getIntent();
            C89219l.m154716b(intent2, "");
            if (m120126xfd2fdabb(intent2) != null) {
                Intent intent3 = ((Activity) this.$context).getIntent();
                C89219l.m154716b(intent3, "");
                Bundle com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m120126xfd2fdabb(intent3);
                if (com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
                    C89219l.m154715b();
                }
                intent.putExtras(com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            }
            ArrayList arrayList = new ArrayList();
            List<String> list = abVar.f77181j;
            if (list != null) {
                arrayList.addAll(list);
            }
            intent.putExtra("device_list", arrayList);
            if (!(this.$context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            m120127x71531110(this.$context, intent);
            return;
        }
        C32231m a = C32231m.m66598a();
        String str = abVar.f77180i;
        if (str == null) {
            str = "server error";
        }
        a.mo58245a(new C31672b(null, null, 0, str, this.$twoStepVerificationData.getSms_code_key()));
    }

    /* renamed from: com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m120127x71531110(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }
}
