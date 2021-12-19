package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.api.h */
public final class C33539h {

    /* renamed from: a */
    public static final C33539h f79654a = new C33539h();

    private C33539h() {
    }

    static {
        Covode.recordClassIndex(40409);
    }

    /* renamed from: a */
    public static final boolean m68712a() {
        if (SettingsManager.m29616a().mo25394a("enable_zero_rating_workflow", 0) != 0) {
            return true;
        }
        return false;
    }
}
