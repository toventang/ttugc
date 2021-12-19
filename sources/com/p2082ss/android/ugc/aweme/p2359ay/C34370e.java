package com.p2082ss.android.ugc.aweme.p2359ay;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.ay.e */
public final class C34370e {

    /* renamed from: a */
    static final boolean f81255a = Keva.getRepo("ab_repo_cold_boot").getBoolean("fresco_pie_decode_setting", false);

    /* renamed from: b */
    public static final C34370e f81256b = new C34370e();

    private C34370e() {
    }

    /* renamed from: a */
    public static final boolean m70342a() {
        return SettingsManager.m29616a().mo25400a("fresco_pie_decode", false);
    }

    static {
        Covode.recordClassIndex(41314);
    }
}
