package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.e */
public final class C55067e {

    /* renamed from: a */
    public static final String f126024a = "👋👋👋";

    /* renamed from: b */
    public static final C55067e f126025b = new C55067e();

    private C55067e() {
    }

    static {
        Covode.recordClassIndex(64795);
    }

    /* renamed from: a */
    public static String m100706a() {
        try {
            String a = SettingsManager.m29616a().mo25398a("im_say_hi_message", "👋👋👋");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return f126024a;
        }
    }
}
