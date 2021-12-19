package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.cm */
public final class C68064cm {

    /* renamed from: a */
    public static final String f152455a = "";

    /* renamed from: b */
    public static final C68064cm f152456b = new C68064cm();

    private C68064cm() {
    }

    static {
        Covode.recordClassIndex(80260);
    }

    /* renamed from: a */
    public static final String m120370a() {
        try {
            String a = SettingsManager.m29616a().mo25398a("profile_badge_android_url", "");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return f152455a;
        }
    }
}
