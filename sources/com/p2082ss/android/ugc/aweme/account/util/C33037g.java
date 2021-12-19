package com.p2082ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.C31633e;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.account.util.g */
public final class C33037g {
    static {
        Covode.recordClassIndex(39844);
    }

    /* renamed from: a */
    public static void m67671a(Context context) {
        String str;
        String str2;
        String b = C31633e.m65944b();
        String a = C31633e.m65943a();
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(a)) {
            if (C80580in.m139687c()) {
                str2 = "https://www.tiktok.com/account/confirm";
            } else {
                str2 = "https://www.tiktok.com/account/check";
            }
            str = str2 + "?locale=" + SettingServiceImpl.m120782v().mo108872h();
        } else {
            if (C80580in.m139687c()) {
                b = a;
            }
            str = b + "locale=" + SettingServiceImpl.m120782v().mo108872h();
        }
        SmartRouter.buildRoute(context, "//webview/").withParam("url", str).withParam("hide_status_bar", true).withParam("hide_nav_bar", true).open();
    }
}
