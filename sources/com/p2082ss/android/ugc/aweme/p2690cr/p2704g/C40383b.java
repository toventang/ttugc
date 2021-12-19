package com.p2082ss.android.ugc.aweme.p2690cr.p2704g;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.setting.C68028bn;

/* renamed from: com.ss.android.ugc.aweme.cr.g.b */
public final class C40383b {

    /* renamed from: a */
    public static final String f94570a = "privacy_setting_permission";

    /* renamed from: b */
    public static final Keva f94571b;

    /* renamed from: c */
    public static int f94572c;

    /* renamed from: d */
    public static int f94573d;

    /* renamed from: e */
    public static final C40383b f94574e = new C40383b();

    private C40383b() {
    }

    static {
        Covode.recordClassIndex(48184);
        Keva repo = Keva.getRepo("publish_privacy_settings_cache");
        f94571b = repo;
        f94572c = repo.getInt("privacy_setting_comment", 0);
    }

    /* renamed from: a */
    public static int m81651a() {
        C39252m a;
        if (C68028bn.m120330a() == 0 || (a = C39223a.m79605s().mo68676a("video_visibility_select")) == null || a.f92732a != 1) {
            return f94571b.getInt(m81652a(f94570a), 0);
        }
        return f94571b.getInt(m81652a(f94570a), -1);
    }

    /* renamed from: a */
    public static String m81652a(String str) {
        String c = C63244g.m114602a().mo73255A().mo93904c();
        if (c == null || c.length() == 0) {
            return str;
        }
        return str + c;
    }
}
