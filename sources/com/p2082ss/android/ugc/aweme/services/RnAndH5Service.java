package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC35317bv;
import com.p2082ss.android.ugc.aweme.C35333c;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2246e.C31634a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32908a;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32919b;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32920c;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32921d;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32922e;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32923f;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32925g;
import com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32928h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.RnAndH5Service */
public final class RnAndH5Service implements AbstractC35317bv {
    static {
        Covode.recordClassIndex(79723);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_RnAndH5Service_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m120118xf1f5f78c(String str, String str2, Throwable th) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35317bv
    public final void notifyFromRnAndH5(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (TextUtils.equals("find_account_back", jSONObject.getString("eventName"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    C36085cj.m73542a(new C31634a(jSONObject2.getString("platform"), new JSONObject(jSONObject2.getString("user_info"))).f75671a);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("block_bind_phone", true);
                    C35333c.m72321a(bundle);
                    C39162r.m79460a("login_submit", new C31376a().mo57399a("platform", "sms_verification").mo57399a("enter_method", "").f75156a);
                    C39162r.m79460a("login_success", new C31376a().mo57399a("platform", "sms_verification").mo57399a("enter_method", "").mo57397a("status", 1).f75156a);
                    C31667a.m65983a(4);
                } else if (TextUtils.equals("rebindPhone_certify_success", jSONObject.getString("eventName"))) {
                    C31667a.m65983a(8);
                }
                if (TextUtils.equals(jSONObject.getString("eventName"), "account_recover_done")) {
                    C31667a.m65983a(12);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35317bv
    public final Map<String, AbstractC18293d> getJavaMethods(WeakReference<Context> weakReference, C18288a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        return C89041ag.m154428c(new C89378p("sendVerifyCode", new C32923f(weakReference, aVar)), new C89378p("validateVerifyCode", new C32928h(weakReference, aVar)), new C89378p("localPhoneNo", new C32908a(weakReference, aVar)), new C89378p("recentLoginUsersInfo", new C32922e(aVar)), new C89378p("open_2sv", new C32921d(weakReference, aVar)), new C89378p("loginH5Failed", new C32920c(weakReference, aVar)), new C89378p("loginFromH5", new C32919b(weakReference, aVar)), new C89378p("update_account_info", new C32925g(weakReference, aVar)));
    }
}
