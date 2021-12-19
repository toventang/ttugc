package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2560d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.b */
public final class C37822b {

    /* renamed from: a */
    public static final boolean f89306a = true;

    /* renamed from: b */
    public static final C37822b f89307b = new C37822b();

    private C37822b() {
    }

    /* renamed from: a */
    public static final boolean m76481a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_commerce_egg_monitor_log", true);
        } catch (Throwable unused) {
            return f89306a;
        }
    }

    static {
        Covode.recordClassIndex(45269);
    }
}
