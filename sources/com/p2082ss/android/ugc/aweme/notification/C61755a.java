package com.p2082ss.android.ugc.aweme.notification;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a */
public final class C61755a {

    /* renamed from: a */
    public static String f140144a = "";

    /* renamed from: b */
    public static final C61755a f140145b = new C61755a();

    private C61755a() {
    }

    static {
        Covode.recordClassIndex(72488);
    }

    /* renamed from: a */
    public static final String m111782a() {
        try {
            String a = SettingsManager.m29616a().mo25398a("cla_crowdsourcing_entry_image", "");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return "";
        }
    }
}
