package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.cl */
public final class C68063cl {

    /* renamed from: a */
    public static final String f152453a = "";

    /* renamed from: b */
    public static final C68063cl f152454b = new C68063cl();

    private C68063cl() {
    }

    static {
        Covode.recordClassIndex(80259);
    }

    /* renamed from: a */
    public static final String m120369a() {
        try {
            String a = SettingsManager.m29616a().mo25398a("profile_badge_android_cta", "");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return f152453a;
        }
    }
}
