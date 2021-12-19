package com.p2082ss.android.ugc.aweme.video.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;

/* renamed from: com.ss.android.ugc.aweme.video.util.a */
public final class C81075a {
    static {
        Covode.recordClassIndex(94397);
    }

    /* renamed from: a */
    public static boolean m140765a() {
        if (!SharePrefCache.inst().getVideoPreload().mo59941c().booleanValue()) {
            return false;
        }
        if (C51426a.m95802a(C17867d.m33078a()) || SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59941c().intValue() == 1) {
            return true;
        }
        return false;
    }
}
