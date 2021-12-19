package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.p */
public final class C68194p {

    /* renamed from: a */
    public static final String f152684a = "";

    /* renamed from: b */
    public static final C68194p f152685b = new C68194p();

    private C68194p() {
    }

    static {
        Covode.recordClassIndex(80393);
    }

    /* renamed from: a */
    public static final String m120446a() {
        try {
            String a = SettingsManager.m29616a().mo25398a("create_EOY_video_url", "");
            C89219l.m154716b(a, "");
            return a;
        } catch (Throwable unused) {
            return f152684a;
        }
    }
}
