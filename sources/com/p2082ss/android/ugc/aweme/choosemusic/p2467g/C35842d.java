package com.p2082ss.android.ugc.aweme.choosemusic.p2467g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.g.d */
public final class C35842d {

    /* renamed from: a */
    public static final boolean f84610a = true;

    /* renamed from: b */
    public static final C35842d f84611b = new C35842d();

    private C35842d() {
    }

    /* renamed from: a */
    public static boolean m73235a() {
        boolean z = f84610a;
        try {
            return SettingsManager.m29616a().mo25400a("support_local_music_optimize", true);
        } catch (Throwable unused) {
            return z;
        }
    }

    static {
        Covode.recordClassIndex(43081);
    }
}
