package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.app.services.IWebViewService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;

/* renamed from: com.ss.android.ugc.aweme.account.n.g */
public final class C32857g {
    static {
        Covode.recordClassIndex(39642);
    }

    /* renamed from: a */
    public static void m67458a(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C39162r.m79460a("click_feedback_entrance", new C31376a().mo57399a("enter_method", str2).mo57399a("enter_from", str).f75156a);
            try {
                SmartRouter.buildRoute(context, C52912c.f121688a.f121689b.getFeedbackConf().getNotLoggedIn()).open();
            } catch (C16041a unused) {
                C29844g gVar = new C29844g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?id=5678&hide_nav_bar=1");
                gVar.mo52130a("enter_from", str);
                gVar.mo52130a("locale", ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a());
                ((IWebViewService) C31291a.m65463a(IWebViewService.class)).mo60088a(context, gVar.toString());
            }
        }
    }

    /* renamed from: b */
    public static void m67459b(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C39162r.m79460a("click_feedback_entrance", new C31376a().mo57399a("enter_method", str2).mo57399a("enter_from", str).f75156a);
            try {
                C36125t.m73598a(C36125t.m73591a(), C52912c.f121688a.f121689b.getFeedbackConf().getNormalEntry());
            } catch (Exception unused) {
                C29844g gVar = new C29844g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
                gVar.mo52130a("enter_from", str);
                gVar.mo52130a("locale", ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a());
                ((IWebViewService) C31291a.m65463a(IWebViewService.class)).mo60088a(context, gVar.toString());
            }
        }
    }

    /* renamed from: a */
    public static String m67457a(String str, Uri uri, String str2, String str3, String str4, String str5) {
        Uri.Builder buildUpon = Uri.parse(uri.getQueryParameter(str)).buildUpon();
        buildUpon.appendQueryParameter("username", str2);
        buildUpon.appendQueryParameter("has_mobile", str3);
        buildUpon.appendQueryParameter("has_email", str4);
        Uri parse = Uri.parse(str5);
        for (String str6 : parse.getQueryParameterNames()) {
            buildUpon.appendQueryParameter(str6, parse.getQueryParameter(str6));
        }
        return buildUpon.toString();
    }
}
