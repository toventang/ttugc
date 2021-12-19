package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.w */
public final class C68759w {

    /* renamed from: a */
    public static final int f153803a = 30000;

    /* renamed from: b */
    public static final C68759w f153804b = new C68759w();

    private C68759w() {
    }

    /* renamed from: a */
    public static int m121191a() {
        int i = f153803a;
        try {
            return SettingsManager.m29616a().mo25394a("music_media_player_time", 30000);
        } catch (Throwable unused) {
            return i;
        }
    }

    static {
        Covode.recordClassIndex(81028);
    }
}
