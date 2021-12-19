package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.aa */
public final class C64205aa {

    /* renamed from: a */
    public static Keva f145624a;

    /* renamed from: b */
    public static final C64205aa f145625b = new C64205aa();

    private C64205aa() {
    }

    static {
        Covode.recordClassIndex(75650);
        try {
            f145624a = Keva.getRepoFromSp(C17867d.m33078a(), "ProfileV2Preferences", 0);
        } catch (Throwable th) {
            C51423a.m95787a("SharedPreferencesAnnotatedManager getSP failed " + th.getMessage());
        }
    }
}
