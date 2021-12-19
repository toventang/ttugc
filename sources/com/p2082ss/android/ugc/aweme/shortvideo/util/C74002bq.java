package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bq */
public final class C74002bq {

    /* renamed from: a */
    public static final C74002bq f166092a = new C74002bq();

    private C74002bq() {
    }

    static {
        Covode.recordClassIndex(86752);
    }

    /* renamed from: a */
    public static boolean m130147a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_4k_import_benchmark", false);
        } catch (C16041a unused) {
            return false;
        }
    }
}
