package com.p2082ss.android.ugc.aweme.deeplink.actions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IPreLoginHandleService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.PreLoginHandleService;
import com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b;
import com.p2082ss.android.ugc.aweme.launcher.service.mob.C58081a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.ImFansAction */
public final class ImFansAction extends AbstractC41008b<C89391z> {
    static {
        Covode.recordClassIndex(48871);
    }

    /* renamed from: com_ss_android_ugc_aweme_deeplink_actions_ImFansAction_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m82624x559ab9ac(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b
    public final C89378p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        return new C89378p<>(C89219l.m154704a(parse.getHost(), (Object) parse.getPath()), hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41006a
    public final boolean doRealOpen(Context context, String str, HashMap<String, Object> hashMap, ArrayList<Integer> arrayList) {
        boolean z;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("multi_account_push_uid");
        String queryParameter2 = parse.getQueryParameter("is_from_notification");
        if (queryParameter2 != null) {
            Objects.requireNonNull(queryParameter2, "null cannot be cast to non-null type kotlin.Boolean");
            z = ((Boolean) queryParameter2).booleanValue();
        } else {
            z = false;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        intent.putExtra("from_where", 0);
        String queryParameter3 = parse.getQueryParameter("label");
        C58081a.f132324a.mo60040a(queryParameter3, parse, z);
        if (TextUtils.equals(queryParameter3, "check_profile")) {
            intent.putExtra("push", true);
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        IPreLoginHandleService a = PreLoginHandleService.m65588a();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            a.mo57229a((Activity) context, intent, queryParameter);
            return false;
        }
        m82624x559ab9ac(context, intent);
        return true;
    }
}
