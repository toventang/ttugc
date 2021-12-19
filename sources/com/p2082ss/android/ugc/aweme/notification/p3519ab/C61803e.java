package com.p2082ss.android.ugc.aweme.notification.p3519ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.notification.ab.e */
public final class C61803e {

    /* renamed from: a */
    public static final C61803e f140291a = new C61803e();

    private C61803e() {
    }

    static {
        Covode.recordClassIndex(72537);
    }

    /* renamed from: a */
    public static final boolean m111866a() {
        if (SettingsManager.m29616a().mo25394a("shop_im_permission", 0) == 1) {
            return true;
        }
        return false;
    }
}
