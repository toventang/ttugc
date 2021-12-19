package com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.a */
public final class C31312a {
    static {
        Covode.recordClassIndex(38012);
    }

    /* renamed from: a */
    public static int m65511a() {
        try {
            if ((C17867d.m33078a().getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
