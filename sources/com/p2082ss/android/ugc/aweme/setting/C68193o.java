package com.p2082ss.android.ugc.aweme.setting;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;

/* renamed from: com.ss.android.ugc.aweme.setting.o */
public final class C68193o {
    static {
        Covode.recordClassIndex(80392);
    }

    /* renamed from: a */
    public static boolean m120445a() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C34593a.m70629a("aweme_app", "use_dynamic_cover", z);
    }
}
