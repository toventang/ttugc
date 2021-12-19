package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.x */
public final class C68760x {

    /* renamed from: a */
    public static final int f153805a = 18;

    /* renamed from: b */
    public static final C68760x f153806b = new C68760x();

    private C68760x() {
    }

    /* renamed from: a */
    public static int m121192a() {
        int i = f153805a;
        try {
            return SettingsManager.m29616a().mo25394a("music_play_retry_count_videocache", 18);
        } catch (Throwable unused) {
            return i;
        }
    }

    static {
        Covode.recordClassIndex(81029);
    }
}
