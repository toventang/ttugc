package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.ugc.aweme.account.util.C33028a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.n.b */
public final class C32849b {

    /* renamed from: a */
    public static final C32849b f78223a = new C32849b();

    private C32849b() {
    }

    static {
        Covode.recordClassIndex(39634);
    }

    /* renamed from: a */
    public static void m67443a(int i) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            if (C33028a.m67665a()) {
                str = "https://";
            } else {
                str = "";
            }
            String cookie = CookieManager.getInstance().getCookie(sb.append(str).append("tiktokv.com").toString());
            boolean z = true;
            if (!TextUtils.isEmpty(cookie)) {
                C89219l.m154716b(cookie, "");
                if (C89361p.m154929e((CharSequence) cookie, (CharSequence) "sessionid")) {
                    return;
                }
            }
            if (C34717d.m70908a(C22898a.m43150a(C17867d.m33078a()).mo23739d(".tiktokv.com"))) {
                z = false;
            }
            C33744d a = new C33744d().mo59983a("cookie1", cookie);
            int i2 = 2;
            C33744d a2 = a.mo59980a("empty", 2);
            if (!z) {
                i2 = 3;
            }
            C33744d a3 = a2.mo59980a("in_share_cookie", i2);
            if (!z) {
                a3.mo59983a("share_cookie", C34822d.m71158a(C17867d.m33078a(), "ss_app_config", 0).getString("share_cookie_host_list", ""));
            }
            a3.mo59980a("enter_from", i);
            C39162r.m79460a("cookie_status", a3.f79943a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
