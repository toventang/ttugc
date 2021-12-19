package com.p2082ss.android.ugc.aweme.tcm.impl.p4079d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.d.e */
public final class C77762e {

    /* renamed from: a */
    public static final TcmConfig f174384a = null;

    /* renamed from: b */
    public static final C77762e f174385b = new C77762e();

    private C77762e() {
    }

    static {
        Covode.recordClassIndex(90823);
    }

    /* renamed from: a */
    public static final TcmConfig m135852a() {
        try {
            return (TcmConfig) SettingsManager.m29616a().mo25397a("tcm_config", TcmConfig.class, f174384a);
        } catch (Exception unused) {
            return null;
        }
    }
}
