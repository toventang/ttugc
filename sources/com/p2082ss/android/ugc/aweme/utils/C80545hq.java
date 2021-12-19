package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.utils.hq */
public final class C80545hq {

    /* renamed from: a */
    public static final boolean f180155a = false;

    /* renamed from: b */
    public static final C80545hq f180156b = new C80545hq();

    private C80545hq() {
    }

    static {
        Covode.recordClassIndex(93818);
    }

    /* renamed from: a */
    public static final boolean m139631a() {
        try {
            return SettingsManager.m29616a().mo25400a("tcm_self_apply_entry", false);
        } catch (Throwable unused) {
            return f180155a;
        }
    }
}
