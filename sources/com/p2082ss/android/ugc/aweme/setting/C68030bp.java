package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.bp */
public final class C68030bp {

    /* renamed from: a */
    public static final C68031bq f152377a = null;

    /* renamed from: b */
    public static final C68030bp f152378b = new C68030bp();

    private C68030bp() {
    }

    static {
        Covode.recordClassIndex(80226);
    }

    /* renamed from: a */
    public static C68031bq m120331a() {
        try {
            C68031bq bqVar = (C68031bq) SettingsManager.m29616a().mo25397a("profile_badge", C68031bq.class, f152377a);
            if (bqVar == null) {
                return new C68031bq();
            }
            return bqVar;
        } catch (Throwable unused) {
            return new C68031bq();
        }
    }
}
