package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.i */
public final class C31652i {

    /* renamed from: a */
    public static final boolean f75714a = false;

    /* renamed from: b */
    public static final C31652i f75715b = new C31652i();

    private C31652i() {
    }

    static {
        Covode.recordClassIndex(38383);
    }

    /* renamed from: a */
    public static final boolean m65963a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_country_code_local_alpha_sort", false);
        } catch (Throwable unused) {
            return f75714a;
        }
    }
}
