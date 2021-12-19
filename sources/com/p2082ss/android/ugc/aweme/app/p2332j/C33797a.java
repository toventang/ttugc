package com.p2082ss.android.ugc.aweme.app.p2332j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.app.j.a */
public final class C33797a {

    /* renamed from: a */
    public static final boolean f80042a = false;

    /* renamed from: b */
    public static final C33797a f80043b = new C33797a();

    private C33797a() {
    }

    static {
        Covode.recordClassIndex(40694);
    }

    /* renamed from: a */
    public static boolean m69148a() {
        try {
            return SettingsManager.m29616a().mo25400a("rn_schema_seclink_switch", false);
        } catch (Throwable unused) {
            return f80042a;
        }
    }
}
