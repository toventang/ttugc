package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ar */
public final class C38650ar {
    static {
        Covode.recordClassIndex(46191);
    }

    /* renamed from: a */
    public static boolean m78411a() {
        try {
            if (!C52912c.f121688a.f121689b.getShopping().getDisableCard().booleanValue()) {
                return true;
            }
            return false;
        } catch (C16041a unused) {
            return true;
        }
    }
}
