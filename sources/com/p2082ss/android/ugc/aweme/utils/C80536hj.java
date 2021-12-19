package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.utils.hj */
public final class C80536hj {

    /* renamed from: a */
    public static final C80536hj f180152a = new C80536hj();

    private C80536hj() {
    }

    static {
        Covode.recordClassIndex(93809);
    }

    /* renamed from: a */
    public static C80535hi m139612a() {
        try {
            C80535hi hiVar = (C80535hi) SettingsManager.m29616a().mo25396a("disk_space_threshold", C80535hi.class);
            if (hiVar != null) {
                return hiVar;
            }
            C80535hi hiVar2 = new C80535hi();
            hiVar2.f180150a = 440;
            hiVar2.f180151b = 1370;
            return hiVar2;
        } catch (Throwable unused) {
        }
    }
}
