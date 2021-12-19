package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.b */
public final class C58428b {
    static {
        Covode.recordClassIndex(68683);
    }

    /* renamed from: a */
    public static void m106961a() {
        Keva repo = Keva.getRepo("anr_dispatch_boost", 1);
        repo.storeBoolean("boost_enable", C16048b.m29633a().mo25421a(true, "anr_dispatch_boost", false));
        repo.storeBoolean("kitkat_enable", SettingsManager.m29616a().mo25400a("anr_dispatch_kitkat_enable", true));
    }
}
