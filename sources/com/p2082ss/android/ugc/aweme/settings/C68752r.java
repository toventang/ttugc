package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.r */
public final class C68752r {

    /* renamed from: a */
    public static final boolean f153789a = true;

    /* renamed from: b */
    public static final C68752r f153790b = new C68752r();

    private C68752r() {
    }

    /* renamed from: a */
    public static boolean m121188a() {
        try {
            return SettingsManager.m29616a().mo25400a("google_multi_login", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(81021);
    }
}
