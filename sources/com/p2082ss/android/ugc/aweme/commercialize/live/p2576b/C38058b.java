package com.p2082ss.android.ugc.aweme.commercialize.live.p2576b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.b.b */
public final class C38058b {

    /* renamed from: a */
    public static final String f89928a = "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1";

    /* renamed from: b */
    public static final C38058b f89929b = new C38058b();

    private C38058b() {
    }

    static {
        Covode.recordClassIndex(45524);
    }

    /* renamed from: a */
    public static final String m77136a() {
        String a = SettingsManager.m29616a().mo25398a("live_links_report_schema", "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1");
        C89219l.m154716b(a, "");
        if (TextUtils.isEmpty(a)) {
            return f89928a;
        }
        return a;
    }
}
