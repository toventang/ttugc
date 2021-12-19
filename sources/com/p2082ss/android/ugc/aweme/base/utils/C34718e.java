package com.p2082ss.android.ugc.aweme.base.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.base.utils.e */
public final class C34718e {
    static {
        Covode.recordClassIndex(41710);
    }

    /* renamed from: a */
    public static void m70911a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("mobile_model", Build.MODEL).mo59983a("mobile_brand", Build.BRAND).mo59983a("android_version", Build.VERSION.RELEASE).f79943a);
    }
}
