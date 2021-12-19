package com.p2082ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.trill.setting.h */
public final class C85144h {

    /* renamed from: a */
    public static final C85144h f190497a = new C85144h();

    private C85144h() {
    }

    static {
        Covode.recordClassIndex(99184);
    }

    /* renamed from: a */
    public static boolean m146397a() {
        try {
            return SettingsManager.m29616a().mo25400a("tts_voice_option_key", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
