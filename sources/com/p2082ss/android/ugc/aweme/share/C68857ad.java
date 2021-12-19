package com.p2082ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29844g;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.share.ad */
public final class C68857ad {
    static {
        Covode.recordClassIndex(81158);
    }

    /* renamed from: a */
    public static String m121524a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("utm_source")) {
            return str.replaceAll("utm_source=\\w*_?\\w?", "utm_source=".concat(String.valueOf(str2)));
        }
        C29844g gVar = new C29844g(str);
        gVar.mo52130a("utm_source", str2);
        gVar.mo52130a("utm_campaign", "client_share");
        gVar.mo52130a("utm_medium", "android");
        gVar.mo52130a("share_iid", AppLog.getInstallId());
        gVar.mo52130a("share_link_id", new StringBuilder().append(UUID.randomUUID()).toString());
        gVar.mo52128a("share_app_id", C17867d.f42590n);
        return gVar.mo52126a();
    }

    /* renamed from: a */
    public static String m121525a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        return C68863ah.f154028b.mo109358a(str, str2, str3).cL_();
    }
}
