package com.p2082ss.android.ugc.aweme.common.p2635g;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.common.g.a */
public final class C39120a {
    static {
        Covode.recordClassIndex(46738);
    }

    /* renamed from: a */
    public static boolean m79417a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") || TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") || Build.DEVICE.contains("generic_")) {
            return false;
        }
        return true;
    }
}
