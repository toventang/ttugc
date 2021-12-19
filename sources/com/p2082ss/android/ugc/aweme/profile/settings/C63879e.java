package com.p2082ss.android.ugc.aweme.profile.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.settings.e */
public final class C63879e {

    /* renamed from: a */
    public static final String f144808a = "";

    /* renamed from: b */
    public static final C63879e f144809b = new C63879e();

    private C63879e() {
    }

    static {
        Covode.recordClassIndex(75305);
    }

    /* renamed from: a */
    public static String m115575a() {
        String str;
        try {
            str = SettingsManager.m29616a().mo25398a("yt_aes_key", "");
        } catch (Throwable unused) {
            str = "";
        }
        C89219l.m154716b(str, "");
        return str;
    }
}
