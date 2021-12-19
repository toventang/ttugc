package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.y */
public final class C68761y {

    /* renamed from: a */
    public static final int f153807a = 31457279;

    /* renamed from: b */
    public static final C68761y f153808b = new C68761y();

    private C68761y() {
    }

    /* renamed from: a */
    public static int m121193a() {
        int i = f153807a;
        try {
            return SettingsManager.m29616a().mo25394a("music_preload_size_videocache", 31457279);
        } catch (Throwable unused) {
            return i;
        }
    }

    static {
        Covode.recordClassIndex(81030);
    }
}
